package server.service;

import server.model.Parking;
import server.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ParkingService {

    @Autowired
    private ParkingRepository parkingRepository;

    public Parking getParkingStatus(String id) {
        return parkingRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Parking not found"));
    }
}
