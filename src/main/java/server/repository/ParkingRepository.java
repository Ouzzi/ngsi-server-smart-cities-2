package server.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.model.Parking;

import java.util.Optional;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
    Optional<Parking> findById(String id);

}
