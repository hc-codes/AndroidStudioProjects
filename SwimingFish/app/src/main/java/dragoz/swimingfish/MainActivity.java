package dragoz.swimingfish;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Vibrator;
import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.io.*;


public class MainActivity extends AppCompatActivity {
    private Swiming_fish_view gameView;
    private Handler handler = new Handler();
    private final static long interval = 30;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameView = new Swiming_fish_view(this);
        setContentView(gameView);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        gameView.invalidate();
                    }
                });
            }
        }, 0, interval);
    }

}





// Vibrate for 500 milliseconds

