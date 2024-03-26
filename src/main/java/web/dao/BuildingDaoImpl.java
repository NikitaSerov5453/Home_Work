package web.dao;

import org.springframework.stereotype.Repository;
import web.entity.Building;

import java.util.List;

@Repository
public class BuildingDaoImpl implements BuildingDao {

    @Override
    public void add(Building building) {
        DataBase.getBuildingList().add(building);
    }

    @Override
    public List<Building> getAll() {
        return DataBase.getBuildingList();
    }

}
