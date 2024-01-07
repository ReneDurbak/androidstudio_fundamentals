package com.example.app_09_event_c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvHello;
    private Button btButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHello = findViewById(R.id.tv_hello);
        btButton = findViewById(R.id.bt_button);

        /*obluha udalost (event handler)
        1.vnorena trieda
        btButton.setOnClickListener(new Click());
         */

        /*2.anonymna trieda

         */
        btButton.setOnClickListener(new View.OnClickListener() {
            private boolean isText=true;
            @Override
            public void onClick(View view) {
                if(isText){
                    tvHello.setText(R.string.tv_bum);
                }else {
                    tvHello.setText(R.string.tv_hello);
                }
                isText=!isText;
            }
        });
    }

    /*vnorena trieda

    class Click implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            tvHello.setText("bum");
        }
    }
    */
}