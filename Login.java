package LoginSystem;
import java.util.Scanner;

public class Login{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full  name : ");
        String name = input.nextLine();
        System.out.println(" Welcome " + name + " \n "); 
        
        
        System.out.println(" Thank you for entering your name.");
        System.out.println();
/// Email ///
        String email = "";
        while(true){
            System.out.println("Please enter your email Address:");
            email = input.nextLine();

            if(email.contains("@") && email.endsWith("@gmail.com")){
                System.out.println("email address is correct");
                System.out.println();
                break;
            }else{
                System.out.println("email address does not meet the requirements. ");
                System.out.println("Please re-entetr the email again: ");
                
            }
        }
        
        // User ///

        String user = "";

        while(true){
            System.out.print("Please enter your preffered username:");
            user = input.nextLine();

            if(user.equals("hoe")){
                System.out.println("Please re enter your username as its offensive");
    
            }else{
                System.out.println("username meets the needs of the company");
                break;
    
            }

        }      

        System.out.println(" Hello " + user);
        System.out.println(" Welcome " + name + "  " + user);


        ///Password///

        while(true){
            System.out.print(" Now create your password:");
            String pass = input.nextLine();
    
            if(pass.length()<=6){
                System.out.println("Please use more than 6 characters");
    
            }else{
                System.out.print(" Confirm your password: ");
                String checkPass = input.nextLine();

                if(pass.equals(checkPass)){
                    System.out.println("u have entered the password correctly");
                    break;
                
                } else{
                    System.out.println(" Paswords do not match");
                }
            }
    
        }


} 
}

 