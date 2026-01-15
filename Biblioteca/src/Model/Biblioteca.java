package Model;
public class Biblioteca {

    protected String titulo;
    protected String autor;

    public Biblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }
}
    

