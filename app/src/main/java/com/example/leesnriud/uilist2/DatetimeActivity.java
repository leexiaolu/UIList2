package com.example.leesnriud.uilist2;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Chronometer;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * android date time
 */
public class DatetimeActivity extends AppCompatActivity implements Chronometer.OnChronometerTickListener{

    @BindView(R.id.chronometer)
    Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datetime);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnStart, R.id.btnStop, R.id.btnReset, R.id.btn_format})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnStart:
                chronometer.start();
                break;
            case R.id.btnStop:
                chronometer.stop();
                break;
            case R.id.btnReset:
                chronometer.setBase(SystemClock.elapsedRealtime());
                break;
            case R.id.btn_format:
                chronometer.setFormat("Time：%s");
                break;
        }
    }

    @Override
    public void onChronometerTick(Chronometer chronometer) {
        String time = chronometer.getText().toString();
        if(time.equals("00:00")){
            Toast.makeText(DatetimeActivity.this,"时间到了~",Toast.LENGTH_SHORT).show();
        }
    }

}
