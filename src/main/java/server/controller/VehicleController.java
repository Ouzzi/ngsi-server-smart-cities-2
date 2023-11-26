package server.controller;

import server.helpers.Helpers;
import server.model.Vehicle;
import server.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/vehicle")
    public String getVehicle() {
        String[][] vehicleData = {
                {"vehicleId", "12345"},
                {"status", "parked"}
        };
        return Helpers.createNgsiJsonToken(vehicleData);
    }

    @GetMapping("/vehicle/{id}")
    public String getVehicle(@PathVariable String id) {
        try {
            Vehicle vehicle = vehicleService.getVehicleStatus(id);
            if (vehicle == null) {
                return "Vehicle not found";
            }

            String[][] vehicleData = {
                    {"id", vehicle.getId()},
                    {"type", vehicle.getType()},
                    {"isParkedObject", vehicle.getIsParkedObject()},
                    {"isParkedProvidedBy", vehicle.getIsParkedProvidedBy()},
                    {"isParkedObservedAt", vehicle.getIsParkedObservedAt().toString()},
                    {"street", vehicle.getStreetFr() == null ? vehicle.getStreetNl() : vehicle.getStreetFr()},
            };

            return Helpers.createNgsiJsonToken(vehicleData);
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return "Vehicle not found";
    }
}
