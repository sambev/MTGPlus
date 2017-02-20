package com.sambev.mtgplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Counter lifeCounter = new Counter("life", 40);
    Counter commanderDeaths = new Counter("commander_deaths", 0);
    Counter experienceCounter = new Counter("experience", 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        refreshView(R.id.life_amount, lifeCounter);
        refreshView(R.id.cdeath_count, commanderDeaths);
        refreshView(R.id.experience_count, experienceCounter);
    }

    private void updateLife(TextView view, int amount) {
        int currAmount = Integer.parseInt(view.getText().toString());
        int newAmount = currAmount + amount;
        view.setText(Integer.toString(newAmount));
    }

    /**
     * Find the given view and set it's text with the given counter's text
     * @param viewId the id of the view
     * @param counter the counter object to update it with
     */
    private void refreshView(int viewId, Counter counter) {
        TextView view = (TextView) findViewById(viewId);
        view.setText(Integer.toString(counter.getCount()));
    }

    /**
     * Add one to the life_amount view
     */
    public void addLife(View view) {
        lifeCounter.add(1);
        refreshView(R.id.life_amount, lifeCounter);
    }

    /**
     * Remove one life from life_amount view
     */
    public void removeLife(View view) {
        lifeCounter.subtract(1);
        refreshView(R.id.life_amount, lifeCounter);
    }

    /**
     * Add one to the commander death count
     */
    public void addCommanderDeath(View view) {
        commanderDeaths.add(1);
        refreshView(R.id.cdeath_count, commanderDeaths);
    }

    /**
     * Remove one life from life_amount view
     */
    public void removeCommanderDeath(View view) {
        commanderDeaths.subtract(1);
        refreshView(R.id.cdeath_count, commanderDeaths);
    }

    /**
     * Add an experience counter
     */
    public void addExperience(View view) {
        experienceCounter.add(1);
        refreshView(R.id.experience_count, experienceCounter);
    }

    /**
     * Remove experience counter
     */
    public void removeExperience(View view) {
        experienceCounter.subtract(1);
        refreshView(R.id.experience_count, experienceCounter);
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

    public void viewHistory(View view) {
        Intent navToHistory = new Intent(this, HistoryActivity.class);
        startActivity(navToHistory);
    }
}
