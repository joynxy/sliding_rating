package com.example.smileydialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.smileydialog.interfaces.DialogCallback;
import com.example.smileydialog.utils.GlobalUtils;

public class MainActivity extends AppCompatActivity {
    TextView result = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.tv_result);
    }

    public void showDialog(View view) {
        //create and show the dialogbg
        GlobalUtils.showDialog(this, new DialogCallback() {
            @Override
            public void callback(String ratings) {
                result.setText(ratings);
            }
        });
    }
}