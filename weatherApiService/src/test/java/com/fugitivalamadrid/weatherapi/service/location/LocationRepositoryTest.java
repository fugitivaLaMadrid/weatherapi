package com.fugitivalamadrid.weatherapi.service.location;

import com.fugitivalamadrid.weatherapi.common.Location;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
@ActiveProfiles("default")
class LocationRepositoryTest {

    @Autowired
    private LocationRepository locationRepository;

    @Test
    @DisplayName("Test adding a new location to the repository")
    void testAddSuccess() {
        Location location = new Location();
        location.setCode("NYC_USA");
        location.setCityName("New York City");
        location.setRegionName("New York");
        location.setCountryCode("US");
        location.setCountryName("United States");
        location.setEnabled(true);
        location.setTrashed(false);
        Location saveLocation = locationRepository.save(location);
        assertThat(saveLocation).isNotNull();
        assertThat(saveLocation.getCode()).isEqualTo("NYC_USA");

    }

}