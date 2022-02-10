package space.onepantsu.chibiholder.user;

import static space.onepantsu.chibiholder.R.layout.activity_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import space.onepantsu.chibiholder.R;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    EditText etUsername, etPassword;
    TextView tvRegisterLink;

    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        tvRegisterLink = (TextView) findViewById(R.id.tvRegisterLink);

        btnLogin.setOnClickListener(this);
        tvRegisterLink.setOnClickListener(this);

        userLocalStore = new UserLocalStore(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnLogin:

                User user = new User(null, null);

                userLocalStore.storeUserData(user);
                userLocalStore.setLoggedInUser(true);

                break;

            case R.id.tvRegisterLink:
                startActivity(new Intent(this, Register.class));
                break;
        }
    }
}