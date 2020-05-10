package com.benjamin.eventappui.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.benjamin.eventappui.data.EventAdapter;
import com.benjamin.eventappui.data.EventData;
import com.benjamin.eventappui.R;

import java.util.ArrayList;

public class EventActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Events");

        FloatingActionButton floatingActionButton = findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EventActivity.this, CreateEventActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<EventData> eventData = new ArrayList<>();

        eventData.add(new EventData("ALC meet up", "09:00 AM","14/06/2020", "Heartland Tech Hub" ));
        eventData.add(new EventData("Club meeting", "2:00 PM","24/12/2020", "Town Hall" ));
        eventData.add(new EventData("Community meet up", "09:00 AM","16/06/2020", "Heartland Tech Hub" ));
        eventData.add(new EventData("GDG meet up", "10:00 AM","15/05/2020", "Mazi Tech Hub" ));
        eventData.add(new EventData("ALC meet up", "09:00 AM","14/06/2020", "Heartland Tech Hub" ));
        eventData.add(new EventData("Club meeting", "2:00 PM","24/12/2020", "Town Hall" ));
        eventData.add(new EventData("Community meet up", "09:00 AM","16/06/2020", "Heartland Tech Hub" ));
        eventData.add(new EventData("GDG meet up", "10:00 AM","15/05/2020", "Mazi Tech Hub" ));
        eventData.add(new EventData("ALC meet up", "09:00 AM","14/06/2020", "Heartland Tech Hub" ));
        eventData.add(new EventData("Club meeting", "2:00 PM","24/12/2020", "Town Hall" ));

        TextView eventCount = findViewById(R.id.event_count);
        eventCount.setText("You have " + eventData.size() + " events");

        EventAdapter adapter = new EventAdapter(EventActivity.this, eventData);
        ListView listView = findViewById(R.id.event_list_view);
        listView.setAdapter(adapter);


        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,
                toolbar, R.string.nav_open_drawer, R.string.nav_close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        Menu menu = navigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Intent intent = null;
        switch (menuItem.getItemId()){
            case R.id.nav_home:
                intent = new Intent(this, HomeActivity.class);
                break;
            case R.id.nav_team:
                intent = new Intent(this, TeamActivity.class);
                break;
            case R.id.nav_about:
                intent = new Intent(this, AboutActivity.class);
                break;
        }
        startActivity(intent);
        finish();
        return true;
    }

}
