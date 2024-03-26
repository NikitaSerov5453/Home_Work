package web.dao;

import web.entity.Building;

import java.util.List;

public interface BuildingDao {
    void add(Building building);

    List<Building> getAll();

}
