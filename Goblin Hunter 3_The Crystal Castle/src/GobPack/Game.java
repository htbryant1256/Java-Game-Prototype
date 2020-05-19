package GobPack;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		//Starting Stats
		
		int health = 20;
		double enemyHealth = 5;
		
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
		
		int start1 = 1;
		while(start1 == 1) {
			String string1 = scan.nextLine();
			if((string1.toUpperCase()).equals("LEFT")){
				Transition(1);
				battle(1,health,enemyHealth);
				battle_sim(0,health,enemyHealth);
				start1 = 0;
				
			}else if((string1.toUpperCase()).equals("RIGHT")) {
				
				Transition(2);
				battle(2,health,enemyHealth);
				battle_sim(0,health,enemyHealth);
				start1 = 0;
				
			}else {
				System.out.println("Error, Please Type Again.");
			}
		}
		
		
		//Scene Two
		
		int start2 = 1;
		while(start2 == 1) {
			String string2 = scan.nextLine();
			if((string2.toUpperCase()).equals("LEFT")){
				Transition(1);
				battle(1,health,enemyHealth);
				battle_sim(0,health,enemyHealth);
				start2 = 0;
				
			}else if((string2.toUpperCase()).equals("RIGHT")) {
				
				Transition(2);
				battle(2,health,enemyHealth);
				battle_sim(0,health,enemyHealth);
				start2 = 0;
				
			}else {
				System.out.println("Error, Please Type Again.");
			}
		}
			
		int start3 = 1;
		while(start3 == 1) {
			String string3 = scan.nextLine();
			if((string3.toUpperCase()).equals("LEFT")){
				Transition(1);
				battle(1,health,enemyHealth);
				battle_sim(0,health,enemyHealth);
				start3 = 0;
				
			}else if((string3.toUpperCase()).equals("RIGHT")) {
				
				Transition(2);
				battle(2,health,enemyHealth);
				battle_sim(0,health,enemyHealth);
				start3 = 0;
				
			}else {
				System.out.println("Error, Please Type Again.");
			}
		}
		int start_boss = 1;
		while(start_boss == 1) {
			String string_boss = scan.nextLine();
			if((string_boss.toUpperCase()).equals("LEFT")){
				Transition(1);
				battle(3,health,enemyHealth);
				battle_sim(1,health,enemyHealth);
				start_boss = 0;
				
			}else if((string_boss.toUpperCase()).equals("RIGHT")) {
				
				Transition(2);
				battle(3,health,enemyHealth);
				battle_sim(1,health,enemyHealth);
				start_boss = 0;
				
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
	int battle = 1;
	
	Scanner scan_battle = new Scanner(System.in);
	
	while(battle == 1) {
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
			battle = 0;
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
			battle = 0;
	}else if(enemyHealth <= 0 && (boss == 1)) {
		battle = 0;
}
		}
}
}
