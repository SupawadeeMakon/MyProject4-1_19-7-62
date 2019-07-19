package piw.ruts.ac.th.lab1_basic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Second extends AppCompatActivity {

    ImageButton imgGo,imgBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
/*
       // imgGo = (ImageButton) findViewById(R.id.imgNext);
       // imgBack = (ImageButton) findViewById(R.id.imgHome);

        imgGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this, login.class);
                startActivity(intent);

            }
        });


        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent(Second.this, Profile.class);
                startActivity(intentBack);

            }
        });*/
    }

}
