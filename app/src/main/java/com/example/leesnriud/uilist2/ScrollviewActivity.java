package com.example.leesnriud.uilist2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * android scrollview
 *
 * scrollView.fullScroll(ScrollView.FOCUS_DOWN);滚动到底部
 * scrollView.fullScroll(ScrollView.FOCUS_UP);滚动到顶部
 *
 * 垂直方向滑块：android:scrollbarThumbVertical
 * 水平方向滑块：android:scrollbarThumbHorizontal
 *
 * android:scrollbars="none"  隐藏滑块
 *
 * 修改滚动速度 需要自己重新继承scrollview 重写
 *
 * @Override
 * public void fling(int velocityY) {
 * super.fling(velocityY / 2);    //速度变为原来的一半
 * }
 */
public class ScrollviewActivity extends AppCompatActivity {

    @BindView(R.id.tv_scroll)
    TextView tvScroll;
    @BindView(R.id.scroll)
    ScrollView scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollview);
        ButterKnife.bind(this);
        bindView();
    }

    private void bindView(){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append("呵呵 * " + i + "\n");
        }
        tvScroll.setText(sb.toString());
    }

    @OnClick({R.id.bt_top, R.id.bt_bottom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_top:
                scroll.fullScroll(ScrollView.FOCUS_UP);
                break;
            case R.id.bt_bottom:
                scroll.fullScroll(ScrollView.FOCUS_DOWN);
                break;
        }
    }
}
