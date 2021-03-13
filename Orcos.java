public class Orcos extends Bestias{
    public Orcos(String nombre){
        super(300,nombre,45);
    }
    public void saludar(){
        System.out.println("Hola soy una Bestias, un Orco y me llamo: " + this.nombre);
    }
}