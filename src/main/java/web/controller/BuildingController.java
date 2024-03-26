package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.dto.BuildingDto;
import web.service.BuildingService;


@Controller
@RequiredArgsConstructor
@RequestMapping("/builds")
public class BuildingController {

    private final BuildingService buildingService;


    @GetMapping()
    public String getAllBuilds(Model model) {
        model.addAttribute("builds", buildingService.getAll());
        System.out.println(buildingService.getAll());
        return "/builds";
    }

    @GetMapping("/new")
    public String getCreateNewBuildingPage(@ModelAttribute("building") BuildingDto buildingDto) {
        return "/new";
    }

    @PostMapping("/new")
    public String createNewBuilding(@ModelAttribute("building") BuildingDto buildingDto) {
        buildingService.add(buildingDto);
        return "redirect:/builds";
    }
}
