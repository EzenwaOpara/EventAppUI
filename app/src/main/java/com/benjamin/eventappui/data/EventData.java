package com.benjamin.eventappui.data;

/*
 * Created by OPARA BENJAMIN
 * On 5/8/2020 - 9:26 PM
 */

public class EventData {
    private String eventTitle;
    private String eventTime;
    private String eventDate;
    private String eventLocation;

    public EventData(String eventTitle, String eventTime, String eventDate, String eventLocation) {
        this.eventTitle = eventTitle;
        this.eventTime = eventTime;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }
}
