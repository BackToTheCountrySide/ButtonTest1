package fi.anew.android.buttontest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton myRb, myRb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRb = (RadioButton) findViewById(R.id.radioButton7);

        myRb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, myRb.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        myRb2 = (RadioButton) findViewById(R.id.radioButton8);
        myRb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, myRb2.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
