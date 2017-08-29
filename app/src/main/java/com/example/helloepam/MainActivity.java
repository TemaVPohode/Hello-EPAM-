package com.example.helloepam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_hello:
                if (toast != null) {
                    toast.cancel();
                }
                toast = Toast.makeText(getBaseContext(), getString(R.string._hello_toast), Toast.LENGTH_SHORT);
                toast.show();
        }
    }
}
