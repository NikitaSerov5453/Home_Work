package web.service;


import web.dto.BuildingDto;
import web.entity.Building;

import java.util.List;

public interface BuildingService {
    void add(BuildingDto buildingDto);

    List<BuildingDto> getAll();

}
