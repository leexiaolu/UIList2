package com.example.leesnriud.uilist2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TimePicker;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * android timapicker
 */
public class TimePickerActivity extends AppCompatActivity {

    @BindView(R.id.timepicker)
    TimePicker timepicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        ButterKnife.bind(this);
        timepicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
                Toast.makeText(TimePickerActivity.this,hour+"时"+minute+"分",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
