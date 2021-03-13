public class Personaje {
    int vida;
    String nombre;
    int ataque;
    int armadura;
    public Personaje(int vida, String nombre,int ataque,int armadura){
        this.vida=vida;
        this.nombre = nombre;
        this.ataque=ataque;
        this.armadura=armadura;
    }

    public int getvida(){
        return this.vida;
    }
    public void setvida(int vida){
        this.vida=vida;
    }
    public String getnombre(){
        return this.nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public int getataque(){
        return this.ataque;
    }
    public void setataque(int ataque){
        this.ataque=ataque;
    }
    public int getarmadura(){
        return this.armadura;
    }
    public void setarmadura(int armadura){
        this.armadura = armadura;
    }   
    public void saludar(){
        System.out.println("Hola soy " + this.nombre);
    }     
    
}