package piw.ruts.ac.th.lab1_basic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //รับค่าจากหน้าcalculate
        Intent intent = getIntent();
        String Tem = intent.getExtras().getString("Tem");
        String Unit = intent.getExtras().getString("Unit");
        String Answer = intent.getExtras().getString("Answer");

        TextView textTem = (TextView) findViewById(R.id.txttemperature1);
        textTem.setText(Tem);
        textTem.setTextSize(20);

        TextView textUnit = (TextView) findViewById(R.id.txtStrTem1);
        textUnit.setText(Unit);
        textUnit.setTextSize(20);

        TextView textAnswer = (TextView) findViewById(R.id.txtResult1);
        textAnswer.setText(Answer);
        textAnswer.setTextSize(20);

    }
}
