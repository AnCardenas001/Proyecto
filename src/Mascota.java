import java.util.Scanner;

public class Mascota {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int Alimentacion = 90; 
        int Energia = 100;
        int Diversion = 100;
        String NombreUsuario;
        String NombreMascota;
        
        
        System.out.println("Hola!! Estoy feliz de conocerte, ¿pordrias decirme tu nombre?");
        NombreUsuario = sc.nextLine ();
        System.out.println("Que lindo nombre! Me presento, soy tu mascota virtual, ¿Te gustaria darme un nombre?"); 
        NombreUsuario = sc.nextLine ();
        System.out.println("Wow, me encanta mi nombre. ¿Que es lo primero que haremos hoy?");
        System.out.println("Comer, Jugar");
        String op = sc.nextLine ();
        switch (op) {
        
            case "Comer":
        if (Alimentacion<100){ 
            System.out.println("¿Que me darás de comer?");
                    String opp = sc.nextLine ();
        switch (opp) {
            case "Pollo":
           Alimentacion= Alimentacion + 10;
        
            break;
        
            case "Carne":
            Alimentacion = Alimentacion + 10;
        
            break;
        }
        }
        else if (Alimentacion>=100){
            System.out.println("Mmm... No gracias estoy muy lleno, intentalo de nuevo despues");
        
        }

        break;

        case "Jugar":
         if (Energia>=20){ 

            System.out.println("Genial!! ¿Que jugaremos?, estas son las opciones (Triquia)");
                    String opp = sc.nextLine ();
         switch (opp) {
            
            case "Triqui":
             Energia = Energia - 10;
             Alimentacion = Alimentacion - 5;
             if (Energia==100){
                System.out.println("Genial, eres grandioso jugando");

             }
             else if (Energia<100){
                 System.out.println("Genial, eres grandioso jugando");
                 Energia=Energia+10;

                 break;

             }
            }
        }
        

        else if (Energia<20){
            System.out.println("Lo siento, estoy muy cansado para jugar, ¿Podria ir a dormir?");
        }
        break;
        
        } 
    }
}
