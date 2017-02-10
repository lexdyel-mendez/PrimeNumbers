//Language: Java
//Compiled Using: javac
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.Scanner;

//Your submission should *ONLY* use the following class name
public class Main
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
       
        int K;
        int J;
        int sum = 0;
        
        K = stdin.nextInt();
        J = stdin.nextInt();
        
        while (K >= 1){
        	if(K < J){
        		if (Detecter.isPrime(K) == true){
        			sum = sum + K;
        			K++;
        		}else{
        			K++;
        		}
        			
        	}else{
        		break;
        	}
        }
        
        int result = sum + J;
        System.out.print(result);
        stdin.close();
        
    }	
}
