package main.controller;

import main.model.Parking;
import main.helpers.Helpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import main.service.ParkingService;

@RestController
@RequestMapping("/api")
public class ParkingController {

    @Autowired
    private ParkingService parkingService;

    @GetMapping("/parking")
    public String getParking() {
        String[][] parkingData = {
                {"parkingId", "67890"},
                {"status", "occupied"}
        };
        return Helpers.createNgsiJsonToken(parkingData);
    }

    @GetMapping("/parking/{id}")
    public String getParking(@PathVariable String id) {
        try {
            Parking parking = parkingService.getParkingStatus(id);
            if (parking == null) {
                return "Parking not found";
            }

            String[][] parkingData = {
                    {"id", parking.getId()},
                    {"name", parking.getName()},
                    {"geometryType", parking.getGeometryType()},
                    {"availableSpotNumber", parking.getAvailableSpotNumber().toString()},
                    {"availableSpotObservedAt", parking.getAvailableSpotObservedAt().toString()},
                    {"availableSpotReliability", parking.getAvailableSpotReliability().toString()},
                    {"locationCoordinatesX", parking.getLocationCoordinatesX().toString()},
                    {"locationCoordinatesY", parking.getLocationCoordinatesY().toString()},
                    {"totalSpotNumber", parking.getTotalSpotNumber().toString()},
            };

           return Helpers.createNgsiJsonToken(parkingData);
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return "Parking not found";
    }

}
