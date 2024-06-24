package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {

    public void Receiver(){
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Debug","onReceive");

        Toast.makeText(context,"我接收到訊息了",Toast.LENGTH_SHORT).show();

    }
}
