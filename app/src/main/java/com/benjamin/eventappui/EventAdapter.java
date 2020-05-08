package com.benjamin.eventappui;

/*
 * Created by OPARA BENJAMIN
 * On 5/8/2020 - 9:30 PM
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EventAdapter extends ArrayAdapter<EventData> {
    public EventAdapter(@NonNull Context context, @NonNull List<EventData> events) {
        super(context, 0, events);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        EventData currentEventData = getItem(position);

        View view = convertView;
        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.event_list, parent, false);
        }
        TextView titleTV = view.findViewById(R.id.title_tv);
        TextView dateTV = view.findViewById(R.id.date_tv);
        TextView timeTV = view.findViewById(R.id.time_tv);
        TextView locationTV = view.findViewById(R.id.location_tv);

        titleTV.setText(currentEventData.getEventTitle());
        timeTV.setText(" " + currentEventData.getEventTime());
        dateTV.setText(" " + currentEventData.getEventDate());
        locationTV.setText(currentEventData.getEventLocation());

        return view;
    }
}
