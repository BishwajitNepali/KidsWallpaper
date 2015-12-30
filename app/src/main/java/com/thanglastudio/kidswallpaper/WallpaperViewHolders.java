package com.thanglastudio.kidswallpaper;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Greg on 12/29/2015.
 */
public class WallpaperViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView wallpaperName;
    public ImageView wallpaperPhoto;


    public WallpaperViewHolders(View itemView) {
        super(itemView);

        wallpaperPhoto=(ImageView)itemView.findViewById(R.id.wallpaper_photo);
    }

    @Override
    public void onClick(View v) {
        Snackbar.make(v,"Clicked",Snackbar.LENGTH_LONG).show();

    }
}
