package server.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.time.LocalDateTime;

@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    private String id;

    @Column(nullable = false)
    private String type;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "street_fr")
    private String streetFr;

    @Column(name = "street_nl")
    private String streetNl;

    @Column(name = "is_parked_object")
    private String isParkedObject;

    @Column(name = "is_parked_observed_at")
    private LocalDateTime isParkedObservedAt;

    @Column(name = "is_parked_provided_by")
    private String isParkedProvidedBy;

    private String category;

    @Column(name = "context")
    private String context; // Stored as a JSON string

    // Standardkonstruktor
    public Vehicle() {
    }

    public Vehicle(String id, String type, String brandName, String streetFr, String streetNl, String isParkedObject, LocalDateTime isParkedObservedAt, String isParkedProvidedBy, String category, String context) {
        this.id = id;
        this.type = type;
        this.brandName = brandName;
        this.streetFr = streetFr;
        this.streetNl = streetNl;
        this.isParkedObject = isParkedObject;
        this.isParkedObservedAt = isParkedObservedAt;
        this.isParkedProvidedBy = isParkedProvidedBy;
        this.category = category;
        this.context = context;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getStreetFr() {
        return streetFr;
    }

    public void setStreetFr(String streetFr) {
        this.streetFr = streetFr;
    }

    public String getStreetNl() {
        return streetNl;
    }

    public void setStreetNl(String streetNl) {
        this.streetNl = streetNl;
    }

    public String getIsParkedObject() {
        return isParkedObject;
    }

    public void setIsParkedObject(String isParkedObject) {
        this.isParkedObject = isParkedObject;
    }

    public LocalDateTime getIsParkedObservedAt() {
        return isParkedObservedAt;
    }

    public void setIsParkedObservedAt(LocalDateTime isParkedObservedAt) {
        this.isParkedObservedAt = isParkedObservedAt;
    }

    public String getIsParkedProvidedBy() {
        return isParkedProvidedBy;
    }

    public void setIsParkedProvidedBy(String isParkedProvidedBy) {
        this.isParkedProvidedBy = isParkedProvidedBy;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}