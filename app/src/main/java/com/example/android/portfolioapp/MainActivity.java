package com.example.android.portfolioapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

    public void displayMessage(View view) {
        System.out.println("Inside View");
        switch (view.getId()){

            case R.id.spotify_button:
                Toast.makeText(getBaseContext(), "Navigate to Spotify app!", Toast.LENGTH_SHORT).show();
            break;

            case R.id.scores_app:
                Toast.makeText(getBaseContext(), "Navigate to Scores app!", Toast.LENGTH_SHORT).show();
            break;

            case R.id.library_app:
                Toast.makeText(getBaseContext(), "Navigate to Library app!", Toast.LENGTH_SHORT).show();
            break;

            case R.id.build_bigger:
                Toast.makeText(getBaseContext(), "Navigate to Build it bigger app!", Toast.LENGTH_SHORT).show();
            break;

            case R.id.xyz_reader:
                Toast.makeText(getBaseContext(), "Navigate to XYZ reader app!", Toast.LENGTH_SHORT).show();
            break;

            case R.id.own_app:
                Toast.makeText(getBaseContext(), "Navigate to MY Own app!", Toast.LENGTH_SHORT).show();
            break;

        }
        // Do something in response to button click
    }
}
