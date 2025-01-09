import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Tbao! What type of products are you looking for today? You may choose from Clothes, Makeup or Accessories!");
        String type = sc.nextLine().toLowerCase;
        if (type.equals("clothes")){
            System.out.println("What type of Clothes are you looking for? We have sweaters, pants, tees, sleepwear and sportswear.");



        }
        else if (type.equals("makeup")){
            System.out.println("What type of makeup are you looking for? We have foundation, concealer, eyelashes, eyeshadow, lippies and blush.");

        }
        else if(type.equals("accessories")){
            System.out.println("What type of accessories are you looking for? We have necklaces, earrings, rings, bracelets and anklets");

        }
        else{
            System.out.println("Sorry we do not have that here..");
        }
            
    

    }
}