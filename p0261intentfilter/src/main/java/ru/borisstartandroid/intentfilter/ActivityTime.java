package ru.borisstartandroid.intentfilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ActivityTime extends AppCompatActivity {
    TextView tvTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        String curTime = sdf.format(new Date(System.currentTimeMillis()));

        tvTime = findViewById(R.id.tvTime);
        tvTime.setText(curTime);

    }
}
