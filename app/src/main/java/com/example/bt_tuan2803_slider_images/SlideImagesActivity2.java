package com.example.bt_tuan2803_slider_images;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.Arrays;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class SlideImagesActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_slide_images2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Find ViewPager2 and CircleIndicator3
        ViewPager2 viewPager2 = findViewById(R.id.viewPager2);
        CircleIndicator3 indicator = findViewById(R.id.circleIndicator3);

        // List of image resources
        List<Integer> images = Arrays.asList(
                R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3
        );

        // Set up adapter and ViewPager2
        SlideImagesAdapter2 adapter = new SlideImagesAdapter2(images);
        viewPager2.setAdapter(adapter);

        // Bind indicator to ViewPager2
        indicator.setViewPager(viewPager2);

        viewPager2.
    }
}