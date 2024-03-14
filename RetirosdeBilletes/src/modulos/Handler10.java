package modulos;

public class Handler10 extends BaseHandler {
    private int billetes10;

    public Handler10(){     
    }

    @Override
    public void manejarRetiro(int cantidad){

        billetes10 = cantidad / 10000;
        cantidad = cantidad % 10000;

        if(billetes10 >= 0) {
            System.out.println("Retiras " + billetes10 + "billetes de $10.000");
        }

        if(cantidad != 0) {
            super.manejarRetiro(cantidad);
        }
    
    }
}