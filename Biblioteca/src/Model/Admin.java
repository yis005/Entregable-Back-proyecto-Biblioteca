package Model;

public class Admin extends Usuario implements Estado {
    public Admin(String nombre) {
        super(nombre);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Administrador: " + nombre);
    }

    @Override
    public void prestar() {
        System.out.println(nombre + " ha prestado un material por más tiempo.");
    }

    @Override
    public void devolver() {
        System.out.println(nombre + " ha devuelto un material.");
    }
}
    

