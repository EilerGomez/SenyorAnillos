public class Hobbits extends Heroes{
    public Hobbits(String nombre){
        super(200,nombre,40);
    }
    public void saludar(){
        System.out.println("Hola soy un Heroe, un Hobbit y me llamo: " + this.nombre);
    }
}