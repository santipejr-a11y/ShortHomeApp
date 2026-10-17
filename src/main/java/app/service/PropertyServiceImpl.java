package app.service;

import app.domain.Property;
import app.domain.PropertyOwner;
import app.service.inputport.PropertyService;
import app.service.outputport.PropertyRepositoryInterface;

import java.util.List;
import java.util.Optional;

public class PropertyServiceImpl implements PropertyService {

    private final PropertyRepositoryInterface  propertyRepositoryInterface;

    public PropertyServiceImpl(PropertyRepositoryInterface  propertyRepositoryInterface){

        this.propertyRepositoryInterface = propertyRepositoryInterface;

    }



    @Override
    public Property createProperty(Integer propertyId, String propertyType, String address, String city, PropertyOwner propertyOwner, boolean isAvailable) {
        return null;
    }

    @Override
    public Optional<Property> findPropertyById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Property> findProperties() {
        return List.of();
    }

    @Override
    public Property updateProperty(Integer propertyId, String propertyType, String address, String city, PropertyOwner propertyOwner, boolean isAvailable) {
        return null;
    }

    @Override
    public void deletePropertyById(int id) {

    }
}
