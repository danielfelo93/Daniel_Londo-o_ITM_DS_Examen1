import java.util.Scanner;

import modulos.AceptacionMonto;
import modulos.Handler100;
import modulos.Handler50;
import modulos.Handler20;
import modulos.Handler10;
import modulos.Handler5;

public class App {
    public static void main(String[] args) throws Exception {
        

        // Configurar la cadena de responsabilidad
        AceptacionMonto handlerAceptacion = new AceptacionMonto();
        Handler100 handlerBillete100 = new Handler100();
        Handler50 handlerBillete50 = new Handler50();
        Handler20 handlerBillete20 = new Handler20();
        Handler10 handlerBillete10 = new Handler10();
        Handler5 handlerBillete5 = new Handler5();

        handlerAceptacion.setNext(handlerBillete100);
        handlerBillete100.setNext(handlerBillete50);
        handlerBillete50.setNext(handlerBillete20);
        handlerBillete20.setNext(handlerBillete10);
        handlerBillete10.setNext(handlerBillete5);       
        
        // Procesar solicitudes
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a retirar :");
        int cantidadRetiro = sc.nextInt();
        handlerAceptacion.manejarRetiro(cantidadRetiro);
        sc.close();
    }
}
