package com.hotbitmapgg.nineimagesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

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
    private NineImageView nineImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(toolbar);
        nineImageView = (NineImageView) findViewById(R.id.multi_image);
        //set the picture url set
        nineImageView.setImageUrls(imageUrls);
        nineImageView.setOnClickItemListener(new NineImageView.OnClickItemListener() {
            @Override
            public void onClick(int i, ArrayList<String> url) {
               //set the picture click event,then do you have to do operation
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_number, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_number_1:
                nineImageView.setImageUrls(imageUrls.subList(0,1));
                break;
            case R.id.menu_number_2:
                nineImageView.setImageUrls(imageUrls.subList(0,2));
                break;
            case R.id.menu_number_3:
                nineImageView.setImageUrls(imageUrls.subList(0,3));
                break;
            case R.id.menu_number_4:
                nineImageView.setImageUrls(imageUrls.subList(0,4));
                break;
            case R.id.menu_number_5:
                nineImageView.setImageUrls(imageUrls.subList(0,5));
                break;
            case R.id.menu_number_6:
                nineImageView.setImageUrls(imageUrls.subList(0,6));
                break;
            case R.id.menu_number_7:
                nineImageView.setImageUrls(imageUrls.subList(0,7));
                break;
            case R.id.menu_number_8:
                nineImageView.setImageUrls(imageUrls.subList(0,8));
                break;
            case R.id.menu_number_9:
                nineImageView.setImageUrls(imageUrls.subList(0,9));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
