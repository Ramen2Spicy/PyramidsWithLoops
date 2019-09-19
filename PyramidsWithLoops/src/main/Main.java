/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
     555555555
*/
package main;


public class Main {
	 public static void main(String[] args) {

		int lines = 5;
		String space = " ";
		int k = 1;
		int space_control = lines;
		for (int i = 1; i < lines+1; i++, space_control--, k = k+2){
			String times = Integer.toString(i);
				System.out.println(space.repeat(space_control) + times.repeat(k));
			}
		
		
		/*	for (int i = 0; i < lines; i++){
					for (int j = 0; j < i+1; j++) {
						System.out.print(space+j);
				System.out.println(space.repeat(lines));
				}
				System.out.println("");*/
			}
		
	
	}