package com.alimuzaffar.sample.widgets;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.alimuzaffar.lib.widgets.AnimatedEditText;
import com.alimuzaffar.lib.widgets.TextDrawable;

public class AnimatedEditTextWidgetsActivity extends AppCompatActivity {
    private AnimatedEditText mTxtPopIn;
    private AnimatedEditText mTxtFadeIn;
    private AnimatedEditText mTxtBottomUp;
    private AnimatedEditText mTxtRightIn;
    private AnimatedEditText mTxtMiddleUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        mTxtPopIn = (AnimatedEditText) findViewById(R.id.txt_pop_in);
        mTxtFadeIn = (AnimatedEditText) findViewById(R.id.txt_fade_in);
        mTxtBottomUp = (AnimatedEditText) findViewById(R.id.txt_bottom_up);
        mTxtRightIn = (AnimatedEditText) findViewById(R.id.txt_right_in);
        mTxtMiddleUp = (AnimatedEditText) findViewById(R.id.txt_middle_up);

        EditText regular = (EditText) findViewById(R.id.txt_regular);

        if (regular != null) {
            regular.setCompoundDrawables(new TextDrawable(regular, "+61 "), null, new TextDrawable(regular, "\u2605"), null);
        }
    }

    public void onClick_clear(View view) {
        toggle(mTxtPopIn);
        toggle(mTxtFadeIn);
        toggle(mTxtBottomUp);
        toggle(mTxtRightIn);
        toggle(mTxtMiddleUp);
    }

    public void toggle(AnimatedEditText v) {
        if (TextUtils.isEmpty(v.getText())) {
            v.setText("Hello World");
        } else {
            v.setText(null);
        }
    }

}
