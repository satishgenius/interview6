package com.example.interview6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bunty,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void a(MenuItem item) {
        Intent a =new Intent(MainActivity.this,MainActivity2.class);
        startActivity(a);
    }

    public void b(MenuItem item) {
        Intent b =new Intent(MainActivity.this,MainActivity3.class);
        startActivity(b);
    }

    public void c(MenuItem item) {
        Intent c =new Intent(MainActivity.this,MainActivity4.class);
        startActivity(c);

    }
}