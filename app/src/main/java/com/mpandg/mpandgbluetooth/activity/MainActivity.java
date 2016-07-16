package com.mpandg.mpandgbluetooth.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.mpandg.mpandgbluetooth.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_terminal:
                startActivity(new Intent(this, DeviceControlActivity.class));
                return true;

            case R.id.action_registration:
                startActivity(new Intent(this, RegistrationActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
