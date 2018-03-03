package com.example.leesnriud.uilist2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * android calenderview
 */
public class CalendarViewActivity extends AppCompatActivity {

    @BindView(R.id.calendarview)
    CalendarView calendarview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_view);
        ButterKnife.bind(this);

        calendarview.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                Toast.makeText(CalendarViewActivity.this,year+"年"+(month+1)+"月"+day+"日",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
