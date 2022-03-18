package dragoz.brandworld;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView info;
    private Button Login;
    private int counter = 5;
    private TextView regis;
    private FirebaseAuth firebase;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainlogin);

        Name = (EditText) findViewById(R.id.nam);
        Password = (EditText) findViewById(R.id.passw);
        info = (TextView) findViewById(R.id.textView);
        Login = (Button) findViewById(R.id.button);
        regis = (TextView) findViewById(R.id.NEW_USER);

        info.setText("Number of Attempts remaining: 5");
        firebase = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);
        FirebaseUser user = firebase.getCurrentUser();
        if (user != null) {
            finish();
            startActivity(new Intent(MainActivity.this, MainActivitylogin.class));
        }

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, registractionactivity.class));
            }
        });
    }

    private void validate(String username, String userpassword) {
        progressDialog.setMessage("please Wait");
        firebase.signInWithEmailAndPassword(username, userpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    progressDialog.dismiss();
                    Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, MainActivitylogin.class));
                } else {
                    counter--;
                    progressDialog.dismiss();
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    info.setText("Number of attempts remaining: " + String.valueOf(counter));
                    if (counter == 0) {
                        Login.setEnabled(false);
                    }
                }

            }
        });


    }

}
