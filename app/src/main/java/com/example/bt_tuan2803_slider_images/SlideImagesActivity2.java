package com.example.bt_tuan2803_slider_images;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.Arrays;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class SlideImagesActivity2 extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private Handler handler = new Handler(Looper.getMainLooper());
    private Runnable autoSlideRunnable;
    private int slideInterval = 3000; // Auto-slide interval in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_images2);

        // Find ViewPager2 and CircleIndicator3
        viewPager2 = findViewById(R.id.viewPager2);
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

        // Set custom page transformer (choose one)
        viewPager2.setPageTransformer(new DepthPageTransformer()); // or new ZoomOutPageTransformer()

        // Start auto-slide
        startAutoSlide();
    }

    // Auto-slide logic
    private void startAutoSlide() {
        autoSlideRunnable = new Runnable() {
            @Override
            public void run() {
                int nextItem = viewPager2.getCurrentItem() + 1;
                if (nextItem >= viewPager2.getAdapter().getItemCount()) {
                    nextItem = 0; // Loop back to first item
                }
                viewPager2.setCurrentItem(nextItem, true);
                handler.postDelayed(this, slideInterval);
            }
        };
        handler.postDelayed(autoSlideRunnable, slideInterval);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(autoSlideRunnable);
    }
}
