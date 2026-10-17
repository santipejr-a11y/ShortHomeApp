package app.service.inputport;

import app.domain.Property;
import app.domain.PropertyOwner;

import java.util.List;
import java.util.Optional;

public interface PropertyService {

    Property createProperty(Integer propertyId, String propertyType, String address, String city, PropertyOwner propertyOwner, boolean isAvailable);
    Optional<Property> findPropertyById(int id);
    List<Property> findProperties();
    Property updateProperty(Integer propertyId, String propertyType, String address, String city, PropertyOwner propertyOwner, boolean isAvailable);
    void deletePropertyById(int id);

}
