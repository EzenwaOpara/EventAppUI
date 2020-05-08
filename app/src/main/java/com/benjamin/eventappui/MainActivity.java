package com.benjamin.eventappui;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton floatingActionButton = findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateEventActivity.class);
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

        EventAdapter adapter = new EventAdapter(MainActivity.this, eventData);
        ListView listView = findViewById(R.id.event_list_view);
        listView.setAdapter(adapter);
    }


}
