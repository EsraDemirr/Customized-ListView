package com.example.esra.ozellistview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    final List<User> kisiler = new ArrayList<User>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kisiler.add(new User("Ali YILMAZ",false));
        kisiler.add(new User("Ayşe KAYA",true));
        kisiler.add(new User("Esra DEMIR",true));

        final ListView listView =(ListView) findViewById(R.id.liste);
        CustomAdapter adapter = new CustomAdapter(this,kisiler);
        listView.setAdapter(adapter);
    }
}
