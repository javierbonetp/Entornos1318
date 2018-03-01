package programa;
import java.util.Scanner;
import java.util.Random;
public class Programa {
    public static void main(String[] args) {
        System.out.println("VAMOS A JUGAR");
        Scanner scan = new Scanner(System.in);
        boolean jugar = true;
        float adivinar=0;
        adivinar = (int) (Math.random()*10 + 1);        
        while (jugar){
            adivinar = (int) (Math.random()*10 + 1);
            System.out.print("Dime un numero del 1 al 10: ");
            float num = scan.nextFloat();
            if ((num <= 0) || (num > 10)){
                System.out.println("Adios...");
                jugar = false;
            }
            else if (num == adivinar){
                System.out.println("Acertaste! :D");
            }
            else if (num != adivinar){
                System.out.println("No! Era el " + adivinar);
            }
        }
            
    }
    
}