package animal;


public class Herencia30sept { 
    
    
    public static void main(String[] args) {
        Animal animall = new Animal ();
        animall.setEspecie("mamimero");
        System.out.println(animall.getEspecie());
        animall.comer();
        animall.dormir();
        Perro perro1 = new Perro ();
        perro1.setEspecie("mamimfero");
        perro1.setRaza("pitbull");
        perro1.hacer_sonido();
        perro1.comer();
        perro1.dormir();
        System.out.println(perro1.getEspecie());
        
        Perro perro2 = new Perro ("mamifero", "pincher");
        System.out.println();
    }
    
}
