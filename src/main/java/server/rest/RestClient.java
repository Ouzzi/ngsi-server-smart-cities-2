package server.rest;

import org.jvnet.hk2.annotations.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClient {

    private final RestTemplate restTemplate = new RestTemplate();

    public String getParkingData(String url) {
        return restTemplate.getForObject(url, String.class);
    }

    public String getVehicleData(String url) {
        return restTemplate.getForObject(url, String.class);
    }
}
