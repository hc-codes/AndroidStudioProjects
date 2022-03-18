package dragoz.swimingfish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gameover_activity extends AppCompatActivity {
    private Button startgameagain;
    private TextView displayscore;
    private String score;
    private int highscore;
    private int s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover_activity);
        s1= (int) getIntent().getExtras().get("Score");
        score = getIntent().getExtras().get("Score").toString();
       if (Integer.valueOf(score)>(highscore))
           highscore=s1;

        startgameagain = findViewById(R.id.TRYAGAIN);
        displayscore = findViewById(R.id.DISPLAYSCORE);
        startgameagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gameover_activity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        displayscore.setText("Highscore="+highscore+"\nScore = " + score);

    }
}
