package company.adg.civicsenseadg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button LoginButton = (Button) findViewById(R.id.LoginButton);
        LoginButton.setOnClickListener(LoginButtonListener);
    }

    public View.OnClickListener LoginButtonListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            Intent MainIntent = new Intent(LoginActivity.this, HomePActivity.class);
            startActivity(MainIntent);
        }

    };
}
