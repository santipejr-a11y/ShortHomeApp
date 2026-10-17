package app.view;

import app.service.PropertyOwnerServiceImpl;
import app.service.inputport.PropertyService;

import java.util.Scanner;

public class PropertyView {



    private final PropertyService propertyService;

    public PropertyView(PropertyService propertyService){
        this.propertyService = propertyService;
    }


    public void registerProperty(){

        System.out.println("Ingrese el id de la propiedad: ");

    }

    public void showPropertyById(){

    }

    public void showAllProperties(){

    }

    public void updateProperty(){

    }

    public void deleteProperty(){

    }
}
