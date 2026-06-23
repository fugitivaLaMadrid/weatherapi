package com.fugitivalamadrid.weatherapi.service.location;

import com.fugitivalamadrid.weatherapi.common.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, String> {}
