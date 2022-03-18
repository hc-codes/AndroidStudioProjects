package technoclubsolutions.padippicom;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    private AdView adview, adview1, adview2;
    private Button join, techer;
    private ImageButton b1;

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        b1 = findViewById(R.id.img1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, YearActivity.class);
                startActivity(intent);



            }
        });







//        TextView lnk3 = findViewById(R.id.pdpi);
//        lnk3.setMovementMethod(LinkMovementMethod.getInstance());
//        MobileAds.initialize(this,
//                "ca-app-pub-1703746112659578~1095769370");
//        adview = findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        adview.loadAd(adRequest);
//        adview1 = findViewById(R.id.adView1);
//        AdRequest adRequest1 = new AdRequest.Builder().build();
//        adview1.loadAd(adRequest1);
//        adview2 = findViewById(R.id.adView2);
//        AdRequest adRequest2 = new AdRequest.Builder().build();
//        adview2.loadAd(adRequest2);
//        join = findViewById(R.id.button1);
//        join.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, joinus.class));
//            }
//        });
//        techer = findViewById(R.id.button);
//        techer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, teacher.class));
//            }
//        });
        }
    }
