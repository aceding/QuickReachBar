package com.ace.qrb.activity;

import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.ace.qrb.R;

public class NearbyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby);

        initViews();
    }

    private Button mBtnSave;

    private void initViews(){
        mBtnSave = (Button) findViewById(R.id.btn_save);
        mBtnSave.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                final WindowManager.LayoutParams windowLp = getWindow().getAttributes();
                ValueAnimator animator = ValueAnimator.ofInt(100, 1);
                animator.setDuration(5000);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        int value = (int) animation.getAnimatedValue();
                        windowLp.width = value;
                        windowLp.height = value;
                        getWindow().setAttributes(windowLp);
                    }
                });
                animator.start();
            }
        });
    }
}
