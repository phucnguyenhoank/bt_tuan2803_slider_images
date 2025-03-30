package com.example.bt_tuan2803_slider_images;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ViewFlipperActivity extends AppCompatActivity {
    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view_flipper);

        // Find the ViewFlipper in the layout
        viewFlipper = findViewById(R.id.viewFlipperMain);

        // Array of drawable image resources
        int[] images = {
                R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3
        };

        // Dynamically add images to the ViewFlipper
        for (int image : images) {
            ImageView imageView = new ImageView(this);
            imageView.setBackgroundResource(image);
            viewFlipper.addView(imageView);
        }

        // Set the flip interval (in milliseconds)
        viewFlipper.setFlipInterval(3000); // 3 seconds per image
        viewFlipper.setAutoStart(true);

        // Set the animations for in and out transitions
        viewFlipper.setInAnimation(this, R.anim.slide_in_right);
        viewFlipper.setOutAnimation(this, R.anim.slide_out_right);
    }
}