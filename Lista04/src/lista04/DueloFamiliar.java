package lista04;
import java.util.Scanner;

public class DueloFamiliar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int lifeLuke, lifeDarth, atkLuke, atkDarth;
		lifeLuke = in.nextInt();
		lifeDarth = in.nextInt();
		
		boolean check1Luke, check2Luke, check1Darth, check2Darth;
		check1Darth = check1Luke = check2Darth = check2Luke = true;
		
		int[][] luke, darth;
		luke = new int[3][3];
		darth = new int[3][3];

		while(lifeDarth > 0 || lifeDarth > 0 || in.hasNextInt()) {			
			//Create attack arrays
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					luke[i][j] = in.nextInt();
				}
			}
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					darth[i][j] = in.nextInt();
				}
			}
			
			//Check luke 1st diagonals
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(j != i && luke[i][j] != 0) {
						check1Luke = false;
					} else if(j == i && luke[i][j] != 1) {
						check1Luke = false;
					}
				}
			}
			
			//Check luke 2nd diagonal
			for(int i = 2; i >= 0; i--) {
				for(int j = 2; j >= 0; j--) {
					if(j != i && luke[i][j] != 0) {
						check2Luke = false;
					} else if(j == i && luke[i][j] != 1) {
						check2Luke = false;
					}
				}
			}
			
			//Check darth 1st diagonals
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(j != i && darth[i][j] != 0) {
						check1Darth = false;
					} else if(j == i && darth[i][j] != 1) {
						check1Darth = false;
					}
				}
			}
			
			//Check darth 2nd diagonal
			for(int i = 2; i >= 0; i--) {
				for(int j = 2; j >= 0; j--) {
					if(j != i && darth[i][j] != 0) {
						check2Darth = false;
					} else if(j == i && darth[i][j] != 1) {
						check2Darth = false;
					}
				}
			}
			
			//Damages
			if(check1Luke == check1Darth || check2Luke == check2Darth) {
				lifeDarth-=15;
				lifeLuke-=15;
			} else if(check1Luke == check2Darth || check2Luke == check1Darth) {
				//nada
			} else if(check1Luke || check2Luke) {
				lifeDarth-=15;
			} else if(check1Darth || check2Darth) {
				lifeLuke-=15;
			}
			
			//Check if still alive
			if(lifeDarth <= 0 && lifeLuke > 0) {
				System.out.println("Luke Skywalker venceu.");
			} else if(lifeLuke <= 0 && lifeDarth > 0) {
				System.out.println("Darth Vader venceu.");
			} else if(lifeDarth <= 0 && lifeDarth <= 0) {
				System.out.println("Houve empate.");
			}
			
			check1Darth = check1Luke = check2Darth = check2Luke = true;
			
		}
		
		//Check if both are alive or if has more life
		if(lifeDarth > lifeDarth) {
			System.out.println("Darth Vader venceu.");
		} else if(lifeLuke > lifeDarth) {
			System.out.println("Luke Skywalker venceu.");
		}
		
	}

}
