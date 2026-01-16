package Model;

public class Revista extends Biblioteca {
    private int Edicion;

    public Revista(String titulo, String autor, int Edicion) {
        super(titulo, autor);
        this.Edicion = Edicion;
    }

     public int getEdicion() {
        return Edicion;
    }

    public void setEdicion(int edicion) {
        Edicion = edicion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Revista: " + titulo + " (Edición " + Edicion + "), Autor: " + autor);
    }

   
}
    

