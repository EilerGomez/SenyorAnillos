public class Trasgos extends Bestias{
    public Trasgos(String nombre){
        super(325.0,nombre,46.0);
    }
    @Override
    public void saludar(){
        System.out.println("Hola soy una Bestia, un Trasgo y me llamo: " + this.nombre);
    }
}
