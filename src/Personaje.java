public class Personaje {
    double vida;
    String nombre;
    double ataque;
    double armadura;
    public Personaje(double vida, String nombre,double ataque,double armadura){
        this.vida=vida;
        this.nombre = nombre;
        this.ataque=ataque;
        this.armadura=armadura;
    }

    public double getvida(){
        return this.vida;
    }
    public void setvida(double vida){
        this.vida=vida;
    }
    public String getnombre(){
        return this.nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public double getataque(){
        return this.ataque;
    }
    public void setataque(double ataque){
        this.ataque=ataque;
    }
    public double getarmadura(){
        return this.armadura;
    }
    public void setarmadura(double armadura){
        this.armadura = armadura;
    }   
    public void saludar(){
        System.out.println("Hola soy " + this.nombre);
    }     
    
}