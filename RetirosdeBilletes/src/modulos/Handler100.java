package modulos;

public class Handler100 extends BaseHandler {
    private int billetes100;

    public Handler100(){     
    }

    @Override
    public void manejarRetiro(int cantidad){

        billetes100 = cantidad / 100000;
        cantidad = cantidad % 100000;

        if(billetes100 >= 0) {
            System.out.println("Retiras " + billetes100 + "billetes de $100.000");
        }

        if(cantidad != 0) {
            super.manejarRetiro(cantidad);
        }

    }

    
}
