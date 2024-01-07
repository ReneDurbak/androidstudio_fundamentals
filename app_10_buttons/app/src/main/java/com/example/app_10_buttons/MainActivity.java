package com.example.app_10_buttons;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btClick1;
    private Button btClick2;
    private TextView tvHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHelloWorld = findViewById(R.id.tv_hello_world);
        btClick1 = findViewById(R.id.bt_click_1);
        btClick2 = findViewById(R.id.bt_click_2);

        btClick1.setOnClickListener(new Click());
        btClick2.setOnClickListener(new Click());
    }

    class Click implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            if(view.equals(btClick1)){
                tvHelloWorld.setText(R.string.tv_cauko);
            }else{
                tvHelloWorld.setText(R.string.tv_ahoj);
            }
        }
    }
}