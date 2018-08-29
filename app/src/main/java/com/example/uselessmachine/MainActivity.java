package com.example.uselessmachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button button_self_destruct;
    private Switch switch_useless;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
    }


    private void setListeners() {
        //TODO switch
        //TODO self destruct button

        switch_useless.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean checked) {
                if(checked){
                    Toast.makeText(MainActivity.this, "WAW DIS IS CHEKD", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Dis Off now lel", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    private void wireWidgets() {
        switch_useless = findViewById(R.id.switch_main_useless);
        button_self_destruct = findViewById(R.id.button_main_self_destruct);
    }

}
