package app.domain;

public class Property {

    private Integer propertyId;
    private String propertyType;
    private String address;
    private String city;
    private PropertyOwner propertyOwner;
    private boolean isAvailable;

    public Property() {
    }

    public Property(Integer propertyId, String propertyType, String address, String city, PropertyOwner propertyOwner, boolean isAvailable) {
        this.propertyId = propertyId;
        this.propertyType = propertyType;
        this.address = address;
        this.city = city;
        this.propertyOwner = propertyOwner;
        this.isAvailable = isAvailable;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PropertyOwner getPropertyOwner() {
        return propertyOwner;
    }

    public void setPropertyOwner(PropertyOwner propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }




}
