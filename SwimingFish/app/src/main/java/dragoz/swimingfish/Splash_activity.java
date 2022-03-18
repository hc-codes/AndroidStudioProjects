package dragoz.swimingfish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Splash_activity extends AppCompatActivity {



    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activity);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {
                run();
            }
        });

    }



    public void run() {

       Intent intent =new Intent(Splash_activity.this,MainActivity.class);
       startActivity(intent);
    }

}

