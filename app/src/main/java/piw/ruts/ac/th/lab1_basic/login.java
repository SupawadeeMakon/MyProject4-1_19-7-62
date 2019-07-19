package piw.ruts.ac.th.lab1_basic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class login extends AppCompatActivity {

    MediaPlayer mp1,mp2;
    TextView username,password,phone;
    Button pageGame,pageCal;
    ImageButton home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        mp2 = MediaPlayer.create(this, R.raw.effect_btn_long);
        mp1 = MediaPlayer.create(this, R.raw.effect_btn_shut);

        username = (TextView)findViewById(R.id.txtName);
        password = (TextView)findViewById(R.id.txtPassword);
        phone = (TextView)findViewById(R.id.txtPhone);

        username.setText(getIntent().getStringExtra("name"));
        password.setText(getIntent().getStringExtra("passwd"));
        phone.setText(getIntent().getStringExtra("telephone"));


        pageGame = (Button) findViewById(R.id.btnGame);
        pageCal = (Button) findViewById(R.id.btnCal);
        home = (ImageButton) findViewById(R.id.imgHome);

        pageGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, Second.class);
                mp2.start();
                startActivity(intent);
            }
        });


        pageCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, calculator.class);
                mp1.start();
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, Profile.class);
                mp2.start();
                startActivity(intent);
            }
        });

    }
}
