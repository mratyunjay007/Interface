package com.spirit.tech.aninterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnclick=findViewById(R.id.btnclick);

        final Boxer boxer=new Boxer();

        btnclick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this,boxer.throwcross()+"good ",Toast.LENGTH_LONG).show();
            }
        });
    }
}
