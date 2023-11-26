package server.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.time.LocalDateTime;


@Entity
@Table(name = "parkings")
public class Parking {

    @Id
    private String id;

    @Column(nullable = false)
    private String type;

    private String name;

    @Column(name = "geometry_type")
    private String geometryType;

    @Column(name = "geometry_coordinates_x")
    private Float geometryCoordinatesX;

    @Column(name = "geometry_coordinates_y")
    private Float geometryCoordinatesY;

    @Column(name = "property_type")
    private String propertyType;

    @Column(name = "property_name")
    private String propertyName;

    @Column(name = "available_spot_number")
    private Integer availableSpotNumber;

    @Column(name = "available_spot_observed_at")
    private LocalDateTime availableSpotObservedAt;

    @Column(name = "available_spot_reliability")
    private Float availableSpotReliability;

    @Column(name = "available_spot_provided_by")
    private String availableSpotProvidedBy;

    @Column(name = "location_coordinates_x")
    private Float locationCoordinatesX;

    @Column(name = "location_coordinates_y")
    private Float locationCoordinatesY;

    @Column(name = "total_spot_number")
    private Integer totalSpotNumber;

    @Column(name = "context")
    private String context; // Stored as a JSON string

    // Standardkonstruktor
    public Parking() {
    }

    public Parking(String id, String type, String name, String geometryType, Float geometryCoordinatesX, Float geometryCoordinatesY, String propertyType, String propertyName, Integer availableSpotNumber, LocalDateTime availableSpotObservedAt, Float availableSpotReliability, String availableSpotProvidedBy, Float locationCoordinatesX, Float locationCoordinatesY, Integer totalSpotNumber, String context) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.geometryType = geometryType;
        this.geometryCoordinatesX = geometryCoordinatesX;
        this.geometryCoordinatesY = geometryCoordinatesY;
        this.propertyType = propertyType;
        this.propertyName = propertyName;
        this.availableSpotNumber = availableSpotNumber;
        this.availableSpotObservedAt = availableSpotObservedAt;
        this.availableSpotReliability = availableSpotReliability;
        this.availableSpotProvidedBy = availableSpotProvidedBy;
        this.locationCoordinatesX = locationCoordinatesX;
        this.locationCoordinatesY = locationCoordinatesY;
        this.totalSpotNumber = totalSpotNumber;
        this.context = context;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeometryType() {
        return geometryType;
    }

    public void setGeometryType(String geometryType) {
        this.geometryType = geometryType;
    }

    public Float getGeometryCoordinatesX() {
        return geometryCoordinatesX;
    }

    public void setGeometryCoordinatesX(Float geometryCoordinatesX) {
        this.geometryCoordinatesX = geometryCoordinatesX;
    }

    public Float getGeometryCoordinatesY() {
        return geometryCoordinatesY;
    }

    public void setGeometryCoordinatesY(Float geometryCoordinatesY) {
        this.geometryCoordinatesY = geometryCoordinatesY;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public Integer getAvailableSpotNumber() {
        return availableSpotNumber;
    }

    public void setAvailableSpotNumber(Integer availableSpotNumber) {
        this.availableSpotNumber = availableSpotNumber;
    }

    public LocalDateTime getAvailableSpotObservedAt() {
        return availableSpotObservedAt;
    }

    public void setAvailableSpotObservedAt(LocalDateTime availableSpotObservedAt) {
        this.availableSpotObservedAt = availableSpotObservedAt;
    }

    public Float getAvailableSpotReliability() {
        return availableSpotReliability;
    }

    public void setAvailableSpotReliability(Float availableSpotReliability) {
        this.availableSpotReliability = availableSpotReliability;
    }

    public String getAvailableSpotProvidedBy() {
        return availableSpotProvidedBy;
    }

    public void setAvailableSpotProvidedBy(String availableSpotProvidedBy) {
        this.availableSpotProvidedBy = availableSpotProvidedBy;
    }

    public Float getLocationCoordinatesX() {
        return locationCoordinatesX;
    }

    public void setLocationCoordinatesX(Float locationCoordinatesX) {
        this.locationCoordinatesX = locationCoordinatesX;
    }

    public Float getLocationCoordinatesY() {
        return locationCoordinatesY;
    }

    public void setLocationCoordinatesY(Float locationCoordinatesY) {
        this.locationCoordinatesY = locationCoordinatesY;
    }

    public Integer getTotalSpotNumber() {
        return totalSpotNumber;
    }

    public void setTotalSpotNumber(Integer totalSpotNumber) {
        this.totalSpotNumber = totalSpotNumber;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}