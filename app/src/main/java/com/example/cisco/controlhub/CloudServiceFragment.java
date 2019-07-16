package com.example.cisco.controlhub;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class CloudServiceFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=  inflater.inflate(R.layout.cloud_service_fragment, container, false);
        Random rand = new Random();
        EditText text = (EditText) view.findViewById(R.id.editText2);
        text.setText(rand.nextInt() + "");

        Button btn = (Button) view.findViewById(R.id.button);
     //   btn.setBackgroundColor(Color.RED);
        btn.setTextColor(Color.TRANSPARENT);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setTitle("AlertDialog");
                builder.setMessage("WebEx Control Hub Action Alert?");


                // add the buttons
                builder.setPositiveButton("Continue", null);
                builder.setNegativeButton("Cancel", null);

                // create and show the alert dialog
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
        text.setText(rand.nextInt() + "");

        return view;
    }
}
