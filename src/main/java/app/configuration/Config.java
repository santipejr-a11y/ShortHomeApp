package app.configuration;

import app.repository.PropertyOwnerRepositoryImpl;
import app.repository.PropertyRepositoryImpl;
import app.service.PropertyOwnerServiceImpl;
import app.service.PropertyServiceImpl;
import app.service.inputport.PropertyOwnerService;
import app.service.inputport.PropertyService;
import app.service.outputport.PropertyOwnerRepository;
import app.service.outputport.PropertyRepositoryInterface;
import app.userinterface.UserInterface;
import app.view.PropertyOwnerView;
import app.view.PropertyView;

public class Config {

    public static UserInterface createUserInterface() {

        PropertyOwnerRepository propertyOwnerRepository = new PropertyOwnerRepositoryImpl();
        PropertyOwnerService propertyOwnerService = new PropertyOwnerServiceImpl(propertyOwnerRepository);
        PropertyOwnerView propertyOwnerView = new PropertyOwnerView(propertyOwnerService);

        PropertyRepositoryInterface propertyRepositoryInterface = new PropertyRepositoryImpl();
        PropertyService propertyService = new PropertyServiceImpl(propertyRepositoryInterface);
        PropertyView propertyView = new PropertyView(propertyService);

        return new UserInterface(propertyOwnerView, propertyView);


    }
}
