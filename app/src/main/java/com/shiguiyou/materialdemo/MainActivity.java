package com.shiguiyou.materialdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;
    CardView card1, card2, card3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getString(R.string.app_name));

        card1 = (CardView) findViewById(R.id.cardlist_1);
        card2 = (CardView) findViewById(R.id.cardlist_2);
        card3 = (CardView) findViewById(R.id.cardlist_3);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.cardlist_1) {
            Intent intent = new Intent(this, ToolbarAnimationActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.cardlist_2) {
            Intent intent = new Intent(this, TabsActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.cardlist_3) {
            Intent intent = new Intent(this, ParallaxScrollingTabsActivity.class);
            startActivity(intent);
        }
    }
}
