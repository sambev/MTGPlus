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

    /**
     * Add one to the life_amount view
     */
    public void addLife(View view) {
        TextView lifeView = (TextView) findViewById(R.id.life_amount);
        int lifeAmount = Integer.parseInt(lifeView.getText().toString());
        String newLifeAmount = Integer.toString(lifeAmount + 1);
        lifeView.setText(newLifeAmount);
    }

    /**
     * Remove one life from life_amount view
     */
    public void removeLife(View view) {
        TextView lifeView = (TextView) findViewById(R.id.life_amount);
        int lifeAmount = Integer.parseInt(lifeView.getText().toString());
        String newLifeAmount = Integer.toString(lifeAmount - 1);
        lifeView.setText(newLifeAmount);
    }

}
