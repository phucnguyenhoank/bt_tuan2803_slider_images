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

        // Find button and set click listener
        Button btnOpenViewFlipper = findViewById(R.id.btnOpenViewFlipper);
        btnOpenViewFlipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open ViewFlipperActivity
                Intent intent = new Intent(MainActivity.this, ViewFlipperActivity.class);
                startActivity(intent);
            }
        });
    }
}
