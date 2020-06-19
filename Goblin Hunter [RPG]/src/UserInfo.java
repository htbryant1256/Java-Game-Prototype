/**
 * This class is used to store data for the player name. This makes it easier to modify in the main
 * file.
 * 
 * @author Henry Bryant
 *
 */
public class UserInfo {
  /**
   * Holds the name of the character to print on the start screen.
   */
  private String name;
  /**
   * Holds the player location to print on the start screen.
   */
  private String location;

  /**
   * This method takes in a string name and saves it in this class.
   * 
   * @param name assigned in main.
   */
  UserInfo(String name) {
    this.name = name;
  }

  /**
   * This overload method allows for an int to be used in place of the player name.
   * 
   * @param name assined in main.
   */
  UserInfo(int name) {
    this.name = Integer.toString(name);
  }

  /**
   * Sets where player is from in main.
   * 
   * @param location is assigned in main. Displayed on title screen.
   */
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * Returns the saved name in this class.
   * 
   * @return name.
   */
  public String getName() {
    return name;
  }

  /**
   * returns location of player saved in this class.
   * 
   * @return location.
   */
  public String getLocation() {
    return location;
  }

}
