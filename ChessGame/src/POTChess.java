 import java.util.Scanner;
/*Clasa main a engine-ului de sah. 
 * @author POT Team:
 * @author Petre Gabriel
 * @author Becheru Ovidiu-Cristian
 * @author Tinis Daniel
 * */
public class POTChess {
	
	private static Joc joc;
	private static AI ai;
	public static boolean force=false;
	public static Jucator jucator;
	public static void main(String args[]) throws Exception{
	
		
		String input;
		
		joc = new Joc();
		ai = new AI(joc);
		
		Scanner scanInput = new Scanner(System.in);
	    input = scanInput.nextLine();
		scanInput.close();
		
		if(input.equals("new")){
			joc = new Joc();
			ai = new AI(joc);
			force=false;
		}
		else if (input.equals("quit")){
			System.exit(1);
		}
		else if(input.equals("xboard")){
			POTChess.write(new String());
		}
		else if(input.equals("force")){
			force=true;
		}
		else if (input.equals("white")){
			if(jucator.equals("ALB")){
				System.out.println("E deja alb");
			}
			else{
				GameBoard.swapBoard();
				
			}
		}
		else if (input.equals("black")){
			if(jucator.equals("NEGRU")){
				System.out.println("E deja negru");
			}
			else{
				GameBoard.swapBoard();
			}
			
		}
		else if(input.equals("go")){
			ai.go();
		}
		else if (input.equals("resign")){
			if(jucator.equals("ALB")){
				System.out.println("Palesc in fata ta. 1-0 pentru negru");
				System.exit(2);
			}
			else{
				System.out.println("Intunericul ma inghite! 1-0 pentru alb");
				System.exit(2);
			}
		}
		else if (input.equals("move")){
			System.out.println("awaiting where to move"); 
			String miscare = scanInput.nextLine();
			 if(miscare.length()==4){
				 GameBoard.move(miscare);
			 }
			 else{
				 System.out.println("miscare invalida");
			 }
			 
		}
		
		
		
		
	}

	/*Scrie un mesaj.*/
	public static void write(String string) {
		System.out.println(string);
		System.out.flush();
	}
	/*Scrie o eroare*/
	public void error(String error) {
		System.out.println("Avem o eroare:" + error);
	}
}
