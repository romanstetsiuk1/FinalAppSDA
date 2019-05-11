package com.romanstetsiuk.final_app_sda.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.format.DateTimeFormatter;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_event;

    private String theme;

    private String location;

    private DateTimeFormatter dateTimeStart;

    private DateTimeFormatter dateTimeEnd;

    public Integer getId_event() {
        return id_event;
    }

    public void setId_event(Integer id_event) {
        this.id_event = id_event;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public DateTimeFormatter getDateTimeStart() {
        return dateTimeStart;
    }

    public void setDateTimeStart(DateTimeFormatter dateTimeStart) {
        this.dateTimeStart = dateTimeStart;
    }

    public DateTimeFormatter getDateTimeEnd() {
        return dateTimeEnd;
    }

    public void setDateTimeEnd(DateTimeFormatter dateTimeEnd) {
        this.dateTimeEnd = dateTimeEnd;
    }
}
