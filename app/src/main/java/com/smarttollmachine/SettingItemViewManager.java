package com.smarttollmachine;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.smarttollmachine.com.smarttollmachime.ui.SettingItemView;

/**
 * Created by Juphome on 2017/4/11.
 */
public class SettingItemViewManager extends SimpleViewManager<SettingItemView> {
    private ThemedReactContext mContext;
    @Override
    public String getName() {
        return "SettingItemView";
    }

    @Override
    protected SettingItemView createViewInstance(ThemedReactContext reactContext) {
        mContext=reactContext;
        SettingItemView itemView = new SettingItemView(mContext);
        itemView.setDesc("rn我是描述信息");
        itemView.setTitle("rn我的标题");


        return itemView;
    }
    @ReactProp(name = "desc")
    public void setDesc(SettingItemView view,String desc){
        view.setDesc(desc);
    }

    @ReactProp(name = "title")
    public void setTitle(SettingItemView view,String title){
        view.setTitle(title);
    }

    @ReactProp(name = "isChecked")
    public void setChecked(SettingItemView view,boolean isChecked){
        view.setChecked(isChecked);
    }
}
