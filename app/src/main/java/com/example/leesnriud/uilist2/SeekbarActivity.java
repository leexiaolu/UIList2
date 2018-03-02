package com.example.leesnriud.uilist2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * android seekbar
 * <p>
 * android:max="100" //滑动条的最大值
 * android:progress="60" //滑动条的当前值
 * android:secondaryProgress="70" //二级滑动条的进度
 * android:thumb = "@mipmap/sb_icon" //滑块的drawable
 * <p>
 * SeekBar.OnSeekBarChangeListener 我们只需重写三个对应的方法
 * onProgressChanged：进度发生改变时会触发
 * onStartTrackingTouch：按住SeekBar时会触发
 * onStopTrackingTouch：放开SeekBar时触发
 */
public class SeekbarActivity extends AppCompatActivity {

    @BindView(R.id.sb_seebar)
    SeekBar sbSeebar;
    @BindView(R.id.tv_seekbar)
    TextView tvSeekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);
        ButterKnife.bind(this);
        bindView();
    }

    private void bindView(){
        sbSeebar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tvSeekbar.setText("当前进度值:" + i + "  / 100 ");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekbarActivity.this,"触碰SeekBar",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekbarActivity.this,"放开SeekBar",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
