
/*
 * Henry Bryant
 * 
 * 
 * 
 * Scope refers to the visibility of variables. depending on where a variable is made, it can be
 * seen in only a single method, or in an entire class. a single method has a small scope, but if a
 * variable can be seen by the entire class it has a large scope.
 * 
 * A variable in computer programming is something that you plan on changing a lot, instead of a
 * piece of data a variable can be used instead. Making that data very easy to change without
 * messing up the rest of the code.
 * 
 * The "==" operator does not work with strings because it compares the instances of two objects not
 * the true value of them. That is why .equals is used instead, this command compares the values in
 * the string instead of the instances.
 * 
 * operator precedence has to do with how java reads operators in order. Different operators have
 * different precedence levels. a good way to think of this is PEMDAS.
 * 
 * Inheritance is when data from a larger parent class can be used in smaller child classes. Parent
 * classes can't use new data created in a child class because of this inheritance. This is very
 * useful because code can be written in the parent class and be used by all child classes below it.
 * Making it very easy for the child classes to all access the same thing.
 * 
 * Polymorphism is when you have multiple child classes that all inherit code from a parent class.
 * If one of the child classes only uses some of the parent code and then the rest is a unique code
 * apart from the other child classes then this is polymorphism
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * This program is both an array minigame and a text game in one. The text game is a dungeon crawler
 * with random rare loot drops.
 * 
 * @author Henry Bryant
 *
 */
public class Main {
  /**
   * this int stores data for the final level int.
   */
  private int finalLevel;

  /**
   * Stores most variables and data. Runs the Array minigame. Runs the after combat screen and adds
   * all the variables up.
   * 
   * @param args Main function.
   */

  public static void main(String[] args) {

    ArrayList<String> inventory = new ArrayList<>();

    // Constructor for main, this was used to satisfy the requirement for a constructor without
    // parameters.


    Main main = new Main();
    UserInfo playerName = new UserInfo("Knight");
    playerName.setLocation("The Stone");

    Scanner scans = new Scanner(System.in, "UTF-8");
    Random rand = new Random();

    // inventoryWorth is the total value of your collected inventory. it is preset at 0.

    double inventoryWorth = 0;

    // weaponDex is the current dexterity rating of the playerWeapon.

    double weaponDex = 0;

    // playerHealth is the starting player health.

    double playerHealth = 50;

    // playerAttack is the base attack damage of the player before weaponAttackDam is added.

    double playerAttack = 3;

    // String for playerWeapon. This is the name of the default weapon.

    String playerWeapon = "Fists";

    // weaponAttackDam is the current player weapon damage.

    int weaponAttackDam = 0;

    // itemChoice is the variable read by the code to either leave a weapon, store a weapon, or take
    // a weapon.

    String itemChoice = "";

    // empty enemy drop Dexterity variable. will be assigned when random weapon is generated.

    double dropDex = 0;

    // empty enemy drop weapon name variable. will be assigned when random weapon is generated.

    String drop = "";

    // empty enemy drop damage variable. will be assigned when random weapon is generated.

    int dropDam = 0;

    // playerGold is starting player gold.

    int playerGold = 20;

    // enemyGold variable declaration, used to store enemy gold data.

    double enemyGold = 0;

    while (true) {
      System.out.println("Welcome to Array Examples!");

      // multiArray used for array examples.

      int[][] multiArray = {{1, 4, 3}, {9, 8, 6}, {7, 1, 1}};

      // intArray used for array examples.

      int[] intArray = {12, 15, 4, 5, 84, 3, 54, 77, 3, 42, 61};

      System.out.println("Would you like [Multi] or [Int] array?\n Type [EXIT] to leave.\n\n");
      String arrayChoice = scans.nextLine();

      // variable for storing largest int in multiArray

      int multiLargeInt = 0;

      // variable for storing x coordinate position of largest int in multiArray

      int multiArrayCoordinateX = 0;

      // * variable for storing y coordinate position of largest int in multiArray

      int multiArrayCoordinateY = 0;
      if (arrayChoice.equalsIgnoreCase("MULTI")) {
        for (int row = 0; row < 3; row++) {
          for (int column = 0; column < 3; column++) {
            System.out.print(multiArray[row][column]);
            if (multiArray[row][column] > multiLargeInt) {
              multiLargeInt = multiArray[row][column];
              multiArrayCoordinateX = row;
              multiArrayCoordinateY = column;
            }
          }
          System.out.println("");
        }

        System.out.println("The largest int is " + multiLargeInt + " its coordinates are ["
            + multiArrayCoordinateX + "] [" + multiArrayCoordinateY + "]");
        System.out.println("\n Press enter to return.");
        scans.nextLine();
      } else if (arrayChoice.equalsIgnoreCase("INT")) {
        System.out.println(Arrays.toString(intArray));

        // variable for storing smallest int in intArray, set to 100 because it is larger than any
        // other number in the array.

        int lowestInt = 100;

        // variable for storing the index of smallest int in intArray.

        int index = 0;

        // variable for storing sum of all numbers in intArray.

        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
          if (intArray[i] < lowestInt) {
            lowestInt = intArray[i];
            index = i;

          }
        }
        // Enchanced for loop.
        for (int item : intArray) {
          sum += item;

        }
        System.out.println("The lowest int is " + lowestInt);
        System.out.println("The index of this int is " + index);
        System.out.println("The sum of the intArray is " + sum);

        System.out.println("\n Press enter to return.");
        scans.nextLine();

      } else if (arrayChoice.equalsIgnoreCase("EXIT")) {
        break;
      }
    }

    System.out.println("[EASY] [MEDIUM] [EXPERT]");

    // String variable declared out of while loop. left empty until asigned.

    String difficulty = "";
    while (true) {
      difficulty = scans.nextLine();

      if (difficulty.equalsIgnoreCase("EASY")) {
        main.setFinalLevel(15);
        break;
      } else if (difficulty.equalsIgnoreCase("MEDIUM")) {
        main.setFinalLevel(23);
        break;
      } else if (difficulty.equalsIgnoreCase("EXPERT")) {
        main.setFinalLevel(30);
        break;
      } else {
        System.out.println("Please type again.");
      }
    }

    System.out.println(" ____________________________________________________________________\n"
        + "|                                                                    |\n"
        + "|                                                                    |\n"
        + "|     __________  ____  __    _____   __                             |\n"
        + "|    / ____/ __ \\/ __ )/ /   /  _/ | / /                             |\n"
        + "|   / / __/ / / / __  / /    / //  |/ /                              |\n"
        + "|  / /_/ / /_/ / /_/ / /____/ // /|  /                               |\n"
        + "|  \\____/\\____/_____/_____/___/_____/ ___   __________________       |\n"
        + "|                          / / / / / / / | / /_  __/ ____/ __ \\      |\n"
        + "|                         / /_/ / / / /  |/ / / / / __/ / /_/ /      |\n"
        + "|                        / __  / /_/ / /|  / / / / /___/ _, _/       |\n"
        + "|                       /_/ /_/\\____/_/ |_/ /_/ /_____/_/ |_|        |\n"
        + "|                                                                    |\n"
        + "|                                                                    |\n" + "  "
        + playerName.getName() + " of " + playerName.getLocation() + "! You must delve to level "
        + (main.getFinalLevel()) + " and defeat the boss!    \n"
        + "|                                                                    |\n"
        + "|                                                                    |\n"
        + "|                           Good luck!                               |\n"
        + "|                                                                    |\n"
        + "|                     [Press enter to begin]                         |\n"
        + "|                                                                    |\n"
        + "|____________________________________________________________________|");
    scans.nextLine();

    for (int i = 0; i < main.getFinalLevel() + 1; i++) {

      // Item constructor to make a new object named item. this is used for randomly generating
      // weapons and random drops.

      Item item = new Item();

      if (i % 3 == 0 && i != 0) {
        // shopSim call and data taken in are the arguments.
        String[] shopArray = shopSim(playerHealth, playerGold, playerWeapon, weaponAttackDam,
            weaponDex, inventoryWorth, inventory);
        playerHealth = Integer.parseInt(shopArray[0]);
        playerGold = Integer.parseInt(shopArray[1]);
        playerWeapon = shopArray[2];
        weaponAttackDam = Integer.parseInt(shopArray[3]);
        playerAttack = 3 + weaponAttackDam;
        inventoryWorth = Integer.parseInt(shopArray[4]);
        weaponDex = Integer.parseInt(shopArray[4]);

      } else {

        playerHealth = runCombat(playerHealth, playerAttack, i, weaponDex, main.getFinalLevel());
        String[] enemyDrop = item.getItem(i);
        dropDex = Integer.parseInt(enemyDrop[2]);
        drop = enemyDrop[0];
        dropDam = Integer.parseInt(enemyDrop[1]);

        if (playerHealth <= 0) {
          System.out.println("You have perished\nGameover!\nYou made it " + i + " rounds!");
          break;
        } else {

          enemyGold = 5 + rand.nextInt(5 + (i / 2)) + 1;
          playerGold += enemyGold;
          System.out
              .println(" ____________________________________________________________________\n"
                  + "|        Player Health: " + Math.ceil(playerHealth)
                  + "                                         |\n" + "|  Level: " + (i + 1)
                  + "                                                          |\n"
                  + "|                                                                    |\n"
                  + "|                                                                    |\n"
                  + "|                                                                    |\n"
                  + "|                                                                    |\n"
                  + "|                                                                    |\n"
                  + "|                                                                    |\n"
                  + "|                                                                    |\n"
                  + "|                       You defeated the enemy!                      |\n"
                  + "|                                                                    |\n"
                  + "    The enemy has dropped: " + drop + " [ATTACK = " + dropDam
                  + "] [DEXTERITY = " + dropDex + "]     \n" + "       Gold coins dropped: "
                  + enemyGold + "                                        \n"
                  + "|                                                                    |\n"
                  + "    Current Weapon: " + playerWeapon + " [ATTACK = " + weaponAttackDam
                  + "] [DEXTERITY = " + weaponDex + "] \n"
                  + "|                                                                    |\n"
                  + "|                                                                    |\n"
                  + "          Your total gold: " + playerGold + "                          \n"
                  + "|                                                                    |\n"
                  + "|                                                                    |\n"
                  + "|       Would you like to take the dropped weapon?[Yes or No]        |\n"
                  + "|                                                                    |\n"
                  + "|                           [Store] in inventory?                    |\n"
                  + "|                                                                    |\n"
                  + "|____________________________________________________________________|");
          

          while (true) {

            itemChoice = scans.nextLine();
            if (itemChoice.equalsIgnoreCase("YES")) {
              inventoryWorth += (weaponAttackDam + weaponDex) / 2;
              inventory.add(playerWeapon);
              playerAttack = 3 + dropDam;
              playerWeapon = drop;
              weaponAttackDam = dropDam;
              weaponDex = dropDex;
              System.out
                  .println("You take the " + drop + "! Your Attack is now " + playerAttack + "!");

              break;
            } else if (itemChoice.equalsIgnoreCase("NO")) {
              System.out.println("You leave the " + drop + " behind!");
              break;
            } else if (itemChoice.equalsIgnoreCase("STORE")) {
              inventory.add(drop);
              System.out.println("Your inventory is now: " + inventory);
              inventoryWorth += (dropDam + dropDex) / 2;
              break;
            } else {
              System.out.println("Please Type Again");
            }
          }

        }

      }
    }
    System.out.println("The End!");
    scans.close();

  }

  /**
   * getFinalLevel method used to return finalLevel.
   * 
   * @return finalLevel
   */

  public int getFinalLevel() {
    return finalLevel;
  }

  /**
   * sets the final level.
   * 
   * @param finalLevel sets this.finalLevel
   */

  public void setFinalLevel(int finalLevel) {
    this.finalLevel = finalLevel + 2;
  }

  /**
   * Runs the combat senario.
   * 
   * @param playerHealth Player health parameter
   * @param playerAttack player total attack damage parameter
   * @param level itterations of the main for loop parameter
   * @param weaponDex player weapon dexterity parameter
   * @param finalLevel Final level the game will run to parameter
   * @return returns an array with all the data that will be set after the combat senario
   */
  // header of runCombat method. data that is being taken in are the parameters
  public static double runCombat(double playerHealth, double playerAttack, int level,
      double weaponDex, int finalLevel) {

    // Constructor for random object named rand in runCombat method.

    Random rand = new Random();

    // Constructor for scan object named scan in runCombat method.

    Scanner scans = new Scanner(System.in, "UTF-8");

    // variable for enemy health. will be set depening on what level player is on and what enemy
    // spawns.

    double enemyHealth = 0;

    // variable for enemy attack damage, will be set depending on what level the player is on and
    // what enemy spawns.

    double enemyAttack = 0;

    // variable for enemy dexterity roll. will be set depending on what level the player is on and
    // what enemy spawns.

    double enemyRoll = 0;

    // variable for player dexterity roll. Will be set depending on what weapon the player is
    // holding.

    double playerRoll = 0;

    // variable that will be used to randomly choose monster spawns, and will also determine when
    // the mini bossess and final boss spawn.

    int randMob = 0;
    if (level == finalLevel) {
      randMob = 4;
    } else if (level % 7 == 0 && level != 0) {
      randMob = 3;
    } else if (level >= 5) {
      randMob = rand.nextInt(2) + 1;

    } else {
      randMob = 1;
    }

    if (randMob == 1) {
      enemyHealth = 4 + (level * .8);
      enemyAttack = 2 + (level * .4);
    } else if (randMob == 2) {
      enemyHealth = 6 + (level * .9);
      enemyAttack = 3 + (level * .5);
    } else if (randMob == 3) {
      enemyHealth = 15 + (level * .9);
      enemyAttack = 5 + (level * .5);
    } else if (randMob == 4) {
      enemyHealth = 20 + (level * .9);
      enemyAttack = 8 + (level * .5);
    }

    if (randMob == 3) {
      System.out.println(" ____________________________________________________________________\n"
          + "|        Player Health: " + Math.ceil(playerHealth) + "               Enemy Health: "
          + Math.ceil(enemyHealth) + "         |\n" + "|  Level: " + (level + 1)
          + "                                                          |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                            MINI BOSS!                              |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                       Press Enter To Fight                         |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|____________________________________________________________________|");
    } else if (randMob == 4) {
      System.out.println(" ____________________________________________________________________\n"
          + "|        Player Health: " + Math.ceil(playerHealth) + "               Enemy Health: "
          + Math.ceil(enemyHealth) + "         |\n" + "|  Level: " + (level + 1)
          + "                                                          |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                            FINAL BOSS!                              |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                       Press Enter To Fight                         |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|____________________________________________________________________|");
    } else {

      System.out.println(" ____________________________________________________________________\n"
          + "|        Player Health: " + Math.ceil(playerHealth) + "               Enemy Health: "
          + Math.ceil(enemyHealth) + "         |\n" + "|  Level: " + (level + 1)
          + "                                                          |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                       Press Enter To Fight                         |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|                                                                    |\n"
          + "|____________________________________________________________________|");
    }

    do {
      if (randMob == 1) {
        enemyRoll = (rand.nextInt(15) + 1) + (.4 * level);

      } else if (randMob == 2) {
        enemyRoll = (rand.nextInt(17) + 1) + (.4 * level);

      } else if (randMob == 3) {
        enemyRoll = (rand.nextInt(20) + 1) + (.4 * level);

      }
      scans.nextLine();

      playerRoll = (rand.nextInt(20) + 1) + weaponDex;


      // constructor for EnemyPhoto to make an object named photo this prints out different monster
      // images depending on what number is sent in

      EnemyPhoto photo = new EnemyPhoto();

      if ((playerRoll >= enemyRoll)) {

        if (playerHealth <= 0) {

          continue;
        }

        enemyHealth -= playerAttack;
        System.out.println(" ____________________________________________________________________\n"
            + "|        Player Health: " + Math.ceil(playerHealth) + "               Enemy Health: "
            + Math.ceil(enemyHealth) + "         |\n" + "|  Level: " + (level + 1)
            + "                                                          |\n"
            + "|                                                                    |\n"
            + "|                                                                    |\n"
            + "|        You hit the enemy for " + Math.ceil(playerAttack)
            + " points of damage!                 |\n"
            + "|                                                                    |");
        // image of monster decided by randMob variable.
        photo.getMob(randMob);

      } else {

        playerHealth -= enemyAttack;
        System.out.println(" ____________________________________________________________________\n"
            + "|        Player Health: " + Math.ceil(playerHealth) + "               Enemy Health: "
            + Math.ceil(enemyHealth) + "         |\n" + "|  Level: " + (level + 1)
            + "                                                          |\n"
            + "|                                                                    |\n"
            + "|                                                                    |\n"
            + "|        You got hit for " + Math.ceil(enemyAttack)
            + " points of damage!                       |\n"
            + "|                                                                    |");
        // image of monster decided by randMob variable.
        photo.getMob(randMob);

      }

    } while (playerHealth > 0 && enemyHealth > 0);

    if (enemyHealth <= 0) {
      scans.nextLine();

      return playerHealth;
    } else if (playerHealth <= 0) {
      scans.close();

      return playerHealth;
    }
    scans.close();
    return 0;
  }

  

  /**
   * Shop Code.
   * 
   * @param playerHealth Player health parameter
   * @param playerGold player total gold parameter
   * @param playerWeapon player weapon string parameter
   * @param weaponAttackDam player weapon parameter
   * @param weaponDex player weapon dexterity parameter
   * @param inventoryWorth total worth of stored inventory parameter
   * @param inventory total inventory array parameter
   * @return returns an array with all data that will be set after the shop
   */

  public static String[] shopSim(double playerHealth, double playerGold, String playerWeapon,
      int weaponAttackDam, double weaponDex, double inventoryWorth, ArrayList<String> inventory) {

    // new scanner object made in shop for choices.

    Scanner scans = new Scanner(System.in, "UTF-8");

    // selection variable used to choose which item the player would like to buy in the shop.
    // declared out of while loop.

    int selection = 0;

    while (true) {
      System.out.println("Would you like to enter the shop? Yes or No");

      // variable used to choose if player will enter or leave shop.

      String input = scans.next();


      if (input.equalsIgnoreCase("YES")) {
        System.out.println(" ____________________________________________________________________\n"
            + "|        Player Health: " + Math.ceil(playerHealth) + "               Player Gold: "
            + Math.ceil(playerGold) + "         |\n"
            + "|____________________________________________________________________|\n"
            + "|                          |        |           |           |        |\n"
            + "|        Name              | Attack | Dexterity |   Buffs   |  Cost  |\n"
            + "|__________________________|________|___________|___________|________|\n"
            + "|  [1] Healing Potion      | null   |   null    |   +20hp   |  35gp  |\n"
            + "|  [2] Claymore            | +8     |    +2     |   null    |  20gp  |\n"
            + "|  [3] Sword of Swiftness  | +7     |    +5     |   null    |  30gp  |\n"
            + "|  [4] Club of Power       | +10    |    +2     |   null    |  40gp  |\n"
            + "|  [5] Blade of Hades      | +8     |    +4     |  +5 flame |  50gp  |\n"
            + "|  [6] Elvin Dagger        | +8     |    +8     |   null    |  70gp  |\n"
            + "|  [7] Dwarvin Frost Dagger| +9     |   +10     |   null    |  80gp  |\n"
            + "|                          |        |           |           |        |\n"
            + "|                          |        |           |           |        |\n"
            + "|  [0] Sell inventory      |        |           |           |+"
            + Math.floor(inventoryWorth) + "gp |\n"
            + "|                          |        |           |           |        |\n"
            + "|                          |        |           |           |        |\n"
            + "|                          |        |           |           |        |\n"
            + "|__________________________|________|___________|___________|________|");
        try {
          selection = scans.nextInt();

        } catch (Exception e) {
          continue;

        }

        if (selection == 1 && playerGold >= 35) {
          playerHealth += 20;
          playerGold -= 35;
          System.out.println("Your health has increased by 20!");
          scans.nextLine();
        } else if (selection == 2 && playerGold >= 20) {
          playerWeapon = "Claymore";
          weaponAttackDam = 8;
          playerGold -= 20;
          weaponDex = 2;
          System.out.println("Your weapon attack damage is now 8!");
          scans.nextLine();

        } else if (selection == 3 && playerGold >= 30) {
          playerWeapon = "Sword of Swiftness";
          weaponAttackDam = 7;
          playerGold -= 30;
          weaponDex = 5;
          System.out.println("Your weapon attack damage is now 7!");
          scans.nextLine();

        } else if (selection == 4 && playerGold >= 40) {
          playerWeapon = "Club of Power";
          weaponAttackDam = 10;
          playerGold -= 40;
          weaponDex = 2;
          System.out.println("Your weapon attack damage is now 10!");
          scans.nextLine();

        } else if (selection == 5 && playerGold >= 50) {
          playerWeapon = "Blade of Hades";
          weaponAttackDam = 13;
          playerGold -= 50;
          weaponDex = 4;
          System.out.println("Your weapon attack damage is now 13!");
          scans.nextLine();


        } else if (selection == 6 && playerGold >= 70) {
          playerWeapon = "Elvin Dagger";
          weaponAttackDam = 8;
          playerGold -= 70;
          weaponDex = 8;
          System.out.println("Your weapon attack damage is now 8!");
          scans.nextLine();


        } else if (selection == 7 && playerGold >= 80) {
          playerWeapon = "Elvin Dagger";
          weaponAttackDam = 9;
          playerGold -= 80;
          weaponDex = 10;
          System.out.println("Your weapon attack damage is now 9!");
          scans.nextLine();


        } else if (selection == 0) {
          playerGold += inventoryWorth;
          System.out.println("You sold your inventory for " + Math.floor(inventoryWorth) + "gp!");
          inventory.clear();
          inventoryWorth = 0;
          scans.nextLine();


        } else {
          System.out.println("Please Type Again");
        }

      } else if (input.equalsIgnoreCase("NO")) {
        System.out.println("You leave the shop.");

        break;
      } else {
        System.out.println("Please Type Again");
      }

    }

    // shop return array that will go back to main and set all the variables to the proper numbers
    // and weapon names.

    String[] shopReturnArray = {Integer.toString((int) playerHealth),
        Integer.toString((int) playerGold), playerWeapon, Integer.toString(weaponAttackDam),
        Integer.toString((int) weaponDex), Integer.toString((int) inventoryWorth)};
    return shopReturnArray;
  }

}
