package modulos;

public interface ICajero {
    void setNext(ICajero nextH);
    void manejarRetiro(int cantidad);
}
