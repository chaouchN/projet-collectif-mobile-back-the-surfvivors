package com.the_surfvivors.the_surfvivors.Controllers;

import com.the_surfvivors.the_surfvivors.Exceptions.ResourceNotFoundException;
import com.the_surfvivors.the_surfvivors.Models.Spot;
import com.the_surfvivors.the_surfvivors.Repository.SpotRepo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class SpotController {


    private final SpotRepo spotRepo;

    public SpotController(SpotRepo spotRepo) {
        this.spotRepo = spotRepo;
    }

    @GetMapping("/spots")
    public List<Spot> getAllSpots(){
        return spotRepo.findAll();
        
    }

    @GetMapping("/spots/{id}")
    public Spot getSpotById(@PathVariable(value = "id")Long SpotID) throws ResourceNotFoundException {
        return spotRepo.findById(SpotID)
                .orElseThrow(() -> new ResourceNotFoundException("Spot avec ID : " + SpotID + " est inexistant"));
    }

    @DeleteMapping("/spots/{id}")
    public void deleteSpot(@PathVariable(value = "id")Long SpotID) throws ResourceNotFoundException {
        Spot spot = spotRepo.findById(SpotID)
                .orElseThrow(() -> new ResourceNotFoundException("Spot avec ID : " + SpotID + " est inexistant"));

        spotRepo.delete(spot);
    }

@PutMapping("/spots/{id}")
    public Spot updateSpot(@PathVariable(value = "id")Long SpotID,
                           @Validated @RequestBody Spot spotDetails) throws ResourceNotFoundException {
        Spot spot = spotRepo.findById(SpotID)
                .orElseThrow(() -> new ResourceNotFoundException("Spot avec ID : " + SpotID + " est inexistant"));
             spot.setBeach(spotDetails.getBeach());
             spot.setDifficulty_level(spotDetails.getDifficulty_level());
             spot.setCountry(spotDetails.getCountry());
             spot.setPhotos(spotDetails.getPhotos());

             return spotRepo.save(spot);
}

@PostMapping("/spots")
    public Spot createSpot(@Validated @RequestBody Spot spot){
        return spotRepo.save(spot);
}
}
