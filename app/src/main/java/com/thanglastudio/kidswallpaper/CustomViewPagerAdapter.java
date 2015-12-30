package com.thanglastudio.kidswallpaper;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

/**
 * Created by Bishwajit Nepali on 12/29/2015.
 */
public class CustomViewPagerAdapter extends PagerAdapter{

    Context mContext;
    LayoutInflater mLayoutInflater;
    int[] mResources = {
            R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,
            R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten,R.drawable.eleven,R.drawable.twelve
    };


    public CustomViewPagerAdapter(Context context) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mResources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.pager_item, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
       // imageView.setImageResource(mResources[position]);
        Picasso.with(mContext).load(mResources[position]).centerCrop().fit().into(imageView);
        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
