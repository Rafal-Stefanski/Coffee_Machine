package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action;
        final String MENU = "Write action (buy, fill, take, remaining, exit):\n> ";

        int water = 400;
        int milk = 540;
        int beans = 120;
        int disposableCups = 9;
        int money = 550;

        System.out.print(MENU);
        action = scanner.next();
        scanner.reset();
        boolean menuLoop = true;

        while (menuLoop) {
            label:
            switch (action) {
                case "buy":
                    System.out.print("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:\n> ");
                    String coffee = scanner.next();

                    switch (coffee) {
                        case "back":
                            System.out.print(MENU);
                            action = scanner.next();
                            break label;

                        case "1":
                            if (possibleNoOfCoffee(1, water, milk, beans, disposableCups) >= 1) {
                                water -= 250;
                                beans -= 16;
                                disposableCups -= 1;
                                money += 4;
                            } else {
                                if (water < 250) {
                                    System.out.println("Sorry, not enough " + "water" + "!\n");
                                }
                                if (beans < 16) {
                                    System.out.println("Sorry, not enough " + "beans" + "!\n");
                                }
                                if (disposableCups < 1) {
                                    System.out.println("Sorry, not enough " + "cups" + "!\n");
                                }
                            }
                            System.out.print(MENU);
                            action = scanner.next();
                            break label;

                        case "2":
                            if (possibleNoOfCoffee(2, water, milk, beans, disposableCups) >= 1) {
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                disposableCups -= 1;
                                money += 7;
                            } else {
                                if (water < 350) {
                                    System.out.println("Sorry, not enough " + "water" + "!\n");
                                }
                                if (milk < 75) {
                                    System.out.println("Sorry, not enough " + "milk" + "!\n");
                                }
                                if (beans < 20) {
                                    System.out.println("Sorry, not enough " + "beans" + "!\n");
                                }
                                if (disposableCups < 1) {
                                    System.out.println("Sorry, not enough " + "cups" + "!\n");
                                }
                            }
                            System.out.print(MENU);
                            action = scanner.next();
                            break label;

                        case "3":
                            if (possibleNoOfCoffee(3, water, milk, beans, disposableCups) >= 1) {
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                disposableCups -= 1;
                                money += 6;
                            } else {
                                if (water < 200) {
                                    System.out.println("Sorry, not enough " + "water" + "!\n");
                                }
                                if (milk < 100) {
                                    System.out.println("Sorry, not enough " + "milk" + "!\n");
                                }
                                if (beans < 12) {
                                    System.out.println("Sorry, not enough " + "beans" + "!\n");
                                }
                                if (disposableCups < 1) {
                                    System.out.println("Sorry, not enough " + "cups" + "!\n");
                                }
                            }
                            System.out.print(MENU);
                            action = scanner.next();
                            break label;
                    }

                    System.out.print(MENU);
                    action = scanner.next();
                    break;

                case "fill":
                    System.out.print("\nWrite how many ml of water do you want to add:\n> ");
                    water += scanner.nextInt();
                    System.out.print("Write how many ml of milk do you want to add:\n> ");
                    milk += scanner.nextInt();
                    System.out.print("Write how many grams of coffee beans do you want to add:\n> ");
                    beans += scanner.nextInt();
                    System.out.print("Write how many disposable cups of coffee do you want to add:\n> ");
                    disposableCups += scanner.nextInt();

                    System.out.println();
                    System.out.print(MENU);
                    action = scanner.next();
                    break;

                case "take":
                    System.out.println("\nI gave you $" + money + "\n");
                    money = 0;

                    System.out.print(MENU);
                    action = scanner.next();
                    break;

                case "remaining":
                    resourcesList(water, milk, beans, disposableCups, money);

                    System.out.print(MENU);
                    action = scanner.next();
                    break;

                case "exit":
                    menuLoop = false;
                    break;
            }
        }


        // stage 3/6
//        System.out.print("Write how many ml of water the coffee machine has: \n> ");
//        int waterCount = scanner.nextInt() / 200;
//        System.out.print("Write how many ml of milk the coffee machine has: \n> ");
//        int milkCount = scanner.nextInt() / 50;
//        System.out.print("Write how many grams of coffee beans the coffee machine has: \n> ");
//        int beansCount = scanner.nextInt() / 15;
//
//        System.out.print("Write how many cups of coffee you will need: \n");
//        int cups = scanner.nextInt();
//        int possibleNumberOfCups = 0;
//
//        if (waterCount <= milkCount && waterCount <= beansCount) {
//            possibleNumberOfCups = waterCount;
//        }
//        if (beansCount <= waterCount && beansCount <= milkCount) {
//            possibleNumberOfCups = beansCount;
//        }
//        if (milkCount <= waterCount && milkCount <= beansCount) {
//            possibleNumberOfCups = milkCount;
//        }
//
//        if (possibleNumberOfCups == cups) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if (possibleNumberOfCups < cups) {
//            System.out.println("No, I can make only " + possibleNumberOfCups + " cup(s) of coffee");
//        } else {
//            System.out.println("Yes, I can make that amount of coffee (and even " + (possibleNumberOfCups - cups) + " more than that)");
//        }

        // stage 2/6
//        System.out.print("Write how many cups of coffee you will need:\n> ");
//        int cups = scanner.nextInt();
//        scanner.close();
//        System.out.println("For " + cups + " of coffee you will need:\n" +
//               cups * 200 + " ml of water\n" +
//               cups * 50 + " ml of milk\n" +
//               cups * 15 + " g of coffee beans");

        // stage 1/6
//        System.out.println("Starting to make a coffee\n" +
//                "Grinding coffee beans\n" +
//                "Boiling water\n" +
//                "Mixing boiled water with crushed coffee beans\n" +
//                "Pouring coffee into the cup\n" +
//                "Pouring some milk into the cup\n" +
//                "Coffee is ready!");

    }

    public static void resourcesList(int water, int milk, int beans, int disposableCups, int money) {
        System.out.println("\nThe coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                disposableCups + " of disposable cups\n" +
                "$" + money + " of money\n");
    }

    public static int possibleNoOfCoffee(int choice, int water, int milk, int beans, int disposableCups) {

        int waterCount, beansCount, milkCount;
        final String ENOUGH = "I have enough resources, making you a coffee!\n";
        int possibleNumberOfCups = 0;

        switch (choice) {
            case 1:                 // espresso
                waterCount = water / 250;
                beansCount = beans / 16;

                if (waterCount <= beansCount) {
                    possibleNumberOfCups = waterCount;
                }
                if (beansCount <= waterCount) {
                    possibleNumberOfCups = beansCount;
                }
                if (possibleNumberOfCups > disposableCups) {
                    possibleNumberOfCups = disposableCups;
                }

            case 2:                 // latte
                waterCount = water / 350;
                milkCount = milk / 75;
                beansCount = beans / 20;

                if (waterCount <= milkCount && waterCount <= beansCount) {
                    possibleNumberOfCups = waterCount;
                }
                if (beansCount <= waterCount && beansCount <= milkCount) {
                    possibleNumberOfCups = beansCount;
                }
                if (milkCount <= waterCount && milkCount <= beansCount) {
                    possibleNumberOfCups = milkCount;
                }
                if (possibleNumberOfCups > disposableCups) {
                    possibleNumberOfCups = disposableCups;
                }

//                System.out.println("======= testing =========");
//                System.out.println("waterCount " + waterCount);
//                System.out.println("milk " + milkCount);
//                System.out.println("beans " + beansCount);
//                System.out.println("possibleNumberOfCups " + possibleNumberOfCups);

            case 3:                 // cappuccino
                waterCount = water / 200;
                milkCount = milk / 100;
                beansCount = beans / 12;

                if (waterCount <= milkCount && waterCount <= beansCount) {
                    possibleNumberOfCups = waterCount;
                }
                if (beansCount <= waterCount && beansCount <= milkCount) {
                    possibleNumberOfCups = beansCount;
                }
                if (milkCount <= waterCount && milkCount <= beansCount) {
                    possibleNumberOfCups = milkCount;
                }
                if (possibleNumberOfCups > disposableCups) {
                    possibleNumberOfCups = disposableCups;
                }
        }

        if (possibleNumberOfCups > 0) {
            System.out.println(ENOUGH);
        }
        return possibleNumberOfCups;
    }
}
