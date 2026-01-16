package Model;
public class Biblioteca {

    protected String titulo;
    protected String autor;

    public Biblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

        public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }


}
    

