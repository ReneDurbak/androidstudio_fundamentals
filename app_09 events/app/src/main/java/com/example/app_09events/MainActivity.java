package com.example.app_09events;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etZadajText;
    private TextView tvHelloWorld;
    private Button btClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //prepojenie javy s xml

        etZadajText = findViewById(R.id.et_zadaj_text);
        tvHelloWorld = findViewById(R.id.tv_hello_world);
        btClick = findViewById(R.id.bt_click);


        btClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String text = etZadajText.getText().toString();
                //tvHelloWorld.setText((text));
                tvHelloWorld.setText(etZadajText.getText().toString());
            }
        });
    }
}