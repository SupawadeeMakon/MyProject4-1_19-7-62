package piw.ruts.ac.th.lab1_basic;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Profile extends AppCompatActivity {

    //MediaPlayer MpBg; //ประกาศตัวแปรสำหรับไฟล์เสียง
    MediaPlayer mediaPlayer, mp2;
    Button BTNNext;
    EditText username,password,phone;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

       // mediaPlayer = MediaPlayer.create(this,R.raw.suoerman);
        mediaPlayer = MediaPlayer.create(this, R.raw.suoerman);
        mediaPlayer.start();
        mediaPlayer.stop();
        mediaPlayer.setLooping(true);

        mp2 = MediaPlayer.create(this, R.raw.effect_btn_long);

        username = (EditText)findViewById(R.id.editUsername);
        password = (EditText) findViewById(R.id.editPasswd);
        phone = (EditText) findViewById(R.id.editTelephone);



        //เรียกใช้งานปุ่ม
        BTNNext = (Button) findViewById(R.id.btnNext);
        BTNNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, login.class);
                //กรณีส่งข้อมูลผ่านการointent
                intent.putExtra("name",username.getText().toString());
                intent.putExtra("passwd", password.getText().toString());
                intent.putExtra("telephone", phone.getText().toString());

                mp2.start();
                startActivity(intent);
            }
        });


    }
}
