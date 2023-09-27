package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.google.android.material.snackbar.Snackbar;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_constraint);

        TextView textView = findViewById(R.id.firstText);
        EditText editText = findViewById(R.id.editText);
        Button btn = findViewById(R.id.button3);
        CheckBox checkBox = findViewById(R.id.check);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String updatedText = editText.getText().toString();
                textView.setText(updatedText);
                String toastMessage = getResources().getString(R.string.toast_message);
                Toast.makeText(MainActivity.this, toastMessage, Toast.LENGTH_SHORT).show();
            }
        });

        checkBox.setChecked(true);


        checkBox.setOnCheckedChangeListener((cb, isChecked) -> {
            String status = isChecked ? " on" : " off";
            String message = getString(R.string.checkbox_is_now) + status;

            Snackbar snackbar = Snackbar.make(cb, message, Snackbar.LENGTH_LONG);
            snackbar.setAction(getString(R.string.undo), new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkBox.setChecked(!isChecked);
                }
            });
            snackbar.show();
        });



        String checkboxStatus = getString(R.string.checkbox_status);
        String Undo = getString(R.string.undo);
        String on = getString(R.string.on);
        String off = getString(R.string.off);










    }
}