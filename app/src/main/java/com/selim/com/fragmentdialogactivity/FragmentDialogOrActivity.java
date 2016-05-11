package com.selim.com.fragmentdialogactivity;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FragmentDialogOrActivity extends Activity {
    private DialogFragment mDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dialog_or_activity);

        if (savedInstanceState == null) {
            // First-time init; create fragment to embed in activity.
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            DialogFragment newFragment = MyDialogFragment.newInstance();
            ft.add(R.id.embedded, newFragment);
            ft.hide(newFragment);
            ft.commit();
        }

        // Watch for button clicks.
        Button button = (Button)findViewById(R.id.show_dialog);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                showDialog();
            }
        });
    }

    void showDialog() {
        MyDialogFragment myDialogFragment = MyDialogFragment.newInstance();
        myDialogFragment.show(getFragmentManager(), "dialog");

    }
}
