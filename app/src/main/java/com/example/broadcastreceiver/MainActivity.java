package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String FILTER_ACTION="broadcast";
    Receiver receiver=new Receiver();
    Intent intent =new Intent(FILTER_ACTION);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter=new IntentFilter();
        filter.addAction(FILTER_ACTION);
        registerReceiver(receiver,filter, Context.RECEIVER_EXPORTED);


        Log.d("Debug","註冊完畢");
    }

    @Override
    protected void onResume() {
        super.onResume();
        sendBroadcast(intent);
        Log.d("Debug","傳送訊息");
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(receiver);
        Log.d("Debug","取消註冊");
    }
}
