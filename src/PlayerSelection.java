import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        Scanner footballInfo =new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = footballInfo.nextLine();
        System.out.println("Enter Your Age: ");
        int age = footballInfo.nextInt();
        System.out.println("Enter Your Height: ");
        float height = footballInfo.nextFloat();
        System.out.println("Enter Your Weight: ");
        float weight = footballInfo.nextFloat();
        System.out.println("Enter Your Jersey Number: ");
        int jersey_number = footballInfo.nextInt();

        float pound =0.45359237f;
        int meter =100;
        float weight_inKilos =weight* pound;
        float height_inCentimeters=height * meter;

        age++;
        jersey_number--;

        boolean eligible_age = (age>= 18 && age<= 35);
        boolean eligible_weight = (weight_inKilos< 90);
        boolean is_eligible = (eligible_age && eligible_weight);

        String category;
        if (age < 20) {
            category ="Rising Star";
        } else if (age<= 30) {
            category ="Prime Player";
        } else {
            category ="Veteran";
        }

        System.out.print("Coach, enter the jersey number again: ");
        int coachJersey =footballInfo.nextInt();
        String position;
        switch (coachJersey) {
            case 1: position ="Goalkeeper"; break;
            case 2: case 5: position= "Defender"; break;
            case 6: case 8: position= "Midfielder"; break;
            case 7: case 11: position= "Winger"; break;
            case 9: position ="Striker"; break;
            case 10: position ="Playmaker"; break;
            default: position ="Unknown"; break;
        }

        switch (coachJersey) {
            case 2:
                System.out.println("Defender (Case 2)");
            case 6:
                System.out.println("Midfielder (Case 6)");
            case 7:
                System.out.println("Winger (Case 7)");
            default:
                System.out.println("Default case executed");
        }

        switch (coachJersey) {
            case 1:System.out.println("Goalkeeper"); break;
            case 2:case 5:System.out.println("Defender"); break;
            case 6:case 8: System.out.println("Midfielder"); break;
            case 7:case 11: System.out.println("Winger"); break;
            case 9:System.out.println("Striker"); break;
            case 10:System.out.println("Playmaker"); break;
            default:System.out.println("Unknown"); break;
        }

        String lineupDecision;
        if (age >= 20 && age <= 30) {
            if (weight_inKilos < 80) {
                lineupDecision = "Prime Player";
            } else {
                lineupDecision = "Not a Prime Player";
            }
        } else {
            lineupDecision = "Bench";
        }

        String finalStatus = is_eligible ? "Play" : "Rest";

        System.out.println("Player: "+name);
        System.out.println("Age: " +age+ " (" +category+ ")");
        System.out.println("Height: " +(int) height_inCentimeters+ "cm");
        System.out.println("Weight: " +(int) weight_inKilos+ "kg");
        System.out.println("Jersey: " +jersey_number);
        System.out.println("Position: " + position);
        System.out.println("Attacker Jersey: " +
                ((jersey_number == 7||jersey_number==9||jersey_number==11) ? "Yes" : "No"));
        System.out.println("Eligibility: " +(is_eligible? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision: "+lineupDecision);
        System.out.println("Final Decision: "+finalStatus);

        footballInfo.close();
    }
}
