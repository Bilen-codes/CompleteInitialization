/*This program will display an already initialized data for complete initialization assigment. */
public class CompleteInitialization {
    public static void main(String[] args) {
            int workOutDays = 10;
            double health = 8.5;
            boolean powerUp = true;
            // displays the data 
            System.out.println("Number of days: " + workOutDays);
            System.out.println("Health Scale: " + health);
            System.out.println("Are you ready to power up? " + powerUp);
            System.out.printf("Total Assessment: It has been %d days since you've started working out.\n" +
                    "You evaluate at %.1f out of %d on the health scale.\n" +
                    "It is %b that you are ready to power up your workout!", workOutDays, health, workOutDays, powerUp);
    }
}
