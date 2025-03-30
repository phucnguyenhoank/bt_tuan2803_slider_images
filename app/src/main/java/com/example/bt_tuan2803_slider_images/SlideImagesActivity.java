package com.example.bt_tuan2803_slider_images;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import me.relex.circleindicator.CircleIndicator;

public class SlideImagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_images);

        // Find the ViewPager and the CircleIndicator
        ViewPager viewPager = findViewById(R.id.viewPagerSlide);
        CircleIndicator indicator = findViewById(R.id.circleIndicator);

        // Array of image resources (replace with your own drawables)
        int[] images = {
                R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3
        };

        // Set the adapter for ViewPager
        SlideImagesAdapter adapter = new SlideImagesAdapter(this, images);
        viewPager.setAdapter(adapter);

        // Bind the indicator with ViewPager
        indicator.setViewPager(viewPager);
    }
}
