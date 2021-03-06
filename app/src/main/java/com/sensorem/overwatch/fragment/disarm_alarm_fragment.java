package com.sensorem.overwatch.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.sensorem.overwatch.R;

public class disarm_alarm_fragment extends DialogFragment {

    private EditText disarmFragmentHourEditText;
    private EditText disarmFragmentMinuteEditText;
    private Button disarmFragmentSaveButton;
    private Button disarmFragmentCancelButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflator, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = inflator.inflate(R.layout.activity_disarm_alarm_fragment, container, false);

        disarmFragmentHourEditText = view.findViewById(R.id.disarmFragmentHourEditText);
        disarmFragmentMinuteEditText = view.findViewById(R.id.disarmFragmentMinuteEditText);
        disarmFragmentSaveButton = view.findViewById(R.id.disarmFragmentSaveButton);
        disarmFragmentCancelButton = view.findViewById(R.id.disarmFragmentCancelButton);

        disarmFragmentCancelButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                cancelDisarmFragment();
            }
        });

        disarmFragmentSaveButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                //For the save button
            }
        });

        return view;

    }

    public void cancelDisarmFragment(){
        getDialog().dismiss();
    }

    public void saveDisarmFragment(){
        //Function to be made
        //Will save the information inputted
    }
}
