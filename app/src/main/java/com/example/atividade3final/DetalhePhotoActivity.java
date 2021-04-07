package com.example.atividade3final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.atividade3final.model.Photo;

public class DetalhePhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_photo);
        Intent intent = getIntent();
        Photo todo = intent.getParcelableExtra("objPhoto");
        TextView tv = findViewById(R.id.tvUserId);
        tv.setText("Album ID: "+todo.getAlbumId()+"");
        tv = findViewById(R.id.tvId);
        tv.setText("ID: "+todo.getId()+"");
        tv = findViewById(R.id.tvTitle);
        tv.setText(todo.getTitle()+"");
        tv = findViewById(R.id.tvBody);
        tv.setText("URL: \n"+todo.getUrl()+"");
        tv = findViewById(R.id.tvThumbnailUrl);
        tv.setText("Thumbnail: \n"+todo.getThumbnailUrl()+"");
    }
}