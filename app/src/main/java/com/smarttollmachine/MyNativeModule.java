package com.smarttollmachine;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/**
 * Created by Juphome on 2017/4/5.
 */
public class MyNativeModule extends ReactContextBaseJavaModule{

    private final ReactApplicationContext mContext;

    public MyNativeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        mContext=reactContext;
    }

    @Override
    public String getName() {
        //一定要有这个名字的 在rn代码里面是需要这个名字来调用该类的方法的
        return "MyNativeModule";
    }
    @ReactMethod
    public void rnCallNative(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();


//        Intent intent = new Intent(mContext, MyActivity.class);
//
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//一定要加上这句 否则报错
//
//        mContext.startActivity(intent);


        Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        Bundle bundle = new Bundle();
        mContext.startActivityForResult(intent,1,bundle);


    }

    public void sendMsgToRn(String msg){
        //将消息msg发送给RN侧
        mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit("AndroidToRNMessage", msg);

    }
    @ReactMethod
    public void startMyActivity(){
        Intent intent = new Intent(mContext,MyActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(intent);

    }

}
