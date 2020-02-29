package com.example.qwertyuiop;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exploration_layout);

        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        final RadioButton radioButtonLondon = (RadioButton) findViewById(R.id.radioButtonLondon);
        final RadioButton radioButtonNewYork = (RadioButton) findViewById(R.id.radioButtonNewYork);
        final RadioButton radioButtonBejiring = (RadioButton) findViewById(R.id.radioButtonBejiring);
        final RadioButton radioButtonEE = (RadioButton) findViewById(R.id.radioButtonEE);

        final Button button = (Button) findViewById(R.id.button);

        final TextClock textClock = (TextClock) findViewById(R.id.time);

        final CheckBox checkBoxTransparency = (CheckBox) findViewById(R.id.checkBoxTransparency);
        final CheckBox checkBoxTint = (CheckBox) findViewById(R.id.checkBoxTint);
        final CheckBox checkBoxReSize = (CheckBox) findViewById(R.id.checkBoxReSize);

        final Switch switch1 = (Switch) findViewById(R.id.switch1);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);

        // дальше самостоятельно

        checkBoxTransparency.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    imageView.setAlpha(.1f);
                }
                else {
                    imageView.setAlpha(.1f);
                }

            }
        });

        checkBoxTint.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imageView.setColorFilter(Color.argb(100, 255, 0, 255));
                }
                else{
                    imageView.setColorFilter(Color.argb(0,0,0,0));
                }
            }
        });
        checkBoxReSize.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imageView.setScaleX(2);
                    imageView.setScaleY(2);
                }
                else {
                    imageView.setScaleY(1);
                    imageView.setScaleX(1);
                }
            }
        });

        radioGroup.clearCheck();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButtonLondon:
                        textClock.setTimeZone("Europe/London");
                        break;
                    case R.id.radioButtonBejiring:
                        textClock.setTimeZone("CST6CDT");
                        break;
                    case R.id.radioButtonNewYork:
                        textClock.setTimeZone("America/New_York");
                        break;
                    case R.id.radioButtonEE:
                        textClock.setTimeZone("Europe/Brussels");
                        break;
                }
            }
        });
    }
}
