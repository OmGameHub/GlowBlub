package com.pandey.glowblub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView mBlueBulb;
    private ImageView mGreenBulb;

    private long mTimeInSecond = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGreenBulb = findViewById(R.id.greenBulbImage);
        mBlueBulb = findViewById(R.id.blueBulbImage);

        // OFF blue bulb
        mBlueBulb.animate().alpha(0).setDuration(0);
    }

    public void onGreenBulb(View view)
    {
        // check is green bulb is ON
        if (mGreenBulb.getAlpha() == 1)
        {
            // message green bulb is already ON
            Toast.makeText(this, "Green bulb is already ON", Toast.LENGTH_SHORT).show();
        } else {
            // ON green bulb
            mGreenBulb.animate().alpha(1).setDuration(mTimeInSecond);

            // OFF blue bulb
            mBlueBulb.animate().alpha(0).setDuration(mTimeInSecond);
        }
    }

    public void onBlueBulb(View view)
    {
        // check is blue bulb is ON
        if (mBlueBulb.getAlpha() == 1) {
            // message blue bulb is already ON
            Toast.makeText(this, "Blue bulb is already ON", Toast.LENGTH_SHORT).show();
        } else {
            // OFF green bulb
            mGreenBulb.animate().alpha(0).setDuration(mTimeInSecond);

            // ON blue bulb
            mBlueBulb.animate().alpha(1).setDuration(mTimeInSecond);
        }
    }
}
