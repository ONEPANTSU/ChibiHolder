package space.onepantsu.chibiholder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import javax.xml.parsers.SAXParser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogout;
    EditText etAge, etUsername;

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
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogout:

                startActivity(new Intent(this, Login.class));
                break;
        }

    }
}