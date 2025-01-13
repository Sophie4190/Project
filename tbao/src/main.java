import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<String>();
        System.out.println("Welcome to Tbao! What type of products are you looking for today? You may choose from Clothes, Makeup or Accessories!");
        String type = sc.nextLine().toLowerCase();
        if (type.equals("clothes")){ 
            System.out.println("What type of Clothes are you looking for? We have sweaters, pants, and tees.");
            String typeClothes = sc.nextLine().toLowerCase();

            switch(typeClothes) {
                case  "sweaters":
                    System.out.println(" We have 5 sweaters in stock, each going for $25. How many would you like to purchase?");
                    break;
                case "pants":
                    System.out.println("We have 3 pants in stock, each going for $20. How many would you like to purchase?");
                    break;
                case "tees":
                    System.out.println("We have 7 tees in stock, each going for $12. How many would you like to purchase?");
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
                    break;
                case "concealer":
                    System.out.println("We have 8 concealers in stock, each going for $25. How many would you like to purchase?");
                    break;
                case "blush":
                    System.out.println("We have 2 blushes in stock, each going for $22. How many would you like to purchase?");
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
                    break;
                case "earrings":
                    System.out.println("We have 2 earrings in stock, each going for $15. How many would you like to purchase?");
                    break;
                case "rings":
                    System.out.println("We have 5 rings in stock, each going for $12. How many would you like to purchase?");
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
}