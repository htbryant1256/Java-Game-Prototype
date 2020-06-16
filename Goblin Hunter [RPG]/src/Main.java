import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		double weaponDex = 0;
		double playerHealth = 50;
		double playerAttack = 3;
		int finalLevel = 0;
		String playerWeapon = "Fists";
		int weaponAttackDam = 0;
		String itemChoice = "";
		String[] enemyDrop = {};
		String[] shopArray = {};
		int playerGold = 20;
		double enemyGold = 8;
		
		System.out.println("[EASY] [MEDIUM] [EXPERT]");
		String difficulty = "";
		while(true) {
			 difficulty = scan.nextLine();

			if(difficulty.toUpperCase().equals("EASY")){
				finalLevel = 14;
				break;
			}else if(difficulty.toUpperCase().equals("MEDIUM")){
				finalLevel = 21;
				break;
			}else if(difficulty.toUpperCase().equals("EXPERT")){
				finalLevel = 28;
				break;
			}else {
				System.out.println("Please type again.");
			}
		}
		
		System.out.println(" ____________________________________________________________________\n" +
					       "|                                                                    |\n" +
			           	   "|                                                                    |\n" + 
			           	   "|     __________  ____  __    _____   __                             |\n" + 
			           	   "|    / ____/ __ \\/ __ )/ /   /  _/ | / /                             |\n" + 
			           	   "|   / / __/ / / / __  / /    / //  |/ /                              |\n" + 
			           	   "|  / /_/ / /_/ / /_/ / /____/ // /|  /                               |\n" + 
			           	   "|  \\____/\\____/_____/_____/___/_____/ ___   __________________       |\n" + 
			           	   "|                          / / / / / / / | / /_  __/ ____/ __ \\      |\n" + 
			           	   "|                         / /_/ / / / /  |/ / / / / __/ / /_/ /      |\n" + 
			           	   "|                        / __  / /_/ / /|  / / / / /___/ _, _/       |\n" + 
			           	   "|                       /_/ /_/\\____/_/ |_/ /_/ /_____/_/ |_|        |\n" + 
			           	   "|                                                                    |\n" + 
			           	   "|                                                                    |\n" +
				           "|        You must delve to level " + (finalLevel + 1) + " and defeat the boss!             |\n" + 
			 	           "|                                                                    |\n" +
			           	   "|                                                                    |\n" +
			           	   "|                           Good luck!                               |\n" +
				           "|                                                                    |\n" +
			 	           "|                     [Press enter to begin]                         |\n" +
			           	   "|                                                                    |\n" +
			 	           "|____________________________________________________________________|");
		scan.nextLine();
		
		
		for(int i = 0; i < finalLevel + 1; i++) {	
			
		Item item = new Item();
		
		if(i % 3 == 0 && i != 0) {
			
			shopArray = shopSim(playerHealth, playerGold, playerWeapon, weaponAttackDam, weaponDex);
			playerHealth = Integer.parseInt(shopArray[0]);
			playerGold = Integer.parseInt(shopArray[1]);
			playerWeapon = shopArray[2];
			weaponAttackDam = Integer.parseInt(shopArray[3]) ;
			playerAttack = 3 + weaponAttackDam;
		
		}else {
		
		playerHealth = runCombat(playerHealth, playerAttack, i, weaponDex, finalLevel);
		enemyDrop = item.getItem(i);
		double dropDex = Integer.parseInt(enemyDrop[2]);
		String drop = enemyDrop[0];
		int dropDam = Integer.parseInt(enemyDrop[1]);
		
		if(playerHealth <= 0) {
			System.out.println("You have perished\nGameover!\nYou made it " + i + " rounds!");
			break;
		}else {
			
			enemyGold = 5 + rand.nextInt(5+(i/2))+ 1;
			playerGold += enemyGold;
			System.out.println(" ____________________________________________________________________\n" +
						       "|        Player Health: " + Math.ceil(playerHealth) + "                                         |\n" +
				           	   "|  Level: " + (i + 1) + "                                                          |\n" +
					           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
						       "|                                                                    |\n" +
				           	   "|                                                                    |\n" +
					           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
				 	           "|                       You defeated the enemy!                      |\n" +
						       "|                                                                    |\n" +
				           	   "    The enemy has dropped: " + drop + " [ATTACK = " + dropDam + "] [DEXTERITY = " + dropDex + "]     \n" +
					           "       Gold coins dropped: " + enemyGold + "                                        \n" +
				 	           "|                                                                    |\n" +
				 	           "           Current Weapon: " + playerWeapon + " [ATTACK = " + weaponAttackDam + "] [DEXTERITY = " + weaponDex + "] \n" +
						       "|                                                                    |\n" +
				           	   "|                                                                    |\n" +
					           "          Your total gold: " + playerGold + "                          \n" +
					           "|                                                                    |\n" +
					           "|                                                                    |\n" +
				 	           "|       Would you like to take the dropped weapon?[Yes or No]        |\n" +
				 	           "|                                                                    |\n" +
						       "|                                                                    |\n" +
				           	   "|                                                                    |\n" +
				 	           "|____________________________________________________________________|");
			while(true) {
		
			
			itemChoice = scan.nextLine();
			if(itemChoice.toUpperCase().equals("YES")) {
				playerAttack = 3 + dropDam;
				playerWeapon = drop;
				weaponAttackDam = dropDam;
				weaponDex = dropDex;
				System.out.println("You take the " + drop + "! Your Attack is now "+ playerAttack + "!");
				
				break;
			}else if(itemChoice.toUpperCase().contentEquals("NO")) {
				System.out.println("You leave the " + drop + " behind!");
				break;
			}else {
				System.out.println("Please Type Again");
			}
			}
			
		}
				
	}
	}
		System.out.println("The End!");
}
	
	public static double runCombat(double playerHealth, double playerAttack, int level, double weaponDex, int finalLevel) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		double enemyHealth = 0;
		double enemyAttack = 0;
		double enemyRoll = 0;
		double playerRoll = 0;
		int randMob =  0;
		if(level == finalLevel) {
			randMob = 4;
		}else if(level % 7 == 0 && level != 0) {
			randMob =  3;
		}else if( level >= 5) {
			randMob =  rand.nextInt(2) + 1;

		}else {
			randMob = 1;
		}
		
		if(randMob == 1) {
			enemyHealth = 4 + (level*.8);
			enemyAttack = 2 + (level*.4);
		}else if(randMob == 2) {
			enemyHealth = 6 + (level*.9);
			enemyAttack = 3 + (level*.5);
		}else if(randMob == 3) {
			enemyHealth = 15 + (level*.9);
			enemyAttack = 5 + (level*.5);
		}else if(randMob == 4) {
			enemyHealth = 20 + (level*.9);
			enemyAttack = 8 + (level*.5);
		}
		
		if(randMob == 3) {
			System.out.println(" ____________________________________________________________________\n" +
						       "|        Player Health: " + Math.ceil(playerHealth) + "               Enemy Health: " + Math.ceil(enemyHealth) + "         |\n" +
				           	   "|  Level: " + (level+1) + "                                                          |\n" +
					           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
						       "|                            MINI BOSS!                              |\n" +
				           	   "|                                                                    |\n" +
					           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
				 	           "|                       Press Enter To Fight                         |\n" +
						       "|                                                                    |\n" +
				           	   "|                                                                    |\n" +
					           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
						       "|                                                                    |\n" +
				           	   "|                                                                    |\n" +
					           "|                                                                    |\n" +
					           "|                                                                    |\n" +
					           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
						       "|                                                                    |\n" +
				           	   "|                                                                    |\n" +
				 	           "|____________________________________________________________________|");
		}else if(randMob == 4){
			System.out.println(" ____________________________________________________________________\n" +
						       "|        Player Health: " + Math.ceil(playerHealth) + "               Enemy Health: " + Math.ceil(enemyHealth) + "         |\n" +
				           	   "|  Level: " + (level+1) + "                                                          |\n" +
					           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
						       "|                            FINAL BOSS!                              |\n" +
				           	   "|                                                                    |\n" +
					           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
				 	           "|                       Press Enter To Fight                         |\n" +
						       "|                                                                    |\n" +
				           	   "|                                                                    |\n" +
					           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
						       "|                                                                    |\n" +
				           	   "|                                                                    |\n" +
					           "|                                                                    |\n" +
					           "|                                                                    |\n" +
					           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
						       "|                                                                    |\n" +
				           	   "|                                                                    |\n" +
				 	           "|____________________________________________________________________|");
		}else {
		
		
		System.out.println(" ____________________________________________________________________\n" +
					       "|        Player Health: " + Math.ceil(playerHealth) + "               Enemy Health: " + Math.ceil(enemyHealth) + "         |\n" +
			           	   "|  Level: " + (level+1) + "                                                          |\n" +
				           "|                                                                    |\n" +
			 	           "|                                                                    |\n" +
			 	           "|                                                                    |\n" +
					       "|                                                                    |\n" +
			           	   "|                                                                    |\n" +
				           "|                                                                    |\n" +
			 	           "|                                                                    |\n" +
			 	           "|                       Press Enter To Fight                         |\n" +
					       "|                                                                    |\n" +
			           	   "|                                                                    |\n" +
				           "|                                                                    |\n" +
			 	           "|                                                                    |\n" +
			 	           "|                                                                    |\n" +
					       "|                                                                    |\n" +
			           	   "|                                                                    |\n" +
				           "|                                                                    |\n" +
				           "|                                                                    |\n" +
				           "|                                                                    |\n" +
			 	           "|                                                                    |\n" +
			 	           "|                                                                    |\n" +
					       "|                                                                    |\n" +
			           	   "|                                                                    |\n" +
			 	           "|____________________________________________________________________|");
		}

		do {
			if(randMob ==1) {
				enemyRoll = (rand.nextInt(15) + 1) + (.4*level);

			}else if(randMob == 2) {
				enemyRoll = (rand.nextInt(17) + 1) + (.4*level);

			}else if(randMob == 3){
				enemyRoll = (rand.nextInt(20) + 1) + (.4*level);

			}
			String input = scan.nextLine();

		playerRoll = (rand.nextInt(20) + 1) + weaponDex;
	    enemyPhoto photo = new enemyPhoto();	

		if((playerRoll >= enemyRoll)) {
			
			if(playerHealth <= 0) {

				continue;
			}

			
			enemyHealth -= playerAttack;
			System.out.println(" ____________________________________________________________________\n" +
				       "|        Player Health: " + Math.ceil(playerHealth) + "               Enemy Health: " + Math.ceil(enemyHealth) + "         |\n" +
				       "|  Level: " + (level+1) + "                                                          |\n" +
			           "|                                                                    |\n" +
		 	           "|                                                                    |\n" +
		 	           "|        You hit the enemy for " + Math.ceil(playerAttack) + " points of damage!                 |\n" +
				       "|                                                                    |" );
				       photo.getMob(randMob);

		}else {
			
			playerHealth -= enemyAttack;
			System.out.println(" ____________________________________________________________________\n" +
						       "|        Player Health: " + Math.ceil(playerHealth) + "               Enemy Health: " + Math.ceil(enemyHealth) + "         |\n" +
						       "|  Level: " + (level+1) + "                                                          |\n" +
					           "|                                                                    |\n" +
				 	           "|                                                                    |\n" +
				 	           "|        You got hit for " + Math.ceil(enemyAttack) + " points of damage!                       |\n" +
						       "|                                                                    |");
						       photo.getMob(randMob);

			
		}
		
		
		}while(playerHealth > 0 && enemyHealth > 0);
		
		if(enemyHealth <= 0) {
	        String input = scan.nextLine();

			return playerHealth;
		}else if(playerHealth <= 0) {
			return playerHealth;
		}else {
			return 0;
		}
	}
	
	
	public static String[] shopSim(double playerHealth, double playerGold, String playerWeapon, int weaponAttackDam, double weaponDex) {
		Scanner scan = new Scanner(System.in);
		boolean shop;
		while(shop = true) {
			System.out.println("Would you like to enter the shop? Yes or No");
			String input = scan.next();

			if(input.toUpperCase().equals("YES")) {
				System.out.println(" ____________________________________________________________________\n" +
					       "|        Player Health: " + Math.ceil(playerHealth) + "               Player Gold: " + Math.ceil(playerGold) + "         |\n" +
			           	   "|____________________________________________________________________|\n" +
				           "|                          |        |           |           |        |\n" +
			 	           "|        Name              | Attack | Dexterity |   Buffs   |  Cost  |\n" +
			 	           "|__________________________|________|___________|___________|________|\n" +
					       "|  [1] Healing Potion      | null   |   null    |   +20hp   |  20gp  |\n" +
			           	   "|  [2] Claymore            | +8     |    +0     |   null    |  20gp  |\n" +
				           "|  [3] Sword of Swiftness  | +7     |    +5     |   null    |  30gp  |\n" +
			 	           "|  [4] Club of Power       | +10    |    +2     |   null    |  40gp  |\n" +
			 	           "|  [5] Blade of Hades      | +8     |    +4     |  +5 flame |  50gp  |\n" +
					       "|                          |        |           |           |        |\n" +
			           	   "|                          |        |           |           |        |\n" +
				           "|                          |        |           |           |        |\n" +
			 	           "|                          |        |           |           |        |\n" +
			 	           "|                          |        |           |           |        |\n" +
					       "|                          |        |           |           |        |\n" +
			           	   "|                          |        |           |           |        |\n" +
				           "|                          |        |           |           |        |\n" +
			 	           "|__________________________|________|___________|___________|________|");
					int selection = 0;	
					try {
							selection = scan.nextInt();

							
						}catch(Exception e) {
							continue;
							
						}
							
							
							
						if(selection == 1 && playerGold >= 20 ){
							playerHealth += 20;
							playerGold -= 20;
							System.out.println("Your health has increased by 20!");
							input = scan.nextLine();
						}else if(selection == 2 && playerGold >= 20){
							playerWeapon = "Claymore";
							weaponAttackDam = 8;
							playerGold -= 20;
							weaponDex = 0;
							System.out.println("Your weapon attack damage is now 8!");
						}else if(selection == 3 && playerGold >= 30){
							playerWeapon = "Sword of Swiftness";
							weaponAttackDam = 7;
							playerGold -= 30;
							weaponDex = 5;
							System.out.println("Your weapon attack damage is now 7!");
						}else if(selection == 4 && playerGold >= 40){
							playerWeapon = "Club of Power";
							weaponAttackDam = 10;
							playerGold -= 40;
							weaponDex = 2;
							System.out.println("Your weapon attack damage is now 10!");
						}else if(selection == 5 && playerGold >= 50){
							playerWeapon = "Blade of Hades";
							weaponAttackDam = 13;
							playerGold -= 50;
							weaponDex = 4;
							System.out.println("Your weapon attack damage is now 13!");
						}else {
							System.out.println("Please Type Again");
						}
				
				
			}else if(input.toUpperCase().contentEquals("NO")) {
				System.out.println("You leave the shop.");
				shop = false;
				break;
			}else {
				System.out.println("Please Type Again");
			}
			 
		
		
		}
		String[] shopReturnArray = {Integer.toString((int)playerHealth), Integer.toString((int)playerGold), playerWeapon, Integer.toString(weaponAttackDam), Integer.toString((int)weaponDex)};
		return shopReturnArray;
	}
}
