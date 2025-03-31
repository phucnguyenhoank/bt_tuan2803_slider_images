package com.example.bt_tuan2803_slider_images;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class SlideAdapter extends SliderViewAdapter<SlideAdapter.SliderHolder> {
    private final Context context;
    private final List<Integer> imageList;

    public SlideAdapter(Context context, List<Integer> imageList) {
        this.context = context;
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public SliderHolder onCreateViewHolder(@NonNull ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.slide_item, parent, false);
        return new SliderHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderHolder viewHolder, int position) {
        viewHolder.imageView.setImageResource(imageList.get(position));
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    static class SliderHolder extends ViewHolder {
        ImageView imageView;

        public SliderHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewSlide);
        }
    }
}
