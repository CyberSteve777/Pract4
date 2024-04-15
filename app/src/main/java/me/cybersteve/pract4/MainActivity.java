package me.cybersteve.pract4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText Tname;
    EditText Tsurname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnNextActivity(View view) {
        Tname = findViewById(R.id.name);
        Tsurname = findViewById(R.id.surname);
        Intent intent = new Intent(this, MainActivity1.class);
        String name = Tname.getText().toString();
        String surname = Tsurname.getText().toString();
        intent.putExtra("name", name);
        intent.putExtra("surname", surname);
        startActivity(intent);
    }

}