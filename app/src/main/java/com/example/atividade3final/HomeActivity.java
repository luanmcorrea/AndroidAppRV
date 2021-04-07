package com.example.atividade3final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.atividade3final.model.Todo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button b1 = (Button) findViewById(R.id.button4);
        Button b2 = (Button) findViewById(R.id.button5);
        Button b3 = (Button) findViewById(R.id.button6);
        Button b4 = (Button) findViewById(R.id.button7);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abreTodoActivity(v);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrePostActivity(v);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrePhotoActivity(v);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abreCommentActivity(v);
            }
        });

        Button btnGoLogin = (Button)findViewById(R.id.btnGoLogin);
        btnGoLogin.setOnClickListener(this::goLogin);

        Button btnGoSplash = (Button)findViewById(R.id.btnGoSplash);
        btnGoSplash.setOnClickListener(this::goSplash);
    }

    public void voltaSplashActivity(View view) {
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);
    }

    public void abreTodoActivity(View view) {
        Intent intent = new Intent(this, TodoActivity.class);
        startActivity(intent);
    }

    public void abrePostActivity(View view) {
        Intent intent = new Intent(this, PostActivity.class);
        startActivity(intent);
    }

    public void abreCommentActivity(View view) {
        Intent intent = new Intent(this, CommentActivity.class);
        startActivity(intent);
    }

    public void abrePhotoActivity(View view) {
        Intent intent = new Intent(this, PhotoActivity.class);
        startActivity(intent);
    }

    private void goLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    private void goSplash(View view) {
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);
    }

}