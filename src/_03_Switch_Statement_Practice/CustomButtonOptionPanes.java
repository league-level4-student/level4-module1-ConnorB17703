package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		switch(choice){
		case "Sunday":{
			System.out.println("time to relax!");
			break;
		}
		case "Monday":{
			System.out.println("UUUGGGHHHHH");
			break;
		}
		case "Tuesday":{
			System.out.println("2 more days to go!");
			break;
		}
		case "Wednesday":{
			System.out.println("WOOOOOOO Wednesday");
			break;
		}
		case "Thursday":{
			System.out.println("Almost friday!!!");
			break;
		}
		case "Friday":{
			System.out.println("YYYYYEEEESSSSS");
			break;
		}
		case "Saturday":{
			System.out.println("THE WEEKEND!!!");
			break;
		}
		}
	}
}
