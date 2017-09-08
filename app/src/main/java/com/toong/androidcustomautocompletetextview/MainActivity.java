package com.toong.androidcustomautocompletetextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(this, R.layout.custom_layout, R.id.text_title, COUNTRIES);
AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.countries_list);
textView.setAdapter(adapter);
    }

    private static final String[] COUNTRIES = new String[] {
            "Belgium", "France", "France 2", "Italy", "Germany", "Spain"
    };
}
