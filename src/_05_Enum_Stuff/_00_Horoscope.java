package _05_Enum_Stuff;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void zState(Zodiac z){
		switch(z){
		case ARIES:{
			System.out.println("Aries: Courage");
			break;
		}
		case TAURUS:{
			System.out.println("Taurus: Dependability");
			break;
		}
		case GEMINI:{
			System.out.println("Gemini: Responsiveness");
			break;
		}
		case CANCER:{
			System.out.println("Cancer: Loyalty");
			break;
		}
		case LEO:{
			System.out.println("Leo: Exuberance");
			break;
		}
		case VIRGO:{
			System.out.println("Virgo: Conscientiousness");
			break;
		}
		case LIBRA:{
			System.out.println("Libra: Charm");
			break;
		}
		case SCORPIO:{
			System.out.println("Scorpio: Idealism");
			break;
		}
		case SAGITTARIUS:{
			System.out.println("Sagittarius: Optimism");
			break;
		}
		case CAPRICORN:{
			System.out.println("Capricorn: Steadiness");
			break;
		}
		case AQUARIUS:{
			System.out.println("Aquarius: Friendliness");
			break;
		}
		case PISCES:{
			System.out.println("Pisces: Compassion");
			break;
		}
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		zState(Zodiac.CANCER);
	}
}

