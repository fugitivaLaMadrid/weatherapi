package com.fugitivalamadrid.weatherapi.service.location;

import com.fugitivalamadrid.weatherapi.common.Location;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private LocationRepository locationRepository;

    private LocationService() {
        super();
        this.locationRepository = locationRepository;
    }

    public Location addLocation(Location location) {
        return locationRepository.save(location);
    }
}
