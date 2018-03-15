package ca.georgebrown.game2011.mymathgame;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();


        Button playButtonVariable = (Button) findViewById(R.id.playButton);
        PlayButtonListener playListenerVariable = new PlayButtonListener();
        playButtonVariable.setOnClickListener(playListenerVariable);

        Button quit = (Button) findViewById(R.id.quitButton);
        ButtonListener quitListener = new ButtonListener();
        quit.setOnClickListener(quitListener);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    @Override
    protected void onRestart() {
        super.onRestart();

    }

    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            finish();
        }
    }

    private void startPlay() {
        Intent intentInstance = new Intent(getApplicationContext(), PlayActivity.class);
        startActivity(intentInstance);
    }

    private class PlayButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            startPlay();
        }
    }
}
