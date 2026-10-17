package app.repository;

import app.domain.Property;
import app.service.outputport.PropertyRepositoryInterface;

import java.util.List;
import java.util.Optional;

public class PropertyRepositoryImpl implements PropertyRepositoryInterface {

    @Override
    public Property saveProperty(Property property) {
        return null;
    }

    @Override
    public Optional<Property> selectPropertyById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Property> selectAllProperties() {
        return List.of();
    }

    @Override
    public Property updateProperty(Property property) {
        return null;
    }

    @Override
    public void deleteProperty(int id) {

    }
}
