package modulos;

public class AceptacionMonto extends BaseHandler {

    public AceptacionMonto(){
    } 
     
    @Override
    public void manejarRetiro(int cantidad){
        if (cantidad%5000 == 0) {
            System.out.println("Has ingresado: $" + cantidad);  
            super.manejarRetiro(cantidad);  
        }
        else{
            System.out.println("Error: La cantidad ingresada debe ser multiplo de $5000");
        }
        
    }
}

