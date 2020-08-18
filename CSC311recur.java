/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc311recur;

import java.util.Scanner;

/**
 *
 * @author Hector Felix
 */


public class CSC311recur {
	public static void main(String[] args) {
		// hanoi(1, 'A', 'B', 'c');
                Scanner s = new Scanner(System.in);
                
//                System.out.println("How many discs to move?");
//                int option = s.nextInt();                
//		hanoi(option, 'A', 'B', 'C');
                
		 hanoi(3, 'A', 'B', 'C');
                 System.out.println("Fib: "+fibonacci(9));
	}
	/**
     * @param n*
     * @param start*
     * @param finish*
     * @param using*********************************************************************/

	public static void hanoi1(int n, char start, char finish, char using) {
            int count;
		// Base case: If we only need to move one disk, then we directly move
		// that disk from start to finish.
		if (n == 1) {
			System.out.println("Move disk " + n + ": " + start + " ---> " + finish);
		}
                else {
			hanoi1(n - 1, start, using, finish);
			System.out.println("Move disk " + n + ": " + start + " ---> " + finish);
			hanoi1(n - 1, using, finish, start);
		}
	}


public static void hanoi(int n, char start, char finish, char using) {
    if (n==1) {
        System.out.println("Move "+n+": "+start+ " ---> "+finish);
    }
    else {
        hanoi(n-1,start,using,finish);
    System.out.println("Move "+n+": "+start+ " ---> "+finish);
    hanoi(n-1,using,finish,start);
    }
}

public static int fibonacci(int n ){
    if(n==0)
        return 0;
    if (n<=2)
        return 1;
    else
        return fibonacci(n-1)+fibonacci(n-2);
}
        


        
        
}