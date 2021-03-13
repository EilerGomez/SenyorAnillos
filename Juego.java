import java.util.Scanner;
public class Juego{
    private Bestias ejercitoBestias[];
    private Heroes ejercitoHeroes[];
    private final int CANTIDAD =5;
    public Juego(){
        ejercitoBestias = new Bestias[CANTIDAD];
        ejercitoHeroes = new Heroes[CANTIDAD];
    }
    Scanner teclado = new Scanner(System.in);
    public void jugar(){
        int ir = 0;
        System.out.println("****************************************************");
        System.out.println("****Bienvenido al juego del senior de los anillos****");
        System.out.println("*****************************************************\n\n");
        while(ir != 3){
            System.out.println("A donde deseas ir?");
            System.out.println("1.Pelear ahora");
            System.out.println("2.Presentar personajes");
            System.out.println("3.Salir");
            ir = teclado.nextInt();
            if(ir==1){

            }else if(ir==2){
                inicializarHeroes();
                iniciualizarBestias();

            }else if(ir==3){
                System.out.println("Fin del juego");
            }
            else{
                System.out.println("No existe la opcion que has ingresado");
            }
        }   
    }
    public void inicializarHeroes(){
        ejercitoHeroes [0]= new Elfos("Elfo1");
        ejercitoHeroes [1]= new Hobbits("Hobbit 1");
        ejercitoHeroes [2]= new Humanos("Humano 1");
        ejercitoHeroes [3]= new Elfos("Elfo2");
        ejercitoHeroes [4]= new Hobbits("hobbit 2");
        
    }
    public void iniciualizarBestias(){
        ejercitoBestias[0]=new Orcos("Orco 1");
        ejercitoBestias[1]=new Trasgos("Trasgo 1");
        ejercitoBestias[2]=new Orcos("Orco 2");
        ejercitoBestias[3]=new Trasgos("Trasgo 2");
        ejercitoBestias[4]=new Orcos("Orco 3");
    }
}