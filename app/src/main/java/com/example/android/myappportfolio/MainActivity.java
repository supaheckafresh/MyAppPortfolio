package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void spotifyStreamer(View v) {
        Toast.makeText(getApplicationContext(), "This button will launch my Spotify Streamer App", Toast.LENGTH_SHORT).show();
    }

    public void scoresApp(View v) {
        Toast.makeText(getApplicationContext(), "This button will launch my Scores App", Toast.LENGTH_SHORT).show();
    }

    public void libraryApp(View v) {
        Toast.makeText(getApplicationContext(), "This button will launch my Library App", Toast.LENGTH_SHORT).show();
    }

    public void buildItBigger(View v) {
        Toast.makeText(getApplicationContext(), "This button will launch my Build it Bigger App", Toast.LENGTH_SHORT).show();
    }

    public void xyzReader(View v) {
        Toast.makeText(getApplicationContext(), "This button will launch my XYZ Reader App", Toast.LENGTH_SHORT).show();
    }

    public void capstoneApp(View v) {
        Toast.makeText(getApplicationContext(), "This button will launch my Capstone App", Toast.LENGTH_SHORT).show();
    }
}
