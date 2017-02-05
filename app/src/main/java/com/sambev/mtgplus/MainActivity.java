package com.sambev.mtgplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addLife(View view) {
        TextView lifeView = (TextView) findViewById(R.id.life_amount);
        int lifeAmount = Integer.parseInt(lifeView.getText().toString());
        String newLifeAmount = Integer.toString(lifeAmount + 1);
        lifeView.setText(newLifeAmount);
    }
}
