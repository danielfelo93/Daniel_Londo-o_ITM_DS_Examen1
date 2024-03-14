package modulos;

public class Handler50 extends BaseHandler {
    private int billetes50;

    public Handler50(){     
    }

    @Override
    public void manejarRetiro(int cantidad){

        billetes50 = cantidad / 50000;
        cantidad = cantidad % 50000;

        if(billetes50 >= 0) {
            System.out.println("Retiras " + billetes50 + "billetes de $50.000");
        }

        if(cantidad != 0) {
            super.manejarRetiro(cantidad);
        }
        

    }

}

