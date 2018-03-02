package com.example.leesnriud.uilist2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * android ratingbar
 * <p>
 * android:isIndicator：是否用作指示，用户无法更改，默认false
 * android:numStars：显示多少个星星，必须为整数
 * android:rating：默认评分值，必须为浮点数
 * android:stepSize： 评分每次增加的值，必须为浮点数
 */
public class RatingbarActivity extends AppCompatActivity {

    @BindView(R.id.rb_ratingbar)
    RatingBar rbRatingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingbar);
        ButterKnife.bind(this);

        rbRatingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(RatingbarActivity.this,String.valueOf(v),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
