
package retroalimentacion.parcial1;

public class RetroalimentacionParcial1 {

    
    public static void main(String[] args) {
 Empleado empleado1=new Empleado ();
 empleado1.setNombre("Juan");
 empleado1.setCargo("Ingeniero");
 empleado1.setSalarioBase(5000000);
 empleado1.setAñosdeexperiencia(10);
        System.out.println(empleado1.getNombre());
        System.out.println(empleado1.getCargo());
        System.out.println(empleado1.getSalarioBase());
        System.out.println(empleado1.getAñosdeexperiencia());
        System.out.println(empleado1.getNombre());
        System.out.println(empleado1.getCargo());
        System.out.println(empleado1.getSalarioBase());
        System.out.println(empleado1.getAñosdeexperiencia());
        System.out.println(empleado1.verDetalle());
        System.out.println(empleado1.Trabajar(8));
        System.out.println(empleado1.tomarDescanso(2));
        System.out.println(empleado1.trabajarYDescansar(10));
        System.out.println(empleado1.calcularBono(6));
        System.out.println(empleado1.calcularBono(3));
        System.out.println(empleado1.salarioTotal(6, 5));
        System.out.println("\nMejor reir que llorar");
}
}
