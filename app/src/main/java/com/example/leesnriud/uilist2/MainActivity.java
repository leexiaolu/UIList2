package com.example.leesnriud.uilist2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * android UI 部分组件
 */
public class MainActivity extends AppCompatActivity {

    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_ts, R.id.bt_progressbar, R.id.bt_seekbar, R.id.bt_ratingbar, R.id.bt_scrollview, R.id.bt_dt})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_ts:
                intent = new Intent(MainActivity.this,ToggleActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_progressbar:
                intent = new Intent(MainActivity.this,ProgressbarActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_seekbar:
                intent = new Intent(MainActivity.this,SeekbarActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_ratingbar:
                intent = new Intent(MainActivity.this,RatingbarActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_scrollview:
                intent = new Intent(MainActivity.this,ScrollviewActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_dt:
                intent = new Intent(MainActivity.this,DatetimeActivity.class);
                startActivity(intent);
                break;
        }
    }
}
