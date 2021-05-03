package com.example.reverseword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse extends AppCompatActivity {
    String[] wordList;
    String reverse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);

        TextView textView = findViewById(R.id.listOfWords);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        wordList = message.split("\n", message.length());
        StringBuilder reverser = new StringBuilder();
        for (int i = wordList.length-1; -1 < i; i--){
            reverser.append(wordList[i] + "\n");
        }

        reverser.reverse();
        textView.setText(reverser);

    }
}