package com.the_surfvivors.the_surfvivors.Controllers;

import com.the_surfvivors.the_surfvivors.Models.Spot;
import com.the_surfvivors.the_surfvivors.Repository.SpotRepo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class SpotController {


    private final SpotRepo spotRepo;

    public SpotController(SpotRepo spotRepo) {
        this.spotRepo = spotRepo;
    }

    @GetMapping("/Spot")
    public List<Spot> getAllSpots(){
        
    }

}
