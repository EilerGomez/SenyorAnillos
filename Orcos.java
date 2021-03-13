public class Orcos extends Bestias{
    public Orcos(String nombre){
        super(300.0,nombre,45.0);
    }
    @Override
    public void saludar(){
        System.out.println("Hola soy una Bestia, un Orco y me llamo: " + this.nombre);
    }
}