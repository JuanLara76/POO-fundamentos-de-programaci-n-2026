
package sesion7;


public class Sesion7 {

    
    public static void main(String[] args) {
        Libro libro1 =new Libro();
        libro1.setTitulo("El caballo paralitico");
        libro1.setAutor("Juan");
        libro1.setGenero("Terror");
        libro1.setNumPaginas(500);
        
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getGenero());
        System.out.println(libro1.getNumPaginas());
        
        System.out.println(" \nDETALLE LIBRO");
        System.out.println(libro1.prestar("Juanito alimaña"));
        
        System.out.println(libro1.prestarYDevolver("Juanito alimaña"));
        System.out.println(libro1.calcularTiempoLectura(50, 2.6f));
        
    }
    
}
