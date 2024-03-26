package web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.dao.BuildingDao;
import web.dto.BuildingDto;
import web.mapper.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class BuildingServiceImpl implements BuildingService {

    private final BuildingDao dao;
    private final Mapper mapper;
    @Override
    public void add(BuildingDto buildingDto) {
        dao.add(mapper.transformToEntity(buildingDto));
    }

    @Override
    public List<BuildingDto> getAll() {
        return dao.getAll().stream()
                .map(mapper::transformToDto)
                .collect(Collectors.toList());
    }

}
