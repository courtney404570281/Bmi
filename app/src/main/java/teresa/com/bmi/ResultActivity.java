package teresa.com.bmi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView txResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        findViews();

        float bmi = getIntent().getFloatExtra("BMI", 0);
        txResult.setText(getString(R.string.your_bmi_is) + bmi);
    }

    private void findViews() {

        txResult = findViewById(R.id.txt_result);
    }
}
