package com.selim.com.fragmentdialogactivity;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by mohammadselimmiah on 11/05/2016.
 */
public class MyDialogFragment extends DialogFragment {
    private static MyDialogFragment myDialogFragment;

    static MyDialogFragment newInstance() {

         myDialogFragment = new MyDialogFragment();
        return myDialogFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.hello_world, container, false);
        View tv = v.findViewById(R.id.text1);
        ((TextView)tv).setText("This is an instance of MyDialogFragment");

        Button button = (Button)v.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialogFragment.dismiss();
            }
        });
        return v;
    }
}