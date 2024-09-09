package com.the_surfvivors.the_surfvivors.Repository;

import com.the_surfvivors.the_surfvivors.Models.Spot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpotRepo extends JpaRepository<Spot, Long> {
}
