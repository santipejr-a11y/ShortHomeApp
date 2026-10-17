package app.service.outputport;

import app.domain.Property;

import java.util.List;
import java.util.Optional;

public interface PropertyRepositoryInterface {

    Property saveProperty(Property property);
    Optional<Property> selectPropertyById(int id);
    List<Property> selectAllProperties();
    Property updateProperty(Property property);
    void deleteProperty(int id);

}
