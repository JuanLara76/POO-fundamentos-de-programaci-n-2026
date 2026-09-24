package retroalimentacion.parcial1;

public class Empleado {
  private String nombre;
  private String cargo;
  private double salarioBase;
  private int añosdeexperiencia;

    public Empleado() {
    }

    public Empleado(String nombre, String cargo, double salarioBase, int añosdeexperiencia) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.añosdeexperiencia = añosdeexperiencia;
    }
    

 public Empleado (String nombre){
     this.nombre = nombre;
     
 }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setAñosdeexperiencia(int añosdeexperiencia) {
        this.añosdeexperiencia = añosdeexperiencia;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }
    

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getAñosdeexperiencia() {
        return añosdeexperiencia;
    }
    
   public String verDetalle(){
      return "\nEl nombre del empleado es:" + this.nombre +
              "\nnEl cargo del empleado es:" + this.cargo + 
              "\nEl salario del empleado es:" + this.salarioBase + 
              "\nLos años de experiencia son:" + this.añosdeexperiencia;
    }
   public String Trabajar(int horas){
       return "\nEl empleado llamado" + this.nombre + "\nTrabaja:" + horas;
       
       
   }
   
   public String tomarDescanso (int Descanso){
       return "\nEl trabajador llamado:" + this.nombre + 
               "\nToma estas horas de descanso:" + Descanso;
       
   }
   
   public String trabajarYDescansar (int horas){
       String traba = this.Trabajar(horas);
       String descan = this.tomarDescanso(horas);
       return traba + descan;
       
       }
   
   public double calcularBono(float porcentaje) {
   return (salarioBase/30) * porcentaje;
   
   }
   public double salarioTotal(double bono, int diasTrabajados) { 
       double salarioPorDia = this.salarioBase / 30;
       double salarioTrabajado = salarioPorDia * diasTrabajados;
       return salarioTrabajado + this.calcularBono(diasTrabajados);
       
       } 
   
} 
