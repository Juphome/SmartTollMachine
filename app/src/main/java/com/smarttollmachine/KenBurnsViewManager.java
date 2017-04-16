package com.smarttollmachine;

import android.graphics.drawable.Drawable;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.flaviofaria.kenburnsview.KenBurnsView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Juphome on 2017/4/9.
 */
public class KenBurnsViewManager extends SimpleViewManager<KenBurnsView> {
    private ThemedReactContext mContext;
    @Override
    public String getName() {
        return "KenBurnsView";
    }

    @Override
    protected KenBurnsView createViewInstance(ThemedReactContext themedReactContext) {
        mContext=themedReactContext;
        KenBurnsView kenBurnsView = new KenBurnsView(mContext);
        try {
            InputStream inputStream = mContext.getAssets().open("country.jpg");
            Drawable drawable = Drawable.createFromStream(inputStream, null);
            kenBurnsView.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return kenBurnsView;
    }
    @ReactProp(name = "imgSource")
    public void setSource(KenBurnsView view,String source){
        try {
            InputStream inputStream = mContext.getAssets().open(source);
            Drawable drawable = Drawable.createFromStream(inputStream, null);
            view.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
