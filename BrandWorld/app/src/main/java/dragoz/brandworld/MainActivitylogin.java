package dragoz.brandworld;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivitylogin extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout dwer;
    private ActionBarDrawerToggle toggle;
    private FirebaseAuth firebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.TOOLBAR);
        setSupportActionBar(toolbar);
        firebase = FirebaseAuth.getInstance();
        Button logout = findViewById(R.id.btnlogout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebase.signOut();
                finish();
                startActivity(new Intent(MainActivitylogin.this, MainActivity.class));
            }
        });

        dwer = findViewById(R.id.DRAWER_LAYOUT);
        toggle = new ActionBarDrawerToggle(this, dwer,toolbar, R.string.open, R.string.close);
        toggle.setDrawerIndicatorEnabled(true);
        dwer.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        NavigationView navigationView = findViewById(R.id.NAVIGATION_VIEW);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.HOME:
                startActivity(new Intent(this, MainActivitylogin.class));
                break;
            case R.id.CLOTH:
                getSupportFragmentManager().beginTransaction().replace(R.id.FRAME_LAYOUT, new clothingactivity()).commit();
                break;
            case R.id.FOOT:
                getSupportFragmentManager().beginTransaction().replace(R.id.FRAME_LAYOUT, new footingactivity()).commit();
                break;
            case R.id.WATCH:
                getSupportFragmentManager().beginTransaction().replace(R.id.FRAME_LAYOUT, new watchinglayout()).commit();
                break;
            case R.id.WALLET:
                getSupportFragmentManager().beginTransaction().replace(R.id.FRAME_LAYOUT, new walletactivity()).commit();
                break;
            case R.id.SHARE:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.SEND:
                Toast.makeText(this, "Send", Toast.LENGTH_SHORT).show();
                break;
        }
        dwer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (dwer.isDrawerOpen(GravityCompat.START)) {
            dwer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }

    }


}

