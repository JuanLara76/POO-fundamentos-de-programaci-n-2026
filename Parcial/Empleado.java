package parcial;


public class Empleado {
private String nombre;
private String Cargo;
private double salarioBase;
private int añosExperiencia;

    public Empleado(String nombre, String Cargo, double salarioBase, int añosExperiencia) {
        this.nombre = nombre;
        this.Cargo = Cargo;
        this.salarioBase = salarioBase;
        this.añosExperiencia = añosExperiencia;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return Cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
  
public String verDetalle(){
    return "Nombre :" + nombre + "\nCargo" + Cargo + "\nSalario" + salarioBase + "\nExperiencia: " + añosExperiencia;
            
          
    
          }

public String trabajar(int horas){
    return "\nEl empleado llamado" + this.nombre + "\nTrabaja" + horas + "\ntomarDescanso" + "\ntrabajaryDescansar";
    
            
            
         
}
 public double calcularBono(float porcentaje) {
     return (salarioBase/30) * porcentaje;
     
 }
     
             

  
    public double salarioTotal(double bono,int diastrabajados) {
        return (salarioBase/30) * diastrabajados;
    }
     

        
    }

JUAN DAVID LARA BERNAL Y JHORJAN OVIEDO ALVAREZ
