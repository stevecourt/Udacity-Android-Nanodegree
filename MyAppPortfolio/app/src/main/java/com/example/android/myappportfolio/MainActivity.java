package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user touches a button
     */
    public void displayToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = null;
        int duration = Toast.LENGTH_SHORT;

        switch (view.getId()) {
            case R.id.spotify_streamer_button: text =
                    "This button will launch my spotify streamer app!";
                break;

            case R.id.scores_button: text =
                    "This button will launch my scores app!";
                break;

            case R.id.library_button: text =
                    "This button will launch my library app!";
                break;

            case R.id.build_it_bigger_button: text =
                    "This button will launch my build it bigger app!";
                break;

            case R.id.reader_button: text =
                    "This button will launch my xyz reader app!";
                break;

            case R.id.capstone_button: text =
                    "This button will launch my capstone app!";
                break;
        }
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}