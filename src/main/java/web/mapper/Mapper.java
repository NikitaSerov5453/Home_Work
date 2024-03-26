package web.mapper;

import org.springframework.stereotype.Service;
import web.dto.BuildingDto;
import web.entity.Building;

@Service
public class Mapper {

    public BuildingDto transformToDto(Building building) {
        return BuildingDto.builder()
                .id(building.getId())
                .address(building.getAddress())
                .title(building.getTitle())
                .build();
    }

    public Building transformToEntity(BuildingDto buildingDto) {
        return new Building(buildingDto.getAddress(), buildingDto.getTitle());
    }
}
