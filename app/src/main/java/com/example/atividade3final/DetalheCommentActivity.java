package com.example.atividade3final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.atividade3final.model.Comment;
import com.example.atividade3final.model.Todo;

public class DetalheCommentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_comment);
        Intent intent = getIntent();
        Comment todo = intent.getParcelableExtra("objComment");
        TextView tv = findViewById(R.id.tvPostId);
        tv.setText("Post ID: "+todo.getPostId()+"");
        tv = findViewById(R.id.tvId);
        tv.setText("ID: "+todo.getId()+"");
        tv = findViewById(R.id.tvName);
        tv.setText(todo.getName()+"");
        tv = findViewById(R.id.tvEmail);
        tv.setText(todo.getEmail()+"");
        tv = findViewById(R.id.tvBody);
        tv.setText(todo.getBody()+"");
    }
}