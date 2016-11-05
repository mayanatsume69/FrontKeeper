package com.test.testy2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost);

        final Button mainLink = (Button) findViewById(R.id.bMainLinkLost);

        mainLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(LostActivity.this, MainActivityContent.class);
                LostActivity.this.startActivity(mainIntent);

            }
        });
    }
}
