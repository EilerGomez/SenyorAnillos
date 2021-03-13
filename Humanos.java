public class Humanos extends Heroes{
    public Humanos(String nombre){
        super(180.0,nombre,75.0);
    }
    @Override
    public void saludar(){
        System.out.println("Hola soy un Heroe, un Humano y me llamo: " + this.nombre);
    }
}