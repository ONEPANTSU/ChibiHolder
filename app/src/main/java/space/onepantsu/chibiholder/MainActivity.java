package space.onepantsu.chibiholder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import space.onepantsu.chibiholder.user.Login;
import space.onepantsu.chibiholder.user.User;
import space.onepantsu.chibiholder.user.UserLocalStore;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogout;
    EditText etName, etAge, etUsername;
    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etAge = (EditText) findViewById(R.id.etAge);


        btnLogout = (Button) findViewById(R.id.btnLogout);

        btnLogout.setOnClickListener(this);

        userLocalStore = new UserLocalStore(this);

    }

    @Override
    public void onStart() {
        super.onStart();
        if(authenticate()){
            displayUserDetails();
        }
    }

    private boolean authenticate(){
        return userLocalStore.getUserLoggedIn();
    }

    private void displayUserDetails(){
        User user = userLocalStore.getLoggedInUser();
        etUsername.setText(user.getUsername());
        etAge.setText(user.getAge() + "");
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogout:

                userLocalStore.clearUserDate();
                userLocalStore.setLoggedInUser(false);

                startActivity(new Intent(this, Login.class));
                break;
        }

    }
}