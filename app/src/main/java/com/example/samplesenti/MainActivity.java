package com.example.samplesenti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText TextInputEditText_email, TextInputEditText_password;
    RelativeLayout RelativeLayout_Login;
    String emailOK = "123@mail.com";
    String passwordOK = "1234";

    String inputEmail = "";
    String inputPassword = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextInputEditText_email = findViewById(R.id.TextInputEditText_email);
        TextInputEditText_password = findViewById(R.id.TextInputEditText_password);
        RelativeLayout_Login = findViewById(R.id.RelativeLayout_Login);

        // 1. 값을 가져온다. - 검사 (123@mail.com / 1234) 일 경우만 로그인 버튼이 열리도록
        // 2. 클릭을 감지한다.
        // 3. 1번의 값을 다음 액티비티로 넘긴다.

        RelativeLayout_Login.setClickable(false);
        TextInputEditText_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s != null){
//                    Log.d("SENTI_MAIL", s.toString());
                    inputEmail = s.toString();
                    RelativeLayout_Login.setEnabled(validation());
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        TextInputEditText_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s != null){
//                    Log.d("SENTI_PASS", s.toString() );
                    inputPassword = s.toString();
                    RelativeLayout_Login.setEnabled(validation());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

//         클릭했을 때 동작하는 함수
        RelativeLayout_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = TextInputEditText_email.getText().toString();
                String password = TextInputEditText_password.getText().toString();

                // 클래스에서 클래스로 이동 ( 출발 액티비티 이름을 명시해줘야함, 도착 액티비티는 .java 말고 .class 사용)
                Intent intent = new Intent(MainActivity.this, LoginResultActivity.class);
                intent.putExtra("email", email);
                intent.putExtra("password", password);
                startActivity(intent);

            }
        });

    }

    public boolean validation() {
        Log.d("vali", inputEmail +" / "+ inputPassword +" = " + inputEmail.equals(emailOK) + " / " + inputPassword.equals(passwordOK));
        return inputEmail.equals(emailOK) && inputPassword.equals(passwordOK);
    }
}