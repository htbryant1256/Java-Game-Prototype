/*Henry Bryant
The "==" operator does not work with strings because 
it compares the instances of two objects not the true
value of them. That is why .equals is used instead, this command
compares the values in the string instead of the instances.


operator precedence has to do with how java reads operators
in order. Different operators have different precedence levels.
a good way to think of this is PEMDAS.

*/
import java.util.Scanner;
import java.util.Random;

public class Gob_Main {
	public static void main(String[] args) {
		
		int counter = 4;
		int health = 30;
		double enemyHealth = 7;
		double bossHealth = 10;
		Scanner scan = new Scanner(System.in);
		// use of random class
		Random rand = new Random();

		// method calls
		// parameter in method call

		get_scene(0, rand, scan, health, enemyHealth, bossHealth);
		health = get_scene(1, rand, scan, health, enemyHealth, bossHealth);
		health = get_scene(2, rand, scan, health, enemyHealth, bossHealth);
		health = get_scene(3, rand, scan, health, enemyHealth, bossHealth);
		health = get_scene(4, rand, scan, health, enemyHealth, bossHealth);
		for(int i = 1; i < counter; i++) {
			System.out.println(i + "...");
			sleep(1000);
			// the continue command immediately jumps to the update statment
			continue;
		}
		get_scene(5, rand, scan, health, enemyHealth, bossHealth);

	}

//method with arguments
//method header
	public static int get_scene(int select, Random rand, Scanner scan, int health, double enemyHealth,
			double bossHealth) {
		boolean start1 = true;
		boolean start2 = true;
		boolean start3 = true;
		boolean start_boss = true;

		switch(select) {

		case 1:	do {
				String string1 = scan.nextLine();
				if ((string1.toUpperCase()).equals("LEFT")) {
					Transition(1);
					battle(1, health, enemyHealth, bossHealth);
					health = battle_sim(rand, scan, 0, health, enemyHealth, bossHealth);
					// exits the current running loop
					break;
				} else if ((string1.toUpperCase()).equals("RIGHT")) {
					Transition(2);
					battle(2, health, enemyHealth, bossHealth);
					health = battle_sim(rand, scan, 0, health, enemyHealth, bossHealth);

					break;
				} else {
					System.out.println("Type Your Choice");
				}
			} while (start1 == true);
		break;
		

	case 2:	do {
				String string2 = scan.nextLine();
				if ((string2.toUpperCase()).equals("LEFT")) {
					Transition(1);
					battle(1, health, enemyHealth, bossHealth);
					health = battle_sim(rand, scan, 0, health, enemyHealth, bossHealth);
					break;
				} else if ((string2.toUpperCase()).equals("RIGHT")) {
					Transition(2);
					battle(2, health, enemyHealth, bossHealth);
					health = battle_sim(rand, scan, 0, health, enemyHealth, bossHealth);
					break;
				} else {
					System.out.println("Type Your Choice");
				}
			} while (start2 == true);
	break;

	case 3:	do {
				String string3 = scan.nextLine();
				if ((string3.toUpperCase()).equals("LEFT")) {
					Transition(1);
					battle(1, health, enemyHealth, bossHealth);
					health = battle_sim(rand, scan, 0, health, enemyHealth, bossHealth);
					break;
				} else if ((string3.toUpperCase()).equals("RIGHT")) {
					Transition(2);
					battle(2, health, enemyHealth, bossHealth);
					health = battle_sim(rand, scan, 0, health, enemyHealth, bossHealth);
					break;
				} else {
					System.out.println("Type Your Choice");
				}
			} while (start3 == true);
	break;
	case 4: do {
				String string_boss = scan.nextLine();
				if ((string_boss.toUpperCase()).equals("LEFT")) {
					Transition(1);
					battle(3, health, enemyHealth, bossHealth);
					health = battle_sim(rand, scan, 1, health, enemyHealth, bossHealth);
					break;
				} else if ((string_boss.toUpperCase()).equals("RIGHT")) {
					Transition(2);
					battle(3, health, enemyHealth, bossHealth);
					health = battle_sim(rand, scan, 1, health, enemyHealth, bossHealth);
					break;
				} else {
					System.out.println("Type Your Choice");
				}
			} while (start_boss == true);
	break;
	case 5:
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
			break;
	case 0:
			System.out.println("Welcome to Goblin Hunter 3!");
			sleep(1000);
			System.out.println(" _________________________");
			System.out.println("|#########################|");
			System.out.println("|#                       #|");
			System.out.println("|#   The Crystal Castle  #|");
			System.out.println("|#        (DEMO)         #|");
			System.out.println("|#     Left or right     #|");
			System.out.println("|#                       #|");
			System.out.println("|#                       #|");
			System.out.println("|###|   |#########|   |###|");
			break;
		}
		
		return health;
	}

	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
		}
	}

	public static void Transition(int choice) {

		if (choice == 1) {
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
		}
		if (choice == 2) {
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

	public static void battle(int choice, int health_2, double enemy_2, double boss_2) {
		if (choice == 0) {
			sleep(100);
			System.out.println(" _________________________");
			sleep(100);
			System.out.println(
					("|   Health:") + (int) (Math.ceil(health_2)) + (" | Enemy:") + (int) Math.ceil(enemy_2) + (" |"));
			sleep(100);
			System.out.println("|     Attack or Run?      |");
			sleep(100);
			System.out.println("|_________________________|");
		} else if (choice == 1) {
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
			System.out.println(("|   Health:") + (int) (Math.ceil(health_2)) + (" | Enemy:") + (int) Math.ceil(enemy_2)
					+ ("   |"));
			sleep(100);
			System.out.println("|     Attack or Run?      |");
			sleep(100);
			System.out.println("|_________________________|");
		} else if (choice == 2) {
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
			System.out.println(("|   Health:") + (int) (Math.ceil(health_2)) + (" | Enemy:") + (int) Math.ceil(enemy_2)
					+ ("   |"));
			sleep(100);
			System.out.println("|     Attack or Run?      |");
			sleep(100);
			System.out.println("|_________________________|");
		} else if (choice == 3) {
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
			System.out.println(
					("|   Health:") + (int) (Math.ceil(health_2)) + (" | Enemy:") + (int) Math.ceil(boss_2) + ("   |"));
			sleep(100);
			System.out.println("|     Attack or Run?      |");
			sleep(100);
			System.out.println("|_________________________|");
		}

	}

	public static int battle_sim(Random rand, Scanner scan, int boss, int health, double enemyHealth,
			double bossHealth) {
		boolean battle = true;
		int enemyDex = 5;
		int randInt = 0;

		while (battle == true) {
			randInt = rand.nextInt(10) + 1;
			// ternary construct to end game, also allows to end game with admincode
			String battle_choice = health <= 0 ? "ADMINENDGAME" : scan.next();
			if ((battle_choice.toUpperCase()).equals("ADMINENDGAME")) {
				System.out.println("You have Died!");
				System.exit(0);

			} else if ((battle_choice.toUpperCase()).equals("ATTACK") && (enemyHealth > 0) && (boss != 1)) {
				enemyHealth -= 2.5;
				health--;
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
				System.out.println(("|   Health:") + (int) (Math.ceil(health)) + (" | Enemy:")
						+ (int) Math.ceil(enemyHealth) + ("   |"));
				sleep(100);
				System.out.println("|     Attack or Run?      |");
				sleep(100);
				System.out.println("|_________________________|");

			} else if ((battle_choice.toUpperCase()).equals("ATTACK") && (bossHealth > 0) && (boss == 1)) {
				bossHealth -= 2.5;
				health -= 4;
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
				System.out.println(("|   Health:") + (int) (Math.ceil(health)) + (" | Enemy:")
						+ (int) Math.ceil(bossHealth) + ("  |"));
				sleep(100);
				System.out.println("|     Attack or Run?      |");
				sleep(100);
				System.out.println("|_________________________|");

			} else if ((battle_choice.toUpperCase()).equals("RUN") && (boss != 1) && (randInt > enemyDex)) {
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

			} else if ((battle_choice.toUpperCase()).equals("RUN") && (boss == 1)) {
				System.out.println("You Must Kill The Boss!");

			} else if ((battle_choice.toUpperCase()).equals("RUN") && randInt <= enemyDex) {
				System.out.println("Failed to run! Enemy Hits!");
				health--;
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
				System.out.println(("|   Health:") + (int) (Math.ceil(health)) + (" | Enemy:")
						+ (int) Math.ceil(enemyHealth) + ("   |"));
				sleep(100);
				System.out.println("|     Attack or Run?      |");
				sleep(100);
				System.out.println("|_________________________|");

			} else {
				System.out.println("Type Your Choice");

			}

			if (enemyHealth <= 0 && (boss != 1)) {
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
			} else if (bossHealth <= 0 && (boss == 1)) {
				battle = false;
			}
		}
		return health;
	}
}
