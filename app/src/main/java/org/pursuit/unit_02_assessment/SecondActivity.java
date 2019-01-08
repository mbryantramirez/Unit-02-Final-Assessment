package org.pursuit.unit_02_assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private String getIntentString;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getIntentString = getIntent().getStringExtra("result");

        textView = findViewById(R.id.second_textView);
        textView.setText(getIntentString);

    }

    /**
     *  SecondActivity is missing onSavedInstanceState
     */
}
