/*
 * Corbin Nash
 * Erastosthenes
 * 20/09/2018
 */
package Eratosthenes;
import java.util.ArrayList;
/**
 *
 * @author conas1290
 */
public class Eratosthenes {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<int>numbers = new ArrayList<int>(); 
         int nextPrime;
         int i; 
        //set first prime to number to two
         
        nextPrime = 2;
        while(nextPrime <=Math.sqrt(1000)){
         for (i = nextPrime * 2; i < 1000; i += nextPrime){
         numbers[i] = false;
         }  
         do{
         nextPrime++;
         } while(numbers[nextPrime]!= true);
         
         }   
            
            
    
    
    }
    }
    
}
