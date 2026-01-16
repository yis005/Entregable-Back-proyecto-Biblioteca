package Model;
public class Libros extends Biblioteca {
    private int paginas;

    public int getPaginas() {
        return paginas;
    }


    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }


    public Libros(String titulo, String autor, int paginas) {
        super(titulo, autor); 
        this.paginas = paginas;
    }


    //polimorfismo
    @Override
    public void mostrarInfo() { 
        System.out.println("Libro: " + titulo + " (" + paginas + " páginas), Autor: " + autor);
    }
}
    

