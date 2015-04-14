package edu.washington.humzam.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import static android.util.Log.*;

public class MainActivity extends ActionBarActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i(TAG, "onCreate event fired");
        if (savedInstanceState != null) {
            i(TAG, savedInstanceState.toString());
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        i(TAG, "onStart event fired");
    }

    @Override
    protected void onStop() {
        super.onStop();
        i(TAG, "onStop event fired");
    }

    @Override
    protected void onResume() {
        super.onResume();
        i(TAG, "onResume event fired");
    }

    @Override
    protected void onPause() {
        super.onPause();
        i(TAG, "onPause event fired");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        i(TAG, "onRestart event fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        e(TAG, "We're going down, Captain!");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
