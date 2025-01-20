import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<>();
        ArrayList<Integer> avail = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<String> totalCart = new ArrayList<>();
        String username = "admin123";
        String password = "tbao";
        double sum = 0;

        while (true) {
            System.out.println("Welcome to Tbao! What type of products are you looking for today? You may choose from Clothes, Makeup or Accessories! Enter x to go to checkout or remove an item!");
            String type = sc.nextLine().toLowerCase();

            if (type.equals("clothes")) {
                System.out.println("What type of Clothes are you looking for? We have sweaters, pants, and tees.");
                String typeClothes = sc.nextLine().toLowerCase();

                switch (typeClothes) {
                    case "sweaters":
                        System.out.println("We have 5 sweaters in stock, each going for $25. How many would you like to purchase?");
                        int n = sc.nextInt();
                        int sweaters = 5;
                        double sweaterPrice = 25.00;
                        sc.nextLine();
                        if (n > 5) {
                            System.out.println("We do not have that many in stock...");
                            break;
                        }
                        for (int i = 0; i < n; i++) {
                            cart.add("sweater");
                            totalCart.add("sweater"); // Add to totalCart as well
                            prices.add(sweaterPrice);
                            sweaters--;
                        }
                        avail.add(sweaters);
                        System.out.println("There are " + sweaters + " sweaters left in stock");
                        System.out.println("This item has been added to your cart " + n + " times!");
                        break;
                    case "pants":
                        System.out.println("We have 3 pants in stock, each going for $20. How many would you like to purchase?");
                        int m = sc.nextInt();
                        int pants = 3;
                        double pantPrice = 20.00;
                        sc.nextLine();
                        if (m > 3) {
                            System.out.println("We do not have that many in stock...");
                            break;
                        }
                        for (int i = 0; i < m; i++) {
                            cart.add("pants");
                            totalCart.add("pants"); // Add to totalCart as well
                            prices.add(pantPrice);
                            pants--;
                        }
                        avail.add(pants);
                        System.out.println("There are " + pants + " pants left in stock");
                        System.out.println("This item has been added to your cart " + m + " times!");
                        break;
                    case "tees":
                        System.out.println("We have 7 tees in stock, each going for $12. How many would you like to purchase?");
                        int t = sc.nextInt();
                        int tees = 7;
                        double teePrice = 12.00;
                        sc.nextLine();
                        if (t > 7) {
                            System.out.println("We do not have that many in stock...");
                            break;
                        }
                        for (int i = 0; i < t; i++) {
                            cart.add("tee");
                            totalCart.add("tee"); // Add to totalCart as well
                            prices.add(teePrice);
                            tees--;
                        }
                        avail.add(tees);
                        System.out.println("There are " + tees + " tees left in stock");
                        System.out.println("This item has been added to your cart " + t + " times!");
                        break;
                    default:
                        System.out.println("You entered clothes that we do not sell. Please enter either sweaters, pants, or tees.");
                        break;
                }
            } else if (type.equals("makeup")) {
                System.out.println("What type of makeup are you looking for? We have foundation, concealer, and blush.");
                String typeMakeup = sc.nextLine().toLowerCase();

                switch (typeMakeup) {
                    case "foundation":
                        System.out.println("We have 4 foundations in stock, each going for $40. How many would you like to purchase?");
                        int b = sc.nextInt();
                        int foundations = 4;
                        double foundationPrice = 40.00;
                        sc.nextLine();
                        if (b > 4) {
                            System.out.println("We do not have that many in stock...");
                            break;
                        }
                        for (int i = 0; i < b; i++) {
                            cart.add("foundation");
                            totalCart.add("foundation"); // Add to totalCart as well
                            prices.add(foundationPrice);
                            foundations--;
                        }
                        avail.add(foundations);
                        System.out.println("There are " + foundations + " foundations left in stock");
                        System.out.println("This item has been added to your cart " + b + " times!");
                        break;
                    case "concealer":
                        System.out.println("We have 8 concealers in stock, each going for $25. How many would you like to purchase?");
                        int c = sc.nextInt();
                        int concealers = 8;
                        double concealerPrice = 25.00;
                        sc.nextLine();
                        if (c > 8) {
                            System.out.println("We do not have that many in stock...");
                            break;
                        }
                        for (int i = 0; i < c; i++) {
                            cart.add("concealer");
                            totalCart.add("concealer"); // Add to totalCart as well
                            prices.add(concealerPrice);
                            concealers--;
                        }
                        avail.add(concealers);
                        System.out.println("There are " + concealers + " concealers left in stock");
                        System.out.println("This item has been added to your cart " + c + " times!");
                        break;
                    case "blush":
                        System.out.println("We have 2 blushes in stock, each going for $22. How many would you like to purchase?");
                        int k = sc.nextInt();
                        int blushes = 2;
                        double blushPrice = 22.00;
                        sc.nextLine();
                        if (k > 2) {
                            System.out.println("We do not have that many in stock...");
                            break;
                        }
                        for (int i = 0; i < k; i++) {
                            cart.add("blush");
                            totalCart.add("blush"); // Add to totalCart as well
                            prices.add(blushPrice);
                            blushes--;
                        }
                        avail.add(blushes);
                        System.out.println("There are " + blushes + " blushes left in stock");
                        System.out.println("This item has been added to your cart " + k + " times!");
                        break;
                    default:
                        System.out.println("You entered makeup products that we do not sell. Please enter either foundation, concealer, or blush.");
                        break;
                }
            } else if (type.equals("accessories")) {
                System.out.println("What type of accessories are you looking for? We have necklaces, earrings, and rings.");
                String typeAccessories = sc.nextLine().toLowerCase();

                switch (typeAccessories) {
                    case "necklaces":
                        System.out.println("We have 7 necklaces in stock, each going for $10. How many would you like to purchase?");
                        int y = sc.nextInt();
                        int necklaces = 7;
                        double necklacePrice = 10.00;
                        sc.nextLine();
                        if (y > 7) {
                            System.out.println("We do not have that many in stock...");
                            break;
                        }
                        for (int i = 0; i < y; i++) {
                            cart.add("necklace");
                            totalCart.add("necklace"); // Add to totalCart as well
                            prices.add(necklacePrice);
                            necklaces--;
                        }
                        avail.add(necklaces);
                        System.out.println("There are " + necklaces + " necklaces left in stock");
                        System.out.println("This item has been added to your cart " + y + " times!");
                        break;
                    case "earrings":
                        System.out.println("We have 2 earrings in stock, each going for $15. How many would you like to purchase?");
                        int j = sc.nextInt();
                        int earrings = 2;
                        double earringPrice = 15.00;
                        sc.nextLine();
                        if (j > 2) {
                            System.out.println("We do not have that many in stock...");
                            break;
                        }
                        for (int i = 0; i < j; i++) {
                            cart.add("earring");
                            totalCart.add("earring"); // Add to totalCart as well
                            prices.add(earringPrice);
                            earrings--;
                        }
                        avail.add(earrings);
                        System.out.println("There are " + earrings + " earrings left in stock");
                        System.out.println("This item has been added to your cart " + j + " times!");
                        break;
                    case "rings":
                        System.out.println("We have 5 rings in stock, each going for $12. How many would you like to purchase?");
                        int u = sc.nextInt();
                        int rings = 5;
                        double ringPrice = 12.00;
                        sc.nextLine();
                        if (u > 5) {
                            System.out.println("We do not have that many in stock...");
                            break;
                        }
                        for (int i = 0; i < u; i++) {
                            cart.add("ring");
                            totalCart.add("ring"); // Add to totalCart as well
                            prices.add(ringPrice);
                            rings--;
                        }
                        avail.add(rings);
                        System.out.println("There are " + rings + " rings left in stock");
                        System.out.println("This item has been added to your cart " + u + " times!");
                        break;
                    default:
                        System.out.println("You entered accessories that we do not sell. Please enter either necklaces, earrings, or rings.");
                        break;
                }
            } else if (type.equals("x")) {
                // Checkout or remove an item
                System.out.println("Would you like to remove anything? (Yes/No)");
                String yesNo = sc.nextLine().toLowerCase();
                if (yesNo.equals("yes")) {
                    System.out.println("What item would you like to remove?");
                    String remove = sc.nextLine().toLowerCase();
                    for (int i = 0; i < cart.size(); i++) {
                        if (cart.get(i).equals(remove)) {
                            cart.remove(i);
                            totalCart.remove(i); // Also remove from totalCart
                            prices.remove(i);
                            break;
                        }
                    }
                }

                // Recalculate total sum
                sum = 0;
                for (double price : prices) {
                    sum += price;
                }
                System.out.println("Your updated cart: " + cart);
                System.out.println("Your total: $" + sum);
                break;
            } else {
                System.out.println("Invalid input. Please choose a valid option.");
            }
        }

        // Admin login after checkout
        System.out.println("Looking for the admin page? Enter y to login:");
        String login = sc.nextLine().toLowerCase();
        if (login.equals("y")) {
            System.out.println("Enter the username:");
            String user = sc.nextLine().toLowerCase();
            if (user.equals("admin123")) {
                System.out.println("Enter the password:");
                String pass = sc.nextLine().toLowerCase();
                if (pass.equals("tbao")) {
                    System.out.println("Admin login successful!");
                    System.out.println("Total cart: " + totalCart);
                    System.out.println("Choose an option: 1. View availability, 2. View prices, 3. Exit");
                    int option = sc.nextInt();
                    if (option == 1) {
                        System.out.println("Product availability: " + avail);
                    } else if (option == 2) {
                        System.out.println("Product prices: " + prices);
                    } else if (option == 3) {
                        System.out.println("Exiting admin panel...");
                    } else {
                        System.out.println("Invalid option.");
                    }
                } else {
                    System.out.println("Incorrect password.");
                }
            } else {
                System.out.println("Incorrect username.");
            }
        }
    }
}
