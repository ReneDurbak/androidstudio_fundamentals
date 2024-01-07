package com.example.app_06;

import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a LinearLayout
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);

        // Create three columns
        LinearLayout.LayoutParams columnParams = new LinearLayout.LayoutParams(
                0, ViewGroup.LayoutParams.MATCH_PARENT, 1);

        // First Column (Top)
        TextView textTop = new TextView(this);
        textTop.setLayoutParams(columnParams);
        textTop.setText(R.string.top);
        textTop.setGravity(Gravity.TOP);

        // Second Column (Middle)
        TextView textMiddle = new TextView(this);
        textMiddle.setLayoutParams(columnParams);
        textMiddle.setText(R.string.middle);
        textMiddle.setGravity(Gravity.CENTER);

        // Third Column (Bottom)
        TextView textBottom = new TextView(this);
        textBottom.setLayoutParams(columnParams);
        textBottom.setText(R.string.bottom);
        textBottom.setGravity(Gravity.BOTTOM|Gravity.END);

        // Add elements to the LinearLayout
        linearLayout.addView(textTop);
        linearLayout.addView(textMiddle);
        linearLayout.addView(textBottom);

        // Set the LinearLayout as the content view
        setContentView(linearLayout);
    }
}
