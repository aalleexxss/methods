/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;
import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter an Integer: ");
        int n = reader.nextInt();
        
        for(int i=1; i<=n; i++){
            if(i%3 == 0 && i%5 != 0){System.out.print("Fizz");}
            else if(i%5 == 0 && i%3 != 0){System.out.print("Buzz");}
            else if(i%5 == 0 && i%3 == 0){System.out.print("FizzBuzz");}
            else{System.out.print(i);}
            System.out.println("");
            }
        }
        
         
        
    }
    

