public class Elfos extends Heroes{
    public Elfos(String nombre){
        super(250,nombre,60);
    }
    public void saludar(){
        System.out.println("Hola soy un Heroe, un elfo y me llamo: " + this.nombre);
    }
}