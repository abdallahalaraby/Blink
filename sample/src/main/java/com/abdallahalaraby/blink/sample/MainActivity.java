package com.abdallahalaraby.blink.sample;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.abdallahalaraby.blink.Screenshot;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_hello_world;
    private ImageView iv_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_hello_world = ((TextView) findViewById(R.id.tv_hello_world));
        iv_output = ((ImageView) findViewById(R.id.iv_output));

        findViewById(R.id.b_capture).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.b_capture) {
            Bitmap bitmap = Screenshot.getInstance().takeScreenshot(tv_hello_world);
            iv_output.setImageBitmap(bitmap);
        }
    }
}