package modulos;

public class Handler20 extends BaseHandler {
    private int billetes20;

    public Handler20(){     
    }

    @Override
    public void manejarRetiro(int cantidad){

        billetes20 = cantidad / 20000;
        cantidad = cantidad % 20000;

        if(billetes20 >= 0) {
            System.out.println("Retiras " + billetes20 + "billetes de $20.000");
        }

        if(cantidad != 0) {
            super.manejarRetiro(cantidad);
        }

    }
}
