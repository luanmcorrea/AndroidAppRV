package com.example.atividade3final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.atividade3final.model.Post;
import com.example.atividade3final.model.Todo;

public class DetalhePostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_post);
        Intent intent = getIntent();
        Post todo = intent.getParcelableExtra("objPost");
        TextView tv = findViewById(R.id.tvUserId);
        tv.setText("User ID: "+todo.getUserId()+"");
        tv = findViewById(R.id.tvId);
        tv.setText("ID: "+todo.getId()+"");
        tv = findViewById(R.id.tvTitle);
        tv.setText(todo.getTitle());
        tv = findViewById(R.id.tvBody);
        tv.setText(todo.getBody());
    }
}