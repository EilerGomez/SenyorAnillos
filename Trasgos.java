public class Trasgos extends Bestias{
    public Trasgos(String nombre){
        super(325,nombre,46);
    }
    public void saludar(){
        System.out.println("Hola soy una Bestias, un Trasgo y me llamo: " + this.nombre);
    }
}