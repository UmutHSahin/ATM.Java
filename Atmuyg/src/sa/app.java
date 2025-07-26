package sa;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		//Umut Sahin Iban: TR1234 567 891 1234 56 78
		//Umut username: umut123 password: 123
		
		//Ozan Sahin Iban: TR1234 567 891 1234 56 87
		//Ozan username: ozan456 password: 456

		/*
		 
		 *For Balance  1
		 *For Withdraw 2
		 *Transfer 3
		 *Exit q
		 *
		 *
		 *
		 *
		 */
		Scanner scanner = new Scanner(System.in);
		
		String options ="See Balance -->1"
				+ "Withdraw -->2"
				+ "Transfer to Different Account -->3"
				+ "For Exit Click q";
		
		double umutBalance = 2500;
		String umutIban = "TR1234 567 891 1234 56 78";
		String umutUsername ="umut123";
		String umutPassword = "123";
		
		
		double ozanBalance = 3000;
		String ozanIban = "TR1234 567 891 1234 56 87";
		String ozanUsername ="ozan456";
		String ozanPassword = "456";
		
		
		
		System.out.println("Welcome...");
		System.out.println("Please Enter Informations...");
		
		System.out.print("Username:");
		String username= scanner.nextLine();
		
		System.out.print("Password:");
		String password= scanner.nextLine();

		if(username.equals(umutUsername) && password.equals(umutPassword)) {
		
			System.out.println("Umut Welcome to Our ATM");
			System.out.println(options);

			System.out.println("Please Choose the Option");
			String choosen = scanner.nextLine();

			
			switch(choosen) 
			{
			case "1":
				System.out.println("Your Balance:" + umutBalance);
				break;
				
			case "2": System.out.println("Enter Amout of Withdraw");
			          int amountWithdraw = scanner.nextInt();
			          if(amountWithdraw>=umutBalance) {
			        	  umutBalance-=amountWithdraw;
			        	  System.out.println("New Balance:" + umutBalance);
			        	  
			          }else {
			        	  System.out.println("You cant withdraw more than your balance!!!");

			          }
			break;
			
			case "3": System.out.println("Enter Amount of Transfer: ");
						int amountTransfer= scanner.nextInt();
						if(amountTransfer<=umutBalance) {
							
							System.out.print("Enter IBAN:");
							scanner.nextLine();
							String transferIban = scanner.nextLine();
							
							if(transferIban.equals(ozanIban)) {
								
								System.out.println("Transfer to Ozan Balance...");
								umutBalance-=amountTransfer;
								ozanBalance+=amountTransfer;
								System.out.println("New Balance: "+ umutBalance);

								
							}
							
						}
			
			}
			
			
			
			
			
			
		}else if(username.equals(ozanUsername) && password.equals(ozanPassword)) {

			System.out.println("Ozan Welcome to Our ATM");
			System.out.println(options);
			
			System.out.println("Please Choose the Option");
			String choosen = scanner.nextLine();
			

			switch(choosen) 
			{
			case "1":
				System.out.println("Your Balance:" + ozanBalance);
				break;
				
			case "2": System.out.println("Enter Amout of Withdraw");
			          int amountWithdraw = scanner.nextInt();
			          if(amountWithdraw>=ozanBalance) {
			        	  ozanBalance-=amountWithdraw;
			        	  System.out.println("New Balance:" + ozanBalance);
			        	  
			          }else {
			        	  System.out.println("You cant withdraw more than your balance!!!");

			          }
			break;
			
			case "3": System.out.println("Enter Amount of Transfer: ");
						int amountTransfer= scanner.nextInt();
						if(amountTransfer<=ozanBalance) {
							
							System.out.print("Enter IBAN:");
							scanner.nextLine();
							String transferIban = scanner.nextLine();
							
							if(transferIban.equals(umutIban)) {
								
								System.out.println("Transfer to Ozan Balance...");
								ozanBalance-=amountTransfer;
								umutBalance+=amountTransfer;
								System.out.println("New Balance: "+ ozanBalance);

								
							}
							
						}
			
			}
			
			
			
		}else {
			
			System.out.println("Username or Password is wrong try again.");

		}
		
		
	}
}
