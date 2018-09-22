package teresa.com.bmi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edWeight;
    private EditText edHeight;
    private TextView result;
    private Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

    }

    private void findViews() {
        edWeight = findViewById(R.id.edt_weight);
        edHeight = findViewById(R.id.edt_height);
        result = findViewById(R.id.txt_result);
        help = findViewById(R.id.btn_help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle(R.string.help)
                        .setMessage(R.string.bmi_info)
                        .setPositiveButton(R.string.ok, null)
                        .show();
            }
        });
    }


    public void bmi(View view){
        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight / (height * height);
        Log.d("MainActivity", getString(R.string.your_bmi_is) + bmi);
        Toast.makeText(this , getString(R.string.your_bmi_is) + bmi, Toast.LENGTH_LONG).show();
        result.setText(getString(R.string.your_bmi_is) + bmi);
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("BMI", bmi);
        startActivity(intent);
        /*new AlertDialog.Builder(this)
                .setTitle(R.string.bmi)
                .setMessage(getString(R.string.your_bmi_is)+ bmi)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        edHeight.setText("");
                        edWeight.setText("");
                    }
                })
                .show();*/
    }
}
