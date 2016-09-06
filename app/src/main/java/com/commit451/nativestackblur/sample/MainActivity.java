package com.commit451.nativestackblur.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView mImage;
    ImageView mBlurredImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImage = (ImageView) findViewById(R.id.image);
        mBlurredImage = (ImageView) findViewById(R.id.blurredImage);
        Picasso.with(this)
                .load("http://www.androidcentral.com/sites/androidcentral.com/files/styles/large/public/article_images/2014/10/lollipop-statue-2.jpg?itok=RC1ovcEz")
                .into(mImage);

        Picasso.with(this)
                .load("http://www.androidcentral.com/sites/androidcentral.com/files/styles/large/public/article_images/2014/10/lollipop-statue-2.jpg?itok=RC1ovcEz")
                .transform(new BlurTransformation(8))
                .into(mBlurredImage);
    }
}
