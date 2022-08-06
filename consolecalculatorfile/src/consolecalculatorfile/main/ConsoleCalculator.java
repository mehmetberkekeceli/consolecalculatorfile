package consolecalculatorfile.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleCalculator {
	private static BufferedWriter bf;
	private static final String ccdb = "cc.txt";
	
	public void consolecalculator() {
		 String operator;
		    Double number1, number2, result;

		    Scanner scn = new Scanner(System.in);

		    System.out.println("Choose an operator: +, -, *, or /");
		    operator = scn.nextLine();

		    System.out.println("Enter first number");
		    number1 = scn.nextDouble();

		    System.out.println("Enter second number");
		    number2 = scn.nextDouble();

		    switch (operator) {

		      case "+":
		        result = number1 + number2;
		        System.out.println(number1 + " + " + number2 + " = " + result);
		        break;

		      case "-":
		        result = number1 - number2;
		        System.out.println(number1 + " - " + number2 + " = " + result);
		        break;
		        
		      case "*":
		        result = number1 * number2;
		        System.out.println(number1 + " * " + number2 + " = " + result);
		        break;

		      case "/":
		        result = number1 / number2;
		        System.out.println(number1 + " / " + number2 + " = " + result);
		        break;

		      default:
		        System.out.println("Invalid operator!");
		        break;
		    }
		  }
public void saveConsoleCalculator(ConsoleCalculator c) {
		try {
			bf = new BufferedWriter(new FileWriter(ConsoleCalculator.ccdb,true));
			bf.write(ccdb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String getCcdb() {
		return ccdb;
	}
}
