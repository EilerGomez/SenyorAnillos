public class Elfos extends Heroes{
    public Elfos(String nombre){
        super(250.0,nombre,60.);
    }
    @Override
    public void saludar(){
        System.out.println("Hola soy un Heroe, un elfo y me llamo: " + this.nombre + ", Vida: " + getvida());
    }
}