import java.util.Scanner;
public class Juego{
    private static
    Bestias ejercitoBestias[];
    Heroes ejercitoHeroes[];
    private final int CANTIDAD =5;
    public Juego(){
        ejercitoBestias = new Bestias[CANTIDAD];
        ejercitoHeroes = new Heroes[CANTIDAD];
    }
    Scanner teclado = new Scanner(System.in);
  
    public void jugar(){
        inicializarHeroes();
        iniciualizarBestias();
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
                int op1 = 0;
                while(op1!=2){
                    System.out.println("1.Iniciar pelea");
                    System.out.println("2.Volver al menu principal");
                    op1 = teclado.nextInt();
                    if(op1 ==1){
                        pelear();
                    }else if(op1 == 2){
                        System.out.println("Suerte!\n");
                    }else{
                        System.out.println("Elije una opcion");
                    }
                }

            }else if(ir==2){
                presentarEjercitos(ejercitoHeroes);
                System.out.println("\n");
                presentarEjercitos(ejercitoBestias);

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
    public void presentarEjercitos(Personaje ejercitos[]){
        if(ejercitos.length>0){
            String tempo = "";
            if(ejercitos[0] instanceof Bestias){
                tempo = "Bestias";
            }else{
                tempo = "Heroes";
            }
            System.out.println("Presentando ejercitos de: " + tempo);
            for(int i = 0; i<ejercitos.length; i++){
                ejercitos[i].saludar();
            }
        }else{
            System.out.println("No hay ejercitos");
        }
    }
    int bestiaPelear;
    int heroePelear;
    double vida1;
    double vida;
    double ataque;
    double defensa;
    double ataque1;
    double defensa1;
   
    public void pelear(){
        
        //ataque de los heroes
        System.out.println("se han tirado los dados para el ataque de Heroes...");
        double ataqueHeroes = (int)(Math.random()*100+1);
       for(int i = 0; i<5; i ++){
           System.out.print(".");
           try {
            Thread.sleep(500);
           } catch (InterruptedException e) {
               System.out.println("Error en dinamica de dados " + e);
           }
       }
       System.out.println(ataqueHeroes + "\n");
       //ataque de las bestias
       System.out.println("se han tirado los dados para el ataque de Bestias...");
       double ataqueBestias = (int)(Math.random()*90+1);
      for(int i = 0; i<5; i ++){
          System.out.print(".");
          try {
           Thread.sleep(500);
          } catch (InterruptedException e) {
              System.out.println("Error en dinamica de dados " + e);
          }
      }
      System.out.println(ataqueBestias + "\n");

      //ejegir peleadores
      //eligiendo peleador de heroe 
      System.out.println("presiona 1 para continuar");
      int seguir = teclado.nextInt();
      System.out.println("Se han tirado los dados para elegir a un peleador Heroe...");
       heroePelear = (int)(Math.random()*5);
        for(int i = 0; i<5; i ++){
            System.out.print(".");
            try {
            Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Error en dinamica de dados " + e);
            }
        }
        System.out.println(heroePelear);
        System.out.println("El peleador heroe elegido es: " + ejercitoHeroes[heroePelear].getnombre());
        ejercitoHeroes[heroePelear].setataque(ataqueHeroes);
        //eligiendo peleador de bestias
        System.out.println("\nSe han tirado los dados para elegir a un peleador de Besitas...");
        bestiaPelear = (int)(Math.random()*5);
          for(int i = 0; i<5; i ++){
              System.out.print(".");
              try {
              Thread.sleep(500);
              } catch (InterruptedException e) {
                  System.out.println("Error en dinamica de dados " + e);
              }
          }
          System.out.println(bestiaPelear);
          System.out.println("El peleador bestia elegido es: " + ejercitoBestias[bestiaPelear].getnombre());
          ejercitoBestias[bestiaPelear].setataque(ataqueBestias);
          //iniciando pelea entre los dos....
          System.out.println("\n1.Pelear ahora");
          int pelarAhora = teclado.nextInt();
          if(ejercitoHeroes[heroePelear] instanceof Elfos && ejercitoBestias[bestiaPelear] instanceof Orcos ){
              System.out.println("Mas furia del Elfo.");
            ataque = ataqueHeroes + 10;
            defensa = ejercitoBestias[bestiaPelear].getarmadura();
            ataque1 = ataqueBestias;
            defensa1 = ejercitoHeroes[heroePelear].getarmadura()- ((10*ejercitoHeroes[heroePelear].getarmadura())/100);
            vida = defensa-ataque;
            vida1 = defensa1 - ataque1;
            pelea();

            
          }else if(ejercitoHeroes[heroePelear] instanceof Hobbits && ejercitoBestias[bestiaPelear] instanceof Trasgos ){
              System.out.println("Mas miedo a los Hobbits.");
            ataque = ataqueHeroes  -5;
            defensa = ejercitoBestias[bestiaPelear].getarmadura();
            ataque1 = ataqueBestias;
            defensa1 = ejercitoHeroes[heroePelear].getarmadura();
            vida = defensa-ataque;
            vida1 = defensa1 - ataque1;
            pelea();
          }else if(ejercitoBestias[bestiaPelear] instanceof Orcos){
              System.out.println("Cuidado, los Orcos pegan fuerte.");
            ataque = ataqueHeroes;
            defensa = ejercitoBestias[bestiaPelear].getarmadura();
            ataque1 = ataqueBestias;
            defensa1 = ejercitoHeroes[heroePelear].getarmadura() - ((10*ejercitoHeroes[heroePelear].getarmadura())/100);
            vida = defensa-ataque;
            vida1 = defensa1 - ataque1;
            pelea();
          } else{
            ataque = ataqueHeroes;
            defensa = ejercitoBestias[bestiaPelear].getarmadura();
            ataque1 = ataqueBestias;
            defensa1 = ejercitoHeroes[heroePelear].getarmadura();
            vida = defensa-ataque;
            vida1 = defensa1 - ataque1;
            pelea();   
          }           
    }
    public void pelea(){
      
        System.out.println(ejercitoHeroes[heroePelear].getnombre() + " atacará a " + 
        ejercitoBestias[bestiaPelear].getnombre());
        System.out.println(ejercitoHeroes[heroePelear].getnombre() + " Vida: " + ejercitoHeroes[heroePelear].getvida() + " Ataque: " + ataque);
            System.out.println(ejercitoBestias[bestiaPelear].getnombre() + " Vida: " + ejercitoBestias[bestiaPelear].getvida() + " Armadura: " + 
            ejercitoBestias[bestiaPelear].getarmadura());
        for(int i = 0; i<5; i++){
            System.out.println("Peleando...");
            try{
            Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error en la pelea " + e);
            }
        }
        if(vida<0){
            ejercitoBestias[bestiaPelear].setvida(ejercitoBestias[bestiaPelear].getvida() + vida);
        }else{
        
        }
    
        System.out.println(ejercitoHeroes[heroePelear].getnombre() + " Vida: " + ejercitoHeroes[heroePelear].getvida() + " Armadura: " +
        ejercitoHeroes[heroePelear].getarmadura());
        System.out.println(ejercitoBestias[bestiaPelear].getnombre() + " Vida: " + ejercitoBestias[bestiaPelear].getvida() + " Ataque: " + ataque1);

        //debolucion de ataque
        System.out.println(ejercitoBestias[bestiaPelear].getnombre() + " atacará a " + 
        ejercitoHeroes[heroePelear].getnombre());
        for(int i = 0; i<5; i++){
            System.out.println("Peleando...");
            try{
            Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error en la pelea " + e);
            }
        }
      
        if(vida1<0){
            ejercitoHeroes[heroePelear].setvida(ejercitoHeroes[heroePelear].getvida() + vida1);
        }else{
        
        }
        System.out.println("Ha finalizado la pelea:");
        System.out.println(ejercitoHeroes[heroePelear].getnombre() + " Vida: " + ejercitoHeroes[heroePelear].getvida() + " Armadura: " + defensa);
        System.out.println(ejercitoBestias[bestiaPelear].getnombre() + " Vida: " + ejercitoBestias[bestiaPelear].getvida() + " Armadura: " + defensa1);
        System.out.println("\n1.Salir");
        int salir = teclado.nextInt();
    }
}