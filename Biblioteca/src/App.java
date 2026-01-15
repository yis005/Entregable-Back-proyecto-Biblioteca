import Model.Admin;
import Model.Biblioteca;
import Model.Uexterno;
import Model.Libros;
import Model.Usuario;
import Model.Estado;
import Model.Revista;

public class App {
    public static void main(String[] args){
        // Herencia y polimorfismo
        
        Biblioteca m1 = new Libros("Cien años de soledad", "Gabriel García Márquez", 471);
        Usuario u1 = new Uexterno("Margara");
        u1.mostrarRol();
        m1.mostrarInfo();
        ((Estado) u1).prestar();

        Biblioteca m2 = new Revista("National Geographic", "Varios", 202);
        Usuario u2 = new Admin("Antonio");
        u2.mostrarRol();
        m2.mostrarInfo(); 
        ((Estado) u2).devolver();
        

        
        
    }
}
    

