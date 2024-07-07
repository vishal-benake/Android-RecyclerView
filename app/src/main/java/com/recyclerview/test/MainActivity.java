package com.recyclerview.test;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.recyclerview.test.databinding.ActivityMainBinding;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        context = this;

        List<Models> models = new ArrayList<Models>();
        models.add(new Models("John wick","john.wick@email.com",R.drawable.a));
        models.add(new Models("Robert j","robert.j@email.com",R.drawable.b));
        models.add(new Models("James Gunn","james.gunn@email.com",R.drawable.c));
        models.add(new Models("Ricky tales","rickey.tales@email.com",R.drawable.d));
        models.add(new Models("Micky mose","mickey.mouse@email.com",R.drawable.e));
        models.add(new Models("Pick War","pick.war@email.com",R.drawable.f));
        models.add(new Models("Leg piece","leg.piece@email.com",R.drawable.g));
        models.add(new Models("Apple Mac","apple.mac@email.com",R.drawable.g));
        models.add(new Models("John wick","john.wick@email.com",R.drawable.a));
        models.add(new Models("Robert j","robert.j@email.com",R.drawable.b));
        models.add(new Models("James Gunn","james.gunn@email.com",R.drawable.c));
        models.add(new Models("Ricky tales","rickey.tales@email.com",R.drawable.d));
        models.add(new Models("Micky mose","mickey.mouse@email.com",R.drawable.e));
        models.add(new Models("Pick War","pick.war@email.com",R.drawable.f));
        models.add(new Models("Leg piece","leg.piece@email.com",R.drawable.g));
        models.add(new Models("Apple Mac","apple.mac@email.com",R.drawable.g));

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(context));
        binding.recyclerView.setAdapter(new MyAdapter(context, models));

    }
}