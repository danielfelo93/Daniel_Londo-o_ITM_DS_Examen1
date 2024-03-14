package modulos;

public class Handler5 extends BaseHandler {
    private int billetes5;

    public Handler5(){     
    }

    @Override
    public void manejarRetiro(int cantidad){

        billetes5 = cantidad / 5000;
        cantidad = cantidad % 5000;

        if(billetes5 >= 0) {
            System.out.println("Retiras " + billetes5 + "billetes de $5.000");
        }

        if(cantidad != 0 && nextH != null) {
            nextH.manejarRetiro(cantidad);
        }

    }
}