package practice.amitabh.com.androidpractice;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    int count = 0;
    int count2 = 0;
    int lcCount2 = 0;
    TextView secondTV;
    TextView firstTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout_activity);

        firstTV = (TextView) findViewById(R.id.firstTV);
        firstTV.setText("Amitabh");

        secondTV = (TextView) findViewById(R.id.secondTv);
        secondTV.setText("Ram");


        final Button clickMeBt = (Button) findViewById(R.id.clickMeBT);
        clickMeBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondTV.setText("Click Count = " + count);
                secondTV.setBackgroundColor(Color.CYAN);
//                Toast.makeText(getApplicationContext(),"I was clicked "+count,Toast.LENGTH_SHORT).show();
                count++;
            }

        });

        clickMeBt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                Toast.makeText(getApplicationContext(), "Long Click " + lcCount2, Toast.LENGTH_SHORT).show();
                lcCount2++;
                return true;
            }
        });

        firstTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstTV.setText("Click count " + count2);
                count2++;
            }
        });

    }
}
