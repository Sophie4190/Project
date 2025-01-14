import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<String>();
        double sum =0;
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
                    if(n>5){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                    for(int i = 0; i<n; i++){
                        cart.add("sweater");
                        sum+=25;
                    }
                    break;
                case "pants":
                    System.out.println("We have 3 pants in stock, each going for $20. How many would you like to purchase?");
                    int m = sc.nextInt();
                    if(m>3){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                        for(int i = 0; i<m; i++){
                            cart.add("pants");
                            sum+=20;
                    }

                    break;
                case "tees":
                    System.out.println("We have 7 tees in stock, each going for $12. How many would you like to purchase?");
                    int t = sc.nextInt();
                    if(t>7){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                        for(int i = 0; i<t; i++){
                            cart.add("tee");
                            sum+=12;
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
                    if(b>4){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                    for(int i = 0; i<b; i++){
                        cart.add("foundation");
                        sum+=40;
                    }
                    break;
                case "concealer":
                    System.out.println("We have 8 concealers in stock, each going for $25. How many would you like to purchase?");
                    int c = sc.nextInt();
                    if(c>8){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                    for(int i = 0; i<c; i++){
                        cart.add("concealer");
                        sum+=25;
                    }
                    break;
                case "blush":
                    System.out.println("We have 2 blushes in stock, each going for $22. How many would you like to purchase?");
                    int k = sc.nextInt();
                    if(k>2){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                    for(int i = 0; i<k; i++){
                        cart.add("blush");
                        sum+=22;
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
                    if(y>7){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                    for(int i = 0; i<y; i++){
                        cart.add("necklace");
                        sum+=10;
                    }
                    break;
                case "earrings":
                    System.out.println("We have 2 earrings in stock, each going for $15. How many would you like to purchase?");
                    int j = sc.nextInt();
                    if(j>2){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                    for(int i = 0; i<j; i++){
                        cart.add("earring");
                        sum+=15;
                    }
                    break;
                case "rings":
                    System.out.println("We have 5 rings in stock, each going for $12. How many would you like to purchase?");
                    int u = sc.nextInt();
                    if(u>5){
                        System.out.println("We do not have that many in stock...");
                        break;
                    }
                    for(int i = 0; i<u; i++){
                        cart.add("ring");
                        sum+=12;
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
        System.out.println(cart);
        System.out.println("Your sum is: " + sum);
    
            
    

    }
}