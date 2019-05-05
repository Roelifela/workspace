package br.com.digitalhose.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextEmail;
    EditText editTextSenha;
    Button btnLogin;
    TextView mensagemValida;

    public void validaCampo(String Valor){
        if(editTextEmail.getText().toString().isEmpty()){
            mensagemValida.setText("CAMPO VAZIO");
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextSenha = findViewById(R.id.editTextSenha);
        btnLogin = findViewById(R.id.btnLogin);


    }
}
