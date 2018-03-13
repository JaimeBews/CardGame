package ca.georgebrown.game2011.mymathgame;

import android.app.Activity;
import android.os.Bundle;

public class BugSmashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bug_smash);
        setContentView(new BugBounce(this));
    }
}
