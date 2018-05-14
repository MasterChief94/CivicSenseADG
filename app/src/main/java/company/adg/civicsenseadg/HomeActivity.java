package company.adg.civicsenseadg;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button PhotoButton = (Button) findViewById(R.id.PhotoButton);
        PhotoButton.setOnClickListener(PhotoButtonListener);
    }

    public View.OnClickListener PhotoButtonListener = new View.OnClickListener() {

        static final int REQUEST_IMAGE_CAPTURE = 1;

        @Override
        public void onClick(View v) {
            Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
            }
        }

    };

}