package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextUsuario;
    private EditText editTextPass;
    private Button btLogin;
    private TextView tvMensaje;
    private TextView tvCrear;
    private Button crear;
    private TextView crear_usuario;
    private TextView recuperar_pass;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);
            tvCrear = findViewById(R.id.textViewCrear);
            tvCrear.setOnClickListener(this);
            editTextUsuario = findViewById(R.id.editTextUsuario);
            editTextPass = findViewById(R.id.editTextPassword);
            btLogin = findViewById(R.id.btLogin);
            btLogin.setOnClickListener(this);
            tvMensaje = findViewById(R.id.textMensaje);
            recuperar_pass = findViewById(R.id.textViewrecuperar);
            recuperar_pass.setOnClickListener(this);

        }

    String usuario="prueba";
    String password="123";
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btLogin:
                String user = editTextUsuario.getText().toString();
                String pass = editTextPass.getText().toString();
                if(usuario.equals(user) && password.equals(pass)){
                    Intent intent = new Intent(MainActivity.this, Principal.class);
                    startActivity(intent);
                }else{
                    tvMensaje.setText("Usuario o contraseña no válidos");
                }
                break;
            case R.id.textViewCrear:{
                Intent intent = new Intent(MainActivity.this, Registro.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewrecuperar:{
                Intent intent = new Intent(MainActivity.this, Recuperar.class);
                startActivity(intent);
                break;
            }

        }
    }
}