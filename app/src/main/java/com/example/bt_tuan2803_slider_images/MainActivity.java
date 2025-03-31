package com.example.bt_tuan2803_slider_images;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Button for ViewFlipperActivity
        Button btnOpenViewFlipper = findViewById(R.id.btnOpenViewFlipper);
        btnOpenViewFlipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewFlipperActivity.class);
                startActivity(intent);
            }
        });

        // Button for SlideImagesActivity
        Button btnOpenSlideImages = findViewById(R.id.btnOpenSlideImages);
        btnOpenSlideImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SlideImagesActivity.class);
                startActivity(intent);
            }
        });

        // Button for SlideImagesActivity2
        Button btnOpenSlideImages2 = findViewById(R.id.btnOpenSlideImages2);
        btnOpenSlideImages2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SlideImagesActivity2.class);
            startActivity(intent);
        });

        findViewById(R.id.btnSliderView).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SlideImagesActivity3.class);
            startActivity(intent);
        });
    }
}
