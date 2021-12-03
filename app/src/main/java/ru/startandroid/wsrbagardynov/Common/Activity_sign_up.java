package ru.startandroid.wsrbagardynov.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ru.startandroid.wsrbagardynov.R;

public class Activity_sign_up extends AppCompatActivity
{
    //переменные кнопок
    Button btn_registration, btn_have_an_acc;
    //переменные ввода текста
    EditText re_password_registration, password_registration, e_mail_registration, second_name, name;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //связать с элементами экрана
        //ввод текста
        re_password_registration = findViewById(R.id.re_password_registration);
        password_registration = findViewById(R.id.password_registration);
        e_mail_registration = findViewById(R.id.e_mail_registration);
        second_name = findViewById(R.id.second_name);
        name = findViewById(R.id.name);
        //кнопки
        btn_registration = findViewById(R.id.btn_registration);
        btn_have_an_acc = findViewById(R.id.btn_have_an_acc);

        btn_have_an_acc.setOnClickListener(new View.OnClickListener() 
        {
            @Override
            public void onClick(View view) 
            {
                Intent intent = new Intent(Activity_sign_up.this, Activity_sign_in.class);
                startActivity(intent);
            }
        });

        btn_registration.setOnClickListener(new View.OnClickListener() 
        {
            @Override
            public void onClick(View view) 
            {
                if(TextUtils.isEmpty(re_password_registration.getText().toString())|TextUtils.isEmpty(password_registration.getText().toString())|
                TextUtils.isEmpty(e_mail_registration.getText().toString())|TextUtils.isEmpty(second_name.getText().toString())|
                        TextUtils.isEmpty(name.getText().toString()))
                {
                    ShowAlertDialogWindow("Заполните все строки!");
                }
                else if(!password_registration.getText().toString().equals(re_password_registration.getText().toString()))
                {
                    ShowAlertDialogWindow("Пароли не совпадают!");
                }
                else
                {
                    registerUser();
                }
            }

            private void registerUser() {
            }
        });
    }
}