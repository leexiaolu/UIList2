package com.example.leesnriud.uilist2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * android togglebutton
 * <p>
 * android:disabledAlpha：设置按钮在禁用时的透明度
 * android:textOff：按钮没有被选中时显示的文字
 * android:textOn：按钮被选中时显示的文字 另外，除了这个我们还可以自己写个selector，然后设置下Background属性即可~
 * <p>
 * <p>
 * android switch
 * <p>
 * android:showText：设置on/off的时候是否显示文字,boolean
 * android:splitTrack：是否设置一个间隙，让滑块与底部图片分隔,boolean
 * android:switchMinWidth：设置开关的最小宽度
 * android:switchPadding：设置滑块内文字的间隔
 * android:switchTextAppearance：设置开关的文字外观，暂时没发现有什么用...
 * android:textOff：按钮没有被选中时显示的文字
 * android:textOn：按钮被选中时显示的文字
 * android:textStyle：文字风格，粗体，斜体写划线那些
 * android:track：底部的图片
 * android:thumb：滑块的图片
 * android:typeface：设置字体，默认支持这三种:sans, serif, monospace;
 * 除此以外还可以使用 其他字体文件(*.ttf)，
 * 首先要将字体文件保存在assets/fonts/目录下，不过需要在Java代码中设置：
 * Typeface typeFace =Typeface.createFromAsset(getAssets(),"fonts/HandmadeTypewriter.ttf");
 * textView.setTypeface(typeFace);
 */
public class ToggleActivity extends AppCompatActivity {

    @BindView(R.id.tb_togglebutton)
    ToggleButton tbTogglebutton;
    @BindView(R.id.swh)
    Switch swh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
        ButterKnife.bind(this);

        tbTogglebutton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()){
                    Toast.makeText(ToggleActivity.this,"打开",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(ToggleActivity.this,"关闭",Toast.LENGTH_SHORT).show();
                }
            }
        });

        swh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()){
                    Toast.makeText(ToggleActivity.this,"on",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(ToggleActivity.this,"off",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
