package com.smarttollmachine;

import android.graphics.Color;
import android.text.TextUtils;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.smarttollmachine.com.smarttollmachime.ui.FocusedTextView;

/**
 * Created by Juphome on 2017/4/11.
 */
public class FocusedTextViewManager extends SimpleViewManager<FocusedTextView> {
    private ThemedReactContext mContext;

    @Override
    public String getName() {
        return "FocusedTextView";
    }

    @Override
    protected FocusedTextView createViewInstance(ThemedReactContext reactContext) {
        mContext=reactContext;
        FocusedTextView focusedTextView = new FocusedTextView(mContext);
        focusedTextView.setText("无善无恶是心之体，有善有恶是意之动，知善知恶是良知，为善去恶是格物");
        focusedTextView.setTextColor(Color.BLUE);
        focusedTextView.setSingleLine(true);
        focusedTextView.setTextSize(20);
        focusedTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        return focusedTextView;
    }
}
