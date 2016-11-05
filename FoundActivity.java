package com.test.testy2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_found);

        final Button mainLink2 = (Button) findViewById(R.id.bMainLinkFound);

        mainLink2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent2 = new Intent(FoundActivity.this, MainActivityContent.class);
                FoundActivity.this.startActivity(mainIntent2);
            }
        });
    }
}
