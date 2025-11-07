import java.util.Scanner;

public class CoffeeOrderingSystem {
    public static void main(String[] args) {
        String smiley = "\uD83D\uDE00";
        String coffee = "\u2615";
        String rupee = "\u20B9";
        System.out.println("*****************");
        System.out.println(smiley + "Welcome to Coffee Cafe!" + coffee);
        System.out.println("*****************\n");
        //System.out.println();
        System.out.println("Choose your coffee:");
        System.out.println("1.Espresso-" + rupee + "200");
        System.out.println("2.Cappuccino-" + rupee + "250");
        System.out.println("3.Latte-" + rupee + "300");
        System.out.println("Enter your choice:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        double bill = 0;
        switch (choice) {
            case 1:
                bill = 200;
                break;
            case 2:
                bill = 250;
                break;
            case 3:
                bill = 300;
                break;
            default:
                System.out.println("Invalid choice");


        }
//        if (choice == 1) {
//            bill = 200;
//        } else if (choice == 2) {
//            bill = 250;
//        } else if (choice == 3) {
//            bill = 300;
//        } else {
//            System.out.println("Invalid choice");
//        }
        if (bill > 0) {
            System.out.println("Add whipped cream for" + rupee + "30?(yes=1/no=0):");
            int whippedCreamChoice = scanner.nextInt();
            if (whippedCreamChoice == 1) {
                bill += 30;
            }
            System.out.println("Add flavour shot?(Vanilla for" + rupee + "20 or Hazelnut for" + rupee + "25)(Yes=1/No=0)");
            int flavourShot = scanner.nextInt();
            if (flavourShot == 1) {
                System.out.println("Which one you want?(1 for vanilla and 2 for hazelnut)");
                int flavourChoice = scanner.nextInt();
                //switch
                switch (flavourChoice) {
                    case 1:
                        bill += 20;
                        break;
                    case 2:
                        bill += 25;
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                //if else
//            if (flavourShot == 1) {
//                System.out.println("Which one you want?(1 for vanilla and 2 for hazelnut)");
//                int flavourChoice = scanner.nextInt();
//                if (flavourChoice == 1) {
//                    bill += 20;
//                } else if (choice == 2) {
//                    bill += 25;
//                } else {
//                    System.out.println("Invalid flavour choice");
//                }
//            }
            }
            System.out.println("The total bill is:" + rupee + bill);
        }
    }
}



