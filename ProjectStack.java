package stack;

import java.util.Scanner;
import java.util.Stack;

public class ProjectStack {
	
public static String stackMethod(String[] input) {
		
		
		String output = "";
		
		for ( int i = 0; i < input.length; i++) {
			
			Stack<Character> stack = new Stack<>();
			
			String word = input[i];
			
			char[] ch = word.toCharArray();
			
			for (int j = 0; j < word.length(); j++) {
	            stack.push(ch[j]);
			}
	            
	       int k = 0;
	       
	       while (!stack.isEmpty()){
	            
	            ch[k++] = stack.pop();
	       }
	      output += String.copyValueOf(ch) + " ";
		}
		return output;
	}
	
	
	public static void main(String[]args) {
		
		
		System.out.println("Type sentence");
		
		Scanner scrn = new Scanner(System.in);
		
		String input = scrn.nextLine();
		
		String[] pinput = input.split(" ");
		
		String output = stackMethod(pinput);
		
		System.out.println(output);
		
	}


}
