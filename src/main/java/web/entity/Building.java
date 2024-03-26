package web.entity;

import lombok.Builder;
import lombok.Data;

@Data
public class Building {
    private static int numberCreation;

    private int id;

    private String address;

    private String title;

    public Building() {
        numberCreation++;
        this.id = numberCreation;
    }

    public Building(String address, String title) {
        numberCreation++;
        this.id = numberCreation;
        this.address = address;
        this.title = title;
    }
}
