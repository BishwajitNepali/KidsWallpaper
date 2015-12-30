package com.thanglastudio.kidswallpaper;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.lid.lib.LabelView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   // private StaggeredGridLayoutManager staggeredGridLayoutManager;

    private RecyclerView.Adapter mAdapter;
    private CustomViewPagerAdapter customViewPagerAdapter;
    ViewPager mViewPager;

    int[] images={ R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,
            R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten,R.drawable.eleven,R.drawable.twelve};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
      /*  RecyclerView recyclerView=(RecyclerView)findViewById(R.id.imageList);
        recyclerView.setHasFixedSize(true);*/
       /* LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

       // staggeredGridLayoutManager= new StaggeredGridLayoutManager(1,1);
        recyclerView.setLayoutManager(layoutManager);

        List<ItemObjects> gaggeredList = getListItemData();

        mAdapter = new RecyclerViewAdapter( gaggeredList,MainActivity.this);
        recyclerView.setAdapter(mAdapter);*/

        customViewPagerAdapter = new CustomViewPagerAdapter(this);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(customViewPagerAdapter);

    }

   /* private List<ItemObjects> getListItemData() {

        List<ItemObjects> listViewItems = new ArrayList<ItemObjects>();
        listViewItems.add(new ItemObjects( images[0]));
        listViewItems.add(new ItemObjects( images[1]));
        listViewItems.add(new ItemObjects( images[2]));
        listViewItems.add(new ItemObjects( images[3]));

        listViewItems.add(new ItemObjects( images[4]));
        listViewItems.add(new ItemObjects( images[5]));
        listViewItems.add(new ItemObjects( images[6]));
        listViewItems.add(new ItemObjects( images[7]));

        listViewItems.add(new ItemObjects( images[8]));
        listViewItems.add(new ItemObjects(images[9]));
        listViewItems.add(new ItemObjects( images[10]));
        listViewItems.add(new ItemObjects( images[11]));

        return listViewItems;
    }*/

   /* @Override
    protected void onResume() {
        super.onResume();
        ((RecyclerViewAdapter) mAdapter).setOnItemClickListener(new RecyclerViewAdapter.MyClickListener() {
            @Override
            public void onItemClick(final int position, View v) {
                //Toast.makeText(MainActivity.this,"Clicked on Item " + position,Toast.LENGTH_SHORT).show();


                Button setWallpaper= (Button)findViewById(R.id.setwallpaper);
                setWallpaper.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {

                        if(view == null){
                            Toast.makeText(MainActivity.this,"Select Wallpaper",Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(MainActivity.this,"Wallpaper Changed Successfully!!",Toast.LENGTH_LONG).show();
                        }



                    }


                });
            }
        });

    }*/
}
