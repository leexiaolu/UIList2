package com.example.leesnriud.uilist2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * android datepicker
 * <p>
 * android:calendarTextColor ： 日历列表的文本的颜色
 * android:calendarViewShown：是否显示日历视图
 * android:datePickerMode：组件外观，可选值:spinner，calendar 前者效果如下，默认效果是后者
 * android:dayOfWeekBackground：顶部星期几的背景颜色
 * android:dayOfWeekTextAppearance：顶部星期几的文字颜色
 * android:endYear：去年(内容)比如2010
 * android:firstDayOfWeek：设置日历列表以星期几开头
 * android:headerBackground：整个头部的背景颜色
 * android:headerDayOfMonthTextAppearance：头部日期字体的颜色
 * android:headerMonthTextAppearance：头部月份的字体颜色
 * android:headerYearTextAppearance：头部年的字体颜色
 * android:maxDate：最大日期显示在这个日历视图mm / dd / yyyy格式
 * android:minDate：最小日期显示在这个日历视图mm / dd / yyyy格式
 * android:spinnersShown：是否显示spinner
 * android:startYear：设置第一年(内容)，比如19940年
 * android:yearListItemTextAppearance：列表的文本出现在列表中。
 * android:yearListSelectorColor：年列表选择的颜色
 */
public class DatePickerActivity extends AppCompatActivity implements DatePicker.OnDateChangedListener{

    @BindView(R.id.datepicker)
    DatePicker datepicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        ButterKnife.bind(this);
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        datepicker.init(year,month,day,this);
    }

    @Override
    public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
        Toast.makeText(DatePickerActivity.this,year+"年 "+(month + 1)+"月"+day+"日",Toast.LENGTH_SHORT).show();
    }
}
