package es.dpatrongomez.developerlife;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.suke.widget.SwitchButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final com.suke.widget.SwitchButton work = findViewById(R.id.work);
        final com.suke.widget.SwitchButton social_life = findViewById(R.id.social_life);
        final com.suke.widget.SwitchButton sleep = findViewById(R.id.sleep);

        work.setChecked(true);
        work.isChecked();
        work.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
                if (sleep.isChecked() && social_life.isChecked()) {
                    work.setChecked(false);
                }
                if (work.isChecked() && sleep.isChecked()) {
                    social_life.setChecked(false);
                }
            }
        });
        social_life.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
                if (social_life.isChecked() && sleep.isChecked()) {
                    work.setChecked(false);
                }
            }
        });
        sleep.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
                if (sleep.isChecked() && work.isChecked()) {
                    social_life.setChecked(false);
                }
            }
        });
    }
}
