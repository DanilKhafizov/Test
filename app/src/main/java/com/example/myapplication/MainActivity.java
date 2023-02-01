package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstraintLayout constraintlayout = new ConstraintLayout(this);
        TextView textView = new TextView(this);
        textView.setBackgroundColor(310062);
        textView.setTextColor(310062);
        textView.setAllCaps(true);
        textView.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        textView.setText("Hello Android");
        textView.setTypeface(Typeface.create("casual", Typeface.NORMAL));
        textView.setTextSize(26);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
                (
                        ConstraintLayout.LayoutParams.WRAP_CONTENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT
                );
        layoutParams.leftToLeft =
                ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        textView.setLayoutParams(layoutParams);
        constraintlayout.addView(textView);
        setContentView(R.layout.activity_main);



    }
}