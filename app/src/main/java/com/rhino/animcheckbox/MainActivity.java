package com.rhino.animcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.rhino.animcheckbox.view.AnimCheckBox;

public class MainActivity extends AppCompatActivity {

    private AnimCheckBox mAnimCheckBox1, mAnimCheckBox2, mAnimCheckBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAnimCheckBox1 = findViewById(R.id.AnimCheckBox1);
        mAnimCheckBox1.setOnCheckedChangeListener(new AnimCheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(AnimCheckBox buttonView, boolean isChecked, boolean fromUser) {
                Log.d("DEBUG", "isChecked = " + isChecked + ", fromUser = " + fromUser);
            }
        });

        mAnimCheckBox2 = findViewById(R.id.AnimCheckBox2);
        mAnimCheckBox2.setOnCheckedChangeListener(new AnimCheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(AnimCheckBox buttonView, boolean isChecked, boolean fromUser) {
                Log.d("DEBUG", "isChecked = " + isChecked + ", fromUser = " + fromUser);
            }
        });

        mAnimCheckBox3 = findViewById(R.id.AnimCheckBox3);
        mAnimCheckBox3.setOnCheckedChangeListener(new AnimCheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(AnimCheckBox buttonView, boolean isChecked, boolean fromUser) {
                Log.d("DEBUG", "isChecked = " + isChecked + ", fromUser = " + fromUser);
            }
        });

        findViewById(R.id.checkbox_switch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAnimCheckBox1.setChecked(!mAnimCheckBox1.isChecked(), true);
                mAnimCheckBox2.setChecked(!mAnimCheckBox2.isChecked(), true);
                mAnimCheckBox3.setChecked(!mAnimCheckBox3.isChecked(), true);
            }
        });
    }
}
