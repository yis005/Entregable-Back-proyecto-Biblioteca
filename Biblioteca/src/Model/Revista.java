package Model;

public class Revista extends Biblioteca {
    private int Edicion;

    public Revista(String titulo, String autor, int Edicion) {
        super(titulo, autor);
        this.Edicion = Edicion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Revista: " + titulo + " (Edición " + Edicion + "), Autor: " + autor);
    }
}
    

