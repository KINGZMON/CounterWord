package com.example.counterword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import utils.TextCounter;

public class MainActivity extends AppCompatActivity {

    private Spinner spSelectionOptions;
    private EditText textProvided;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textProvided = findViewById(R.id.textProvided);
        this.textResult = findViewById(R.id.textResult);

        this.spSelectionOptions = (Spinner) findViewById(R.id.spSelectionOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.selectionOptions, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spSelectionOptions.setAdapter(adapter);
    }

    public void onBtnCountClick(View view) {
        if(this.spSelectionOptions.getSelectedItem().toString().equals(getResources().getString(R.string.charSelection))){
            this.textResult.setText(TextCounter.getCharsCount(this.textProvided.getText().toString()) + " Characters");
        }

        if(this.spSelectionOptions.getSelectedItem().toString().equals(getResources().getString(R.string.wordSelection))){
            this.textResult.setText(TextCounter.getWordsCount(this.textProvided.getText().toString()) + " Words");
        }

        this.textProvided = findViewById(R.id.textProvided);
        String sTextProvided = textProvided.getText().toString();
        if(sTextProvided.matches("")){
            Toast.makeText(this, "You did not enter any text", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}