package com.example.ermal.einzelbeispielse2;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button checkP;
    EditText insertWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkP =(Button) findViewById(R.id.button);
        insertWord= (EditText) findViewById(R.id.editText2);


        checkP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = insertWord.getText().toString();

                if (isEmpty(str)) {
                    Toast.makeText(MainActivity.this, "Write Something first", Toast.LENGTH_LONG).show();
                } else {
                     if(str.trim().length()< 5){
                        Toast.makeText(MainActivity.this, "The minimal word length is 5", Toast.LENGTH_LONG).show();
                     }else {
                        if (!isPalindrome(str.trim())) {
                            Toast.makeText(MainActivity.this, "Is Not palindrome", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(MainActivity.this, "Is Palindrome", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
        });

    }

    private boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    private boolean isEmpty(String etText) {
        if (etText.trim().length() > 0)
            return false;

        return true;
    }

}
