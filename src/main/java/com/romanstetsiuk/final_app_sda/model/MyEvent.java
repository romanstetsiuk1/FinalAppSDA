package com.romanstetsiuk.final_app_sda.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;


@Document
public class MyEvent {

    @Id
    private String Id;

    private String theme;
    private String location;

    public MyEvent() {
    }

    public MyEvent(String id, String theme, String location) {
        Id = id;
        this.theme = theme;
        this.location = location;
    }

    public String getId() {
        return Id;
    }

    public String getTheme() {
        return theme;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEvent myEvent = (MyEvent) o;
        return Id.equals(myEvent.Id) &&
                theme.equals(myEvent.theme) &&
                location.equals(myEvent.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, theme, location);
    }

    @Override
    public String toString() {
        return "MyEvent{" +
                "Id='" + Id + '\'' +
                ", theme='" + theme + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
