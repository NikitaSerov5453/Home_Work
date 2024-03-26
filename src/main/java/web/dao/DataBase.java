package web.dao;

import lombok.*;
import web.entity.Building;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    @Getter
    private static final List<Building> buildingList = new ArrayList<>();

}
