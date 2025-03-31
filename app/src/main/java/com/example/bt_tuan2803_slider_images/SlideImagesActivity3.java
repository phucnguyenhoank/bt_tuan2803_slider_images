package com.example.bt_tuan2803_slider_images;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.SliderView;

import java.util.Arrays;
import java.util.List;

public class SlideImagesActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_images3);

        SliderView sliderView = findViewById(R.id.imageSlider);

        // List of images
        List<Integer> images = Arrays.asList(
                R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3
        );

        // Set adapter
        SlideAdapter slideAdapter = new SlideAdapter(this, images);
        sliderView.setSliderAdapter(slideAdapter);

        // Auto cycle settings
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setScrollTimeInSec(3);
        sliderView.startAutoCycle();
    }
}
