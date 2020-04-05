package com.example.bookpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bookpage.view.BookPageView;

public class MainActivity extends AppCompatActivity {

    private BookPageView bookPageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookPageView = (BookPageView) findViewById(R.id.view_book_page);
    }
}
