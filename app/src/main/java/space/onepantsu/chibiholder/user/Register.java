package space.onepantsu.chibiholder.user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import space.onepantsu.chibiholder.R;

public class Register extends AppCompatActivity implements View.OnClickListener {

    Button btnRegister;
    EditText etName, etAge, etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText) findViewById(R.id.etName);
        etAge = (EditText) findViewById(R.id.etAge);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnRegister = (Button) findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnRegister:

                String username = etUsername.getText().toString();
                int age = Integer.parseInt(etAge.getText().toString());
                String password = etPassword.getText().toString();

                User registeredData = new User(username, password, age);


                break;
        }
    }
}