package engineer.davidauza.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText(getString(R.string.main_text));
        textView.setTextColor(Color.GREEN);
        textView.setTextSize(45f);

        setContentView(textView);
    }
}
