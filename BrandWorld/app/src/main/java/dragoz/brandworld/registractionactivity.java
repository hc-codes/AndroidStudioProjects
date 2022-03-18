package dragoz.brandworld;

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

public class registractionactivity extends AppCompatActivity {
    private EditText username, useremail, userpassword;
    private Button regbutton;
    private TextView userlogin;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registractionactivity);
        setupUIViews();
        firebaseAuth = FirebaseAuth.getInstance();
        regbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validate()){
                    //upload to database
                    String user_email = useremail.getText().toString().trim();
                    String user_pass =  userpassword.getText().toString().trim();
                    firebaseAuth.createUserWithEmailAndPassword(user_email, user_pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(registractionactivity.this, "Registraction Successful", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(registractionactivity.this, "Registraction Successful", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
        userlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(registractionactivity.this, MainActivity.class));
            }
        });
    }
    private void setupUIViews(){
        username = findViewById(R.id.textediterusername);
        useremail = findViewById(R.id.textediteremail);
        userpassword = findViewById(R.id.editTextpass);
        regbutton = findViewById(R.id.buttonreg);
        userlogin = findViewById(R.id.textViewreg);
    }
    private boolean validate(){
        boolean result = false;
        String name = username.getText().toString();
        String passw = userpassword.getText().toString();
        String email = useremail.getText().toString();

        if (name.isEmpty() || passw.isEmpty() || email.isEmpty()){
            Toast.makeText(this, "Please enter all details", Toast.LENGTH_SHORT).show();
        }
        else {
            result = true;
        }
        return result;
    }
}
