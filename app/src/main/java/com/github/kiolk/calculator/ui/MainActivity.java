package com.github.kiolk.calculator.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.github.kiolk.calculator.R;
import com.github.kiolk.calculator.utils.Calculation;

public class MainActivity extends AppCompatActivity {

    private TextView mResult;
    private EditText mCalculationInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO add some logic for setup views

        mCalculationInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //TODO need implemented
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
