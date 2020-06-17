import java.util.Random;


public class Item {
    private double rollScaling = .8;

    public  String[] getItem(int i) {
        Random rand = new Random();
        double rareRoll = rand.nextInt(20) + 1;
        double veryRareRoll = rand.nextInt(40) + 1;
        if (i % 7 == 0 && i != 0) {
            int randInt = 0;

            String[] itemArray = { "Demonic Bow", "Staff of Pain", "Demon Scythe", "Titan Club" };
            int[] itemDamageArray = { 9, 12, 10, 15 };
            int[] itemDexArray = { 9, 4, 7, 3 };

            randInt = rand.nextInt(itemArray.length) + 1;

            String[] returnArray = { itemArray[randInt - 1], Integer.toString(itemDamageArray[randInt - 1]),
                    Integer.toString(itemDexArray[randInt - 1]) };

            return returnArray;

        } else if (rareRoll > 24 - (rollScaling * i)) {
            int randInt = 0;

            String[] itemArray = { "Elvin Glass Sword", "Dwarven Gold Axe", "Bow of Ice", "Club of Crushing" };
            int[] itemDamageArray = { 11, 9, 8, 12 };
            int[] itemDexArray = { 5, 4, 6, 2 };

            randInt = rand.nextInt(itemArray.length) + 1;

            String[] returnArray = { itemArray[randInt - 1], Integer.toString(itemDamageArray[randInt - 1]),
                    Integer.toString(itemDexArray[randInt - 1]) };

            return returnArray;
        } else if (veryRareRoll > 46 - (rollScaling * i)) {
            int randInt = 0;

            String[] itemArray = { "Wizards Scepter", "Bane of Arthopods", "Chicken Wing", "The Dragons Fang","Diamond Sword","Dagger of Speed"};
            int[] itemDamageArray = { 16, 18, 30, 24, 25, 10};
            int[] itemDexArray = { 6, 9, 6, 10, 12, 20};
 
            randInt = rand.nextInt(itemArray.length) + 1;

            String[] returnArray = { itemArray[randInt - 1], Integer.toString(itemDamageArray[randInt - 1]),
                    Integer.toString(itemDexArray[randInt - 1]) };

            return returnArray;

        } else {

            int randInt = 0;

            String[] itemArray = { "Sword", "Axe", "Spear", "Club" };
            int[] itemDamageArray = { 5, 3, 2, 2 };
            int[] itemDexArray = { 3, 2, 2, 1 };

            randInt = rand.nextInt(itemArray.length) + 1;

            String[] returnArray = { itemArray[randInt - 1], Integer.toString(itemDamageArray[randInt - 1]),
                    Integer.toString(itemDexArray[randInt - 1]) };

            return returnArray;
        }

    }
}
