package com.smarttollmachine.com.smarttollmachime.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.smarttollmachine.R;
/**
        * 自定义的组合控件，里面有2个textview 1个checkbox 1个view
        */
public class SettingItemView extends RelativeLayout {

    private CheckBox cb_status;
    private TextView tv_desc;
    private TextView tv_title;


    private void iniView(Context context) {

        View.inflate(context, R.layout.setting_item_view, this);
        cb_status = (CheckBox) this.findViewById(R.id.cb_status);
        tv_desc = (TextView) this.findViewById(R.id.tv_desc);
        tv_title = (TextView) this.findViewById(R.id.tv_title);

    }

    public SettingItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        iniView(context);
    }

    public SettingItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        iniView(context);
    }


    public SettingItemView(Context context) {
        super(context);
        iniView(context);
    }




    /**
     * 校验组合控件是否选中
     * @return
     */
    public boolean isChecked() {
        return cb_status.isChecked();
    }


    /**
     * 设置组合控件的状态
     * @param checked
     */
    public void setChecked(boolean checked) {
        cb_status.setChecked(checked);
    }


    /**
     * 设置组合控件的描述信息
     * @param text
     */
    public void setDesc(String text) {
        tv_desc.setText(text);
    }


    /**
     * 设置组合控件的标题
     * @param title
     */
    public void setTitle(String title){
        tv_title.setText(title);
    }


}
