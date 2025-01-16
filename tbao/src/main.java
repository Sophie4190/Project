import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<String>();
        double sum =0;
        String username = "admin123";
        String password = "totalOrders";
    
        System.out.println("Welcome to Tbao! What type of products are you looking for today? You may choose from Clothes, Makeup or Accessories! Enter X to go to checkout!");
        String type = sc.nextLine().toLowerCase();
        while(!type.equals("X")){

        
        if (type.equals("clothes")){ 
            System.out.println("What type of Clothes are you looking for? We have sweaters, pants, and tees.");
            String typeClothes = sc.nextLine().toLowerCase();

            switch(typeClothes) {
                case  "sweaters":
                    System.out.println(" We have 5 sweaters in stock, each going for $25. How many would you like to purchase?");
                    int n = sc.nextInt();
                    int sweaters = 5;
                    if(n>5){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                    for(int i = 0; i<n; i++){
                        cart.add("sweater");
                        sum+=25;
                        sweater--
                    }
                    break;
                case "pants":
                    System.out.println("We have 3 pants in stock, each going for $20. How many would you like to purchase?");
                    int m = sc.nextInt();
                    int pants = 3;
                    if(m>3){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                        for(int i = 0; i<m; i++){
                            cart.add("pants");
                            sum+=20;
                            pants--
                    }

                    break;
                case "tees":
                    System.out.println("We have 7 tees in stock, each going for $12. How many would you like to purchase?");
                    int t = sc.nextInt();
                    int tee = 7;
                    if(t>7){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                        for(int i = 0; i<t; i++){
                            cart.add("tee");
                            sum+=12;
                            tee--
                    }
                    break;
                default: 
                    System.out.println("You entered clothes that we do not sell. Please enter either sweaters, pants, or tees.");
                    break;
    
                }          

        }
        else if (type.equals("makeup")){
            System.out.println("What type of makeup are you looking for? We have foundation, concealer, and blush.");
            String typeMakeup = sc.nextLine().toLowerCase();

            switch (typeMakeup) {
                case  "foundation":
                    System.out.println(" We have 4 foundations in stock, each going for $40. How many would you like to purchase?");
                    int b = sc.nextInt();
                    int foundation = 4;
                
                    if(b>4){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                    for(int i = 0; i<b; i++){
                        cart.add("foundation");
                        sum+=40;
                        foundation--
                    }
                    break;
                case "concealer":
                    System.out.println("We have 8 concealers in stock, each going for $25. How many would you like to purchase?");
                    int c = sc.nextInt();
                    int concealer = 8;
                    if(c>8){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                    for(int i = 0; i<c; i++){
                        cart.add("concealer");
                        sum+=25;
                        concealer--
                    }
                    break;
                case "blush":
                    System.out.println("We have 2 blushes in stock, each going for $22. How many would you like to purchase?");
                    int blush = 2;
                    int k = sc.nextInt();
                    if(k>2){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                    for(int i = 0; i<k; i++){
                        cart.add("blush");
                        sum+=22;
                        blush--
                    }
                    break;
                default: 
                    System.out.println("You entered makeup products that we do not sell. Please enter either foundation, concealer, or blush.");
                   
                    break;
                }
        }
                
        else if(type.equals("accessories")){
            System.out.println("What type of accessories are you looking for? We have necklaces, earrings, and rings.");
            String typeAccessories = sc.nextLine().toLowerCase();

            switch (typeAccessories) {
                case  "necklaces":
                    System.out.println(" We have 7 necklaces in stock, each going for $10. How many would you like to purchase?");
                    int y = sc.nextInt();
                    int necklace = 7;
                    if(y>7){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                    for(int i = 0; i<y; i++){
                        cart.add("necklace");
                        sum+=10;
                        necklace--
                    }
                    break;
                case "earrings":
                    System.out.println("We have 2 earrings in stock, each going for $15. How many would you like to purchase?");
                    int j = sc.nextInt();
                    int earrings = 2;
                    if(j>2){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                    for(int i = 0; i<j; i++){
                        cart.add("earring");
                        sum+=15;
                        earrings--
                    }
                    break;
                case "rings":
                    System.out.println("We have 5 rings in stock, each going for $12. How many would you like to purchase?");
                    int u = sc.nextInt();
                    int rings = 5;
                    if(u>5){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                    for(int i = 0; i<u; i++){
                        cart.add("ring");
                        sum+=12;
                        rings--
                    }
                    break;
                default: 
                    System.out.println("You entered accessories that we do not sell. Please enter either necklaces, earrings, or rings.");
                    break;
                }
        }

        else{
            System.out.println("Sorry we do not offer that here.");
        }
    }
        System.out.println("Would you like to remove anything? Enter no to go straight to checkout and yes to go to the remove page.");
        String remove = sc.nextLine().toLowerCase();
        if(remove.equals("yes"){
            System.out.println("What would you like to remove?");
            String out = sc.nextLine().toLowerCase();
            for(int i = 0; i< cart.size -1; i++){
                if(cart.at(i).equals(out)){
                    cart.remove(i)
        }
        else if(remove.equals("no"){
            break;
        }
        else{
            System.out.println("Sorry that is not an option..");
            break;
        }
        System.out.println(cart);
        System.out.println("Your sum is: " + sum);
        System.out.println("Your order has been confirmed. Thank you for shopping at Tbao- Tbaiiiiii!");
        System.out.println("Still here? Enter Y to go to the admin login page");

        ArrayList<String> totalCart = new ArrayList<String>();
        for(int i =0; i < cart.size - 1; i++){
            totalCart.add(i);
        }

        for(int i = 0; i<
    
    if (type.equals("Y") {
          System.out.println("Welcome to the admin login page. Please enter the username:");
        String user = sc.nextLine().toLowerCase();
        if (user.equals(username)) {
            System.out.println("Please enter the password:");
            String pass = sc.nextLine().toLowerCase();
            if(pass.equals(password)){
                System.out.println(totalCart);
            }
            else{
                System.out.println("The password entered is incorrect...");
                break;
        }
        else {
            System.out.println("The username entered is incorrect...");
            break;
            
    }
}
