package com.example.glowkitty.morgain;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.glowkitty.morgain.SentimentAnalyzer;

import org.w3c.dom.Text;

public class AppStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_start);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startAnalasys();
            }
        });
    }

    public void startAnalasys() {
        SentimentAnalyzer s = new SentimentAnalyzer();
        TextView t = (TextView) findViewById(R.id.textView);
        EditText e = (EditText) findViewById(R.id.editText);
        String ann = s.getAnnotate(e.getText().toString());
        t.setText(ann);
    }



}
