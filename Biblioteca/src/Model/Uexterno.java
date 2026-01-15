package Model;

public class Uexterno extends Usuario implements Estado {
    public Uexterno(String nombre) {
        super(nombre);
    }


    @Override
    public void mostrarRol() {
        System.out.println("Usuario externo: " + nombre);
    }

    @Override
    public void prestar() {
        System.out.println(nombre + " ha prestado un material.");
    }

    @Override
    public void devolver() {
        System.out.println(nombre + " ha devuelto un material.");
    }
}
    

