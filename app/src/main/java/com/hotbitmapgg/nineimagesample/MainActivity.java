package com.hotbitmapgg.nineimagesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hotbitmapgg.nineimagelibrary.NineImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> imageUrls = Arrays.asList(
            "https://ws1.sinaimg.cn/large/610dc034ly1fgllsthvu1j20u011in1p.jpg",
            "https://ws1.sinaimg.cn/large/610dc034ly1fgj7jho031j20u011itci.jpg",
            "https://ws1.sinaimg.cn/large/610dc034ly1fgi3vd6irmj20u011i439.jpg",
            "https://ws1.sinaimg.cn/large/610dc034ly1fgepc1lpvfj20u011i0wv.jpg",
            "https://ws1.sinaimg.cn/large/610dc034ly1fgdmpxi7erj20qy0qyjtr.jpg",
            "https://ws1.sinaimg.cn/large/610dc034ly1fgchgnfn7dj20u00uvgnj.jpg",
            "https://ws1.sinaimg.cn/large/610dc034ly1fgbbp94y9zj20u011idkf.jpg",
            "https://ws1.sinaimg.cn/large/610dc034ly1fga6auw8ycj20u00u00uw.jpg",
            "https://ws1.sinaimg.cn/large/d23c7564ly1fg7ow5jtl9j20pb0pb4gw.jpg");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NineImageView nineImageView = (NineImageView) findViewById(R.id.multi_image);
        nineImageView.setImageUrls(imageUrls);
        nineImageView.setOnClickItemListener(new NineImageView.OnClickItemListener() {
            @Override
            public void onClick(int i, ArrayList<String> url) {

            }
        });
    }
}
