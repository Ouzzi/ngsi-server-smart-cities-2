package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.helpers.Helpers;
import server.model.Parking;
import server.model.Vehicle;
import server.rest.RestClient;
import server.service.ParkingService;

@RestController
@RequestMapping("/")
public class ClientController {


    private RestClient restClient = new RestClient();
    private final String BASE_URL = "http://localhost:8080";

    @GetMapping("/parking/{id}")
    public String getParking(@PathVariable String id) {
        try {
            String parking = restClient.getParkingData(BASE_URL + "/api/parking/"+id);
            if (parking == null) {
                return "Parking not found";
            }
           return Helpers.convertToXml(parking);
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return "Parking not found";
    }


    @GetMapping("/vehicle/{id}")
    public String getVehicle(@PathVariable String id) {
        try {
            String vehicle = restClient.getVehicleData(BASE_URL + "/api/vehicle/"+id);
            if (vehicle == null) {
                return "Vehicle not found";
            }

            return Helpers.convertToXml(vehicle);
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return "Vehicle not found";
    }
}
