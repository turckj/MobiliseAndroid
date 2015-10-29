package com.mobilise.app;

import android.app.Activity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;

import com.mobilise.rest.client.MobiliseRestClient;

import freedom.app.mobilise.R;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Setup the Rest Client
        TempDIContainer.MobiliseRestClient = new MobiliseRestClient(getString(R.string.baseUrl));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
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
