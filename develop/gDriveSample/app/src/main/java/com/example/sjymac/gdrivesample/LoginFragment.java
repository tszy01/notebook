package com.example.sjymac.gdrivesample;

import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

/**
 * Created by sjymac on 16/4/27.
 */
public class LoginFragment extends Fragment {
    public LoginFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_login, container, false);

        Button Btn1 = (Button)rootView.findViewById(R.id.btnLogin);//获取按钮资源
        Btn1.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                MainActivity activity = (MainActivity)getActivity();
                activity.connectGoogleDrive();
            }

        });
        return rootView;
    }
}
