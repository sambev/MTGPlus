package com.sambev.mtgplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void updateLife(TextView view, int amount) {
        int currAmount = Integer.parseInt(view.getText().toString());
        int newAmount = currAmount + amount;
        view.setText(Integer.toString(newAmount));
    }

    /**
     * Add one to the life_amount view
     */
    public void addLife(View view) {
        TextView lifeView = (TextView) findViewById(R.id.life_amount);
        updateLife(lifeView, 1);
    }

    /**
     * Remove one life from life_amount view
     */
    public void removeLife(View view) {
        TextView lifeView = (TextView) findViewById(R.id.life_amount);
        updateLife(lifeView, -1);
    }

    /**
     * Add one to the commander death count
     */
    public void addCommanderDeath(View view) {
        TextView commanderDeathView = (TextView) findViewById(R.id.cdeath_count);
        updateLife(commanderDeathView, 1);
    }

    /**
     * Remove one life from life_amount view
     */
    public void removeCommanderDeath(View view) {
        TextView commanderDeathView = (TextView) findViewById(R.id.cdeath_count);
        updateLife(commanderDeathView, -1);
    }

    /**
     * Add an experience counter
     */
    public void addExperience(View view) {
        TextView experienceView = (TextView) findViewById(R.id.experience_count);
        updateLife(experienceView, 1);
    }

    /**
     * Remove experience counter
     */
    public void removeExperience(View view) {
        TextView experienceView = (TextView) findViewById(R.id.experience_count);
        updateLife(experienceView, -1);
    }

    /**
     * Add an experience counter
     */
    public void addCommanderDamageOne(View view) {
        TextView commanderDamageOneView = (TextView) findViewById(R.id.commander_damage_one_count);
        updateLife(commanderDamageOneView, 1);
    }

    /**
     * Remove experience counter
     */
    public void removeCommanderDamageOne(View view) {
        TextView commanderDamageOneView = (TextView) findViewById(R.id.commander_damage_one_count);
        updateLife(commanderDamageOneView, -1);
    }
}
