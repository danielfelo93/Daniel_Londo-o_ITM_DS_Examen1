package modulos;

public abstract class BaseHandler implements ICajero {
    protected ICajero nextH;

    public void setNext(ICajero nextH) {
        this.nextH = nextH;
    }

    public void manejarRetiro(int cantidad){
        if(nextH != null) {
            nextH.manejarRetiro(cantidad);
        }
        else{
            System.out.println("No se pudo manejar la solicitud.");
        }
    }
    
}   
