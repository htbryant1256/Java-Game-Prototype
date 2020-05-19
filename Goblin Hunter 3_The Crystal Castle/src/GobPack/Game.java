/*Henry Bryant
I wanted to make a side scrolling game but I 
didn't know enough yet to do so, so I used the 
text scrolling upward as a way to advance the stage.

The Game is still very basic, no matter what you win.
I plan on continuing the game.

byte: Stores very small numbers
char: Stores a single character
short: Stores from around -33,000 to 33,000 
int: Stores whole numbers
long: Stores large whole numbers
float: Stores decimal numbers up to 7 digits
double: Stores decimal numbers up to 15 digits
boolean: Stores True or False

variable: a placeholder to store data.

scope: acessability of a variable, depends on where 
the variable was declared*/


package GobPack;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		//Starting Stats
		
		final int health = 20;
/*health is a final variable because I am still 
working on the game and don't need that variable to change.*/
		double enemyHealth = 5;
		System.out.println("Welcome to Goblin Hunter 3!");
		//Starting Screen
		Scanner scan = new Scanner(System.in);
		sleep(500);
		System.out.println(" _________________________");
		System.out.println("|#########################|");
		System.out.println("|#                       #|");
		System.out.println("|#   The Crystal Castle  #|");
		System.out.println("|#        (DEMO)         #|");
		System.out.println("|#     Left or right     #|");
		System.out.println("|#                       #|");
		System.out.println("|#                       #|");
		System.out.println("|###|   |#########|   |###|");
		
		//Scene One
		
		boolean start1 = true;
		while(start1 == true) {
			String string1 = scan.nextLine();
			if((string1.toUpperCase()).equals("LEFT")){
				Transition(1);
				battle(1,health,enemyHealth);
				battle_sim(0,health,enemyHealth);
				start1 = false;
				
			}else if((string1.toUpperCase()).equals("RIGHT")) {
				
				Transition(2);
				battle(2,health,enemyHealth);
				battle_sim(0,health,enemyHealth);
				start1 = false;
				
			}else {
				System.out.println("Error, Please Type Again.");
			}
		}
		
		
		//Scene Two
		
		boolean start2 = true;
		while(start2 == true) {
			String string2 = scan.nextLine();
			if((string2.toUpperCase()).equals("LEFT")){
				Transition(1);
				battle(1,health,enemyHealth);
				battle_sim(0,health,enemyHealth);
				start2 = false;
				
			}else if((string2.toUpperCase()).equals("RIGHT")) {
				
				Transition(2);
				battle(2,health,enemyHealth);
				battle_sim(0,health,enemyHealth);
				start2 = false;
				
			}else {
				System.out.println("Error, Please Type Again.");
			}
		}
			
		boolean start3 = true;
		while(start3 == true) {
			String string3 = scan.nextLine();
			if((string3.toUpperCase()).equals("LEFT")){
				Transition(1);
				battle(1,health,enemyHealth);
				battle_sim(0,health,enemyHealth);
				start3 = false;
				
			}else if((string3.toUpperCase()).equals("RIGHT")) {
				
				Transition(2);
				battle(2,health,enemyHealth);
				battle_sim(0,health,enemyHealth);
				start3 = false;
				
			}else {
				System.out.println("Error, Please Type Again.");
			}
		}
		boolean start_boss = true;
		while(start_boss == true) {
			String string_boss = scan.nextLine();
			if((string_boss.toUpperCase()).equals("LEFT")){
				Transition(1);
				battle(3,health,enemyHealth);
				battle_sim(1,health,enemyHealth);
				start_boss = false;
				
			}else if((string_boss.toUpperCase()).equals("RIGHT")) {
				
				Transition(2);
				battle(3,health,enemyHealth);
				battle_sim(1,health,enemyHealth);
				start_boss = false;
				
			}else {
				System.out.println("Error, Please Type Again.");
			}
		}	
		
		sleep(500);
		System.out.println(" _________________________");
		sleep(100);
		System.out.println("|#########################|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|#   The Crystal Castle  #|");
		sleep(100);
		System.out.println("|#        (DEMO)         #|");
		sleep(100);
		System.out.println("|#       THE END!        #|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|#########################|");
		sleep(100);
		
	}
		
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {}
		}

	
public static void Transition(int choice) {
		
	
	if(choice == 1) {
		System.out.println("|###|   |#################|");
		sleep(100);
		System.out.println("|#  |   |                #|");
		sleep(100);
		System.out.println("|#  |   |                #|");
		sleep(100);
		System.out.println("|#  |   |________        #|");
		sleep(100);
		System.out.println("|#  |            |       #|");
		sleep(100); 
		System.out.println("|#  |______      |       #|");
		sleep(100);
		System.out.println("|#         |     |       #|");
		sleep(100);
		System.out.println("|#         |     |       #|");
		sleep(100);
		System.out.println("|#         |     |       #|");
		sleep(100);
		System.out.println("|#         |     |       #|");
		sleep(100);
		System.out.println("|##########|     |########|");
	}if(choice == 2) {
		System.out.println("|#################|   |###|");
		sleep(100);
		System.out.println("|#                |   |  #|");
		sleep(100);
		System.out.println("|#                |   |  #|");
		sleep(100);
		System.out.println("|#          ______|   |  #|");
		sleep(100);
		System.out.println("|#         |          |  #|");
		sleep(100); 
		System.out.println("|#         |      ____|  #|");
		sleep(100);
		System.out.println("|#         |     |       #|");
		sleep(100);
		System.out.println("|#         |     |       #|");
		sleep(100);
		System.out.println("|#         |     |       #|");
		sleep(100);
		System.out.println("|#         |     |       #|");
		sleep(100);
		System.out.println("|##########|     |########|");
	}
	}

public static void battle(int choice, int health_2, double enemy_2) {
	if(choice == 0) {
		sleep(100);
		System.out.println(" _________________________");
		sleep(100);
		System.out.println(("|   Health:") + (health_2) + (" | Enemy:") + enemy_2 + (" |"));
		sleep(100);
		System.out.println("|     Attack or Run?      |");
		sleep(100);
		System.out.println("|_________________________|");
	}else if(choice == 1) {
		sleep(500);
		System.out.println("|##########|     |########|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|#     o/                #|");
		sleep(100);
		System.out.println("|#    /|                 #|");
		sleep(100);
		System.out.println("|#    | |                #|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println(" _________________________");
		sleep(100);
		System.out.println(("|   Health:") + (health_2) + (" | Enemy:") + enemy_2 + (" |"));
		sleep(100);
		System.out.println("|     Attack or Run?      |");
		sleep(100);
		System.out.println("|_________________________|");
	}else if(choice == 2) {
		sleep(500);
		System.out.println("|##########|     |########|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|#               o/      #|");
		sleep(100);
		System.out.println("|#              /|       #|");
		sleep(100);
		System.out.println("|#              | |      #|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|###|   |#########|   |###|");
		sleep(100);
		System.out.println(" _________________________");
		sleep(100);
		System.out.println(("|   Health:") + (health_2) + (" | Enemy:") + enemy_2 + (" |"));
		sleep(100);
		System.out.println("|     Attack or Run?      |");
		sleep(100);
		System.out.println("|_________________________|");
	}else if(choice == 3) {
		sleep(500);
		System.out.println("|##########|     |########|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|#      FINAL BOSS       #|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|#                       #|");
		sleep(100);
		System.out.println("|#########################|");
		sleep(100);
		System.out.println(" _________________________");
		sleep(100);
		System.out.println(("|   Health:") + (health_2) + (" | Enemy:") + enemy_2 + (" |"));
		sleep(100);
		System.out.println("|     Attack or Run?      |");
		sleep(100);
		System.out.println("|_________________________|");
	}
	
}

public static void battle_sim(int boss, int health, double enemyHealth) {
	boolean battle = true;
	
	Scanner scan_battle = new Scanner(System.in);
	
	while(battle == true) {
		String battle_choice = scan_battle.next();
		if((battle_choice.toUpperCase()).equals("ATTACK") && (enemyHealth > 0)){
			enemyHealth -= 2.5;
			
			sleep(500);
			System.out.println("|##########|     |########|");
			sleep(100);
			System.out.println("|#                       #|");
			sleep(100);
			System.out.println("|#                       #|");
			sleep(100);
			System.out.println("|#                       #|");
			sleep(100);
			System.out.println("|#               o/      #|");
			sleep(100);
			System.out.println("|#              /|       #|");
			sleep(100);
			System.out.println("|#              | |      #|");
			sleep(100);
			System.out.println("|#                       #|");
			sleep(100);
			System.out.println("|###|   |#########|   |###|");
			sleep(100);
			System.out.println(" _________________________");
			sleep(100);
			System.out.println(("|   Health:") + (health) + (" | Enemy:") + enemyHealth + (" |"));
			sleep(100);
			System.out.println("|     Attack or Run?      |");
			sleep(100);
			System.out.println("|_________________________|");
			
		
		}else if((battle_choice.toUpperCase()).equals("RUN") && (boss != 1)){
			battle = false;
			sleep(500);
			System.out.println("|##########|     |########|");
			sleep(100);
			System.out.println("|#     You Ran Away!     #|");
			sleep(100);
			System.out.println("|#                       #|");
			sleep(100);
			System.out.println("|#                       #|");
			sleep(100);
			System.out.println("|#    Left Or Right?     #|");
			sleep(100);
			System.out.println("|#                       #|");
			sleep(100);
			System.out.println("|#                       #|");
			sleep(100);
			System.out.println("|#                       #|");
			sleep(100);
			System.out.println("|###|   |#########|   |###|");
			 
		}else if((battle_choice.toUpperCase()).equals("RUN") && (boss == 1)){
			System.out.println("You Must Kill The Boss!");
			
			 
		}else {
			System.out.println("Error, Please Type Again.");
		}
		
		if(enemyHealth <= 0 && (boss != 1)) {
			sleep(500);
			System.out.println("|##########|     |########|");
			sleep(100);
			System.out.println("|#    Enemy Defeated!    #|");
			sleep(100);
			System.out.println("|#                       #|");
			sleep(100);
			System.out.println("|#                       #|");
			sleep(100);
			System.out.println("|#    Left Or Right?     #|");
			sleep(100);
			System.out.println("|#                       #|");
			sleep(100);
			System.out.println("|#                       #|");
			sleep(100);
			System.out.println("|#                       #|");
			sleep(100);
			System.out.println("|###|   |#########|   |###|");
			battle = false;
	}else if(enemyHealth <= 0 && (boss == 1)) {
		battle = false;
}
		}
}
}
