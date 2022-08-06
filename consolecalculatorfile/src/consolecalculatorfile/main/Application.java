package consolecalculatorfile.main;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {
	static ConsoleCalculator cc = new ConsoleCalculator();
	
	public static void main(String[] args) throws Exception {
		File f = new File("cc.txt");
		FileWriter fWriter = new FileWriter("cc.txt",true);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cc.txt"));
		out.writeObject("cc.txt");
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("cc.txt"));
		in.readObject();
		bWriter.write(cc.getCcdb());
		bWriter.close();
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("Welcome to Console Calculator!");
			System.out.println("Press 1 to trade");
			System.out.println("Press 2 to see your actions and results");
			System.out.println("Press 3 to exit");
			int secim = scn.nextInt();
			scn.nextLine();
			
			if(secim == 3) {
				System.out.println("Program terminated.");
				break;
				
			}else if(secim == 1) {
				cc.consolecalculator();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				LocalDateTime ldt = LocalDateTime.now();
				String dateStr = ldt.format(formatter);
				System.out.println(dateStr);
				cc.saveConsoleCalculator(cc);
				scn.nextLine();
				
			}else if(secim == 2) {
				System.out.println(ConsoleCalculator.getCcdb());
				cc.saveConsoleCalculator(cc);
				scn.nextLine();
				
			}else {
				System.out.println("Wrong choice.");
				break;
			}
}
}
}