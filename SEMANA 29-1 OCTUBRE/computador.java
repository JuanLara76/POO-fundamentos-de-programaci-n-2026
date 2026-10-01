package producto;
public class Portatil {
    private String nombre;
    private String categoria;
    private double precio;
    private int cantidadStock;

    public Portatil() {
    }

    public Portatil(String nombre, String categoria, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    
    public String verDetalle (){
        return "\n El nombre del producto es:" + this.nombre + 
                "\n La categoria es:" + this.categoria +
                "\n El precio es:" + this.precio +
                "\n cantidad del Stock es:" + this.cantidadStock;
        
    }
            
    public double calcularDescuento (int porcentaje){
        return precio * porcentaje/100;
    }
    public double calcularDescuento (double porcentaje) {
        return precio + porcentaje/100;
    }
    public double calcularPrecioFinal (double porcentaje) {
        return precio - calcularPrecioFinal (porcentaje);
        
    }
    
}
