package com.example.leesnriud.uilist2;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * android progressbar
 * <p>
 * android:max：进度条的最大值
 * android:progress：进度条已完成进度值
 * android:progressDrawable：设置轨道对应的Drawable对象
 * android:indeterminate：如果设置成true，则进度条不精确显示进度
 * android:indeterminateDrawable：设置不显示进度的进度条的Drawable对象
 * android:indeterminateDuration：设置不精确显示进度的持续时间
 * android:secondaryProgress：二级进度条，类似于视频播放的一条是当前播放进度，一条是缓冲进度，前者通过progress属性进行设置！
 * <p>
 * java 中方法
 * getMax()：返回这个进度条的范围的上限
 * getProgress()：返回进度
 * getSecondaryProgress()：返回次要进度
 * incrementProgressBy(int diff)：指定增加的进度
 * isIndeterminate()：指示进度条是否在不确定模式下
 * setIndeterminate(boolean indeterminate)：设置不确定模式下
 */
public class ProgressbarActivity extends AppCompatActivity {

    private AnimationDrawable ad;

    @BindView(R.id.iv_pgbar)
    ImageView ivPgbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);
        ButterKnife.bind(this);

        ad = (AnimationDrawable) ivPgbar.getDrawable();

        ivPgbar.postDelayed(new Runnable() {
            @Override
            public void run() {
                ad.start();
            }
        },100);
    }
}
