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
        System.out.println("(Comer, Jugar, Dormir)");
        String op = sc.nextLine ();
        switch (op) {
        
            case "Comer":
        if (Alimentacion<100){ 
            System.out.println("¿Que me darás de comer?");
            System.out.println("(Carne, Pollo)");
                    String opp = sc.nextLine ();
        switch (opp) {
            case "Pollo":
           Alimentacion= Alimentacion + 10;
           System.out.println("Muchas gracias " + NombreUsuario + " ¡estaba delicioso!" );
        
            break;
        
            case "Carne":
            Alimentacion = Alimentacion + 10;
            System.out.println("Muchas gracias " + NombreUsuario + " ¡estaba delicioso!" );
        
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
             if (Energia==100){
             Energia = Energia - 10;
             Alimentacion = Alimentacion - 5;
                System.out.println("Genial, eres grandioso jugando");

             }
             else if (Energia<100){
                 System.out.println("Genial, eres grandioso jugando");
                 Diversion=Diversion+10;

                 break;

             }
            }
        }
        

        else if (Energia<20){
            System.out.println("Lo siento, estoy muy cansado para jugar, ¿Podria ir a dormir?");
        }
        break;

        case "Dormir":
        if(Energia==100){

            System.out.println("No, en este momento no quiero descansar, ¡Vamos a jugar " + NombreUsuario + "!");
        }
        else if (Energia<=90){
            System.out.println("Genial, ya estaba un poco cansado, ¿Cuanto tiempo dormiré?");
            System.out.println("(10min, 20min, 30min, 40min, 50min, 60min, 70min, 80min, 90min, 100min)");
            String opp = sc.nextLine ();
        switch(opp){
        case "10min":
        Energia=Energia+10;
        break;

        case "20min":
        if(Energia<=80){
            Energia=Energia+20;
        }
        else {
            System.out.println("Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Que te parece un poco menos?");
        }
        break;
        case "30min":
        if(Energia<=70){
            Energia=Energia+30;
        }
        else {
            System.out.println("Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Que te parece un poco menos?");
        }
        break;
        case "40min":
        if(Energia<=60){
            Energia=Energia+40;
        }
        else {
            System.out.println("Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Que te parece un poco menos?");
        }
        break;
        case "50min":
        if(Energia<=50){
            Energia=Energia+50;
        }
        else {
            System.out.println("Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Que te parece un poco menos?");
        }
        break;
        case "60min":
        if(Energia<=40){
            Energia=Energia+60;
        }
        else {
            System.out.println("Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Que te parece un poco menos?");
        }
        break;
        case "70min":
        if(Energia<=30){
            Energia=Energia+70;
        }
        else {
            System.out.println("Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Que te parece un poco menos?");
        }
        break;
        case "80min":
        if(Energia<=20){
            Energia=Energia+80;
        }
        else {
            System.out.println("Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Que te parece un poco menos?");
        }
        break;
        case "90min":
        if(Energia<=10){
            Energia=Energia+90;
        }
        else {
            System.out.println("Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Que te parece un poco menos?");
        }
        break;
        case "100min":
        if(Energia==0){
            Energia=Energia+100;
        }
        else {
            System.out.println("Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Que te parece un poco menos?");
        }
        break;
        


        }
        break;    

        }
        
        } 
    }
}
