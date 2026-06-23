package com.fugitivalamadrid.weatherapi.service.location;

import com.fugitivalamadrid.weatherapi.common.Location;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1/locations")
public class LocationApiController {

    private final LocationService locationService;

    public LocationApiController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping
    public ResponseEntity<Location> addLocation(@RequestBody Location location) {
        Location addedLocation = locationService.addLocation(location);
        URI uri = URI.create("v1/locations" + location.getCode());
        return ResponseEntity.created(uri).body(addedLocation);
    }
}
