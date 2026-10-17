package app.userinterface;

import app.service.validations.FormTypeValidator;
import app.view.PropertyOwnerView;
import app.view.PropertyView;

public class UserInterface {




    private final PropertyOwnerView propertyOwnerView;
    private final PropertyView propertyView;


    public UserInterface(PropertyOwnerView propertyOwnerView,PropertyView propertyView ) {
        this.propertyOwnerView = propertyOwnerView;
        this.propertyView = propertyView;
    }

    public void menuApp(){

        int init = FormTypeValidator.intValidator("Presione 1 para inciar la aplicacion");

        while(init!=0){

            int option = FormTypeValidator.intValidator("""
                        Seleccione:
                        1.Registrar
                        2.Consultar todos los usuarios
                    """);

            switch (option){
                case 1:
                    System.out.println("Registrar");
                    propertyOwnerView.createPropertyOwner();
                    break;
                case 2:
                    System.out.println("Listar todos los usuarios");
                    propertyOwnerView.showAllPropertiesOwners();
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }
    }


    public void showInitMenu(){

        while(true){

            int option = FormTypeValidator.intValidator("""
                    Seleccione:
                    1. Menu de Propietarios
                    2. Menu de Propiedades
                    3. Menu de Ofertas
                    4. Salir
                    """);

            switch (option){
                case 1:
                    System.out.println("Menu de Propietarios");
                    showPropertyOwnerMenu();
                    break;
                case 2:
                    System.out.println("Menu de Propiedades");
                    showPropertyMenu();
                    break;
                case 3:
                    System.out.println("Menu de Ofertas");
                    showOfferMenu();
                    break;
                case 4:
                    System.out.println("Salir");
                    return;
                default:
                    System.out.println("Seleccione una opcion valida");

            }
        }
    }


    public void showPropertyOwnerMenu(){

        while(true){

            int option = FormTypeValidator.intValidator("""
                    Seleccione:
                    1. Registrar Propietario
                    2. Consultar todos los propietarios
                    3. Consultar propietario por id
                    4. Actualizar propietario
                    5. Eliminar propietario
                    6. Salir
                    """);

            switch (option){
                case 1:
                    System.out.println("Registrar Propietario");
                    propertyOwnerView.createPropertyOwner();
                    break;
                case 2:
                    System.out.println("Listar todos los propietarios");
                    propertyOwnerView.showAllPropertiesOwners();
                    break;
                case 3:
                    System.out.println("Consultar propietario por id");
                    break;
                case 4:
                    System.out.println("Actualizar propietario");
                    break;
                case 5:
                    System.out.println("Eliminar propietario");
                    break;
                case 6:
                    System.out.println("Salir");
                    return;
                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }
    }

    public void showPropertyMenu(){

        while(true){

            int option = FormTypeValidator.intValidator("""
                    Seleccione:
                    1. Registrar Propiedad
                    2. Consultar todas las propiedades
                    3. Consultar propiedad por id
                    4. Actualizar propiedad
                    5. Eliminar propiedad
                    6. Salir
                    """);

            switch (option){
                case 1:
                    System.out.println("Registrar Propiedad");
                    propertyView.registerProperty();
                    break;
                case 2:
                    System.out.println("Listar todas las propiedades");
                    propertyView.showPropertyById();
                    break;
                case 3:
                    System.out.println("Consultar propiedad por id");
                    propertyView.showAllProperties();
                    break;
                case 4:
                    System.out.println("Actualizar propiedad");
                    propertyView.updateProperty();
                    break;
                case 5:
                    System.out.println("Eliminar propiedad");
                    propertyView.deleteProperty();
                    break;
                case 6:
                    System.out.println("Salir");
                    return;
                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }
    }

    public void showOfferMenu(){

        while(true){

            int option = FormTypeValidator.intValidator("""
                    Seleccione:
                    1. Registrar Oferta
                    2. Consultar todas las ofertas
                    3. Consultar oferta por id
                    4. Actualizar oferta
                    5. Eliminar oferta
                    6. Salir
                    """);

            switch (option){
                case 1:
                    System.out.println("Registrar Oferta");
                    break;
                case 2:
                    System.out.println("Listar todas las ofertas");
                    break;
                case 3:
                    System.out.println("Consultar oferta por id");
                    break;
                case 4:
                    System.out.println("Actualizar oferta");
                    break;
                case 5:
                    System.out.println("Eliminar oferta");
                    break;
                case 6:
                    System.out.println("Salir");
                    return;
                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }
    }



}
