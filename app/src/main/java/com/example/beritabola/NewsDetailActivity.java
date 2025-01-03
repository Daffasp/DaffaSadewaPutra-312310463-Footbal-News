package com.example.beritabola;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.squareup.picasso.Picasso;

public class NewsDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        // Mendapatkan referensi ke tampilan UI
        TextView titleTextView = findViewById(R.id.titleTextView);
        TextView contentTextView = findViewById(R.id.contentTextView);
        ImageView newsImageView = findViewById(R.id.newsImageView);

        // Mendapatkan data dari Intent
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String content = intent.getStringExtra("content");
        String imageUrl = intent.getStringExtra("imageUrl");

        // Menampilkan data pada UI
        titleTextView.setText(title);
        contentTextView.setText(content);
        Picasso.get().load(imageUrl).into(newsImageView);
    }
}
