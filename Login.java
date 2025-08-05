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



// /// Email ///
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
                System.out.println();
                System.out.println("Please re-entetr the email again. ");
                System.out.println();
                
            }
        }
        
        // Username selection///

        String[] prohibihtedWords = {"hoe", "idiot", "slut", "bitch", "asshole",};
        String user = "";

        while(true){
            System.out.println("Please enter your preferred username:");
            user = input.nextLine();

            boolean isOffensive = false; 

            for(int i = 0; i <prohibihtedWords.length; i++){
                if(user.toLowerCase().contains(prohibihtedWords[i].toLowerCase())){
                    isOffensive = true;
                    break;
                }
            }
            if(isOffensive){
                System.out.println("PLEASE RE- ENTER YOUR USERNAME AS ITS OFFENSIVE TO OUR GUIDELINES.");
                System.out.println();
            }else{
                System.out.println("Usename meets the needs of the company");
                System.out.println();
                break;

            }
        }



        ///Password///

        while(true){
            System.out.print(" Now create your password:");
            String pass = input.nextLine();
    
            if(pass.length()<=6){
                System.out.println("Please use more than 6 characters");
    
            }else{
                System.out.print(" Confirm your password: ");
                System.out.println();
                String checkPass = input.nextLine();

                if(pass.equals(checkPass)){
                    System.out.println("You have entered the password correctly");
                    System.out.println();
                    break;
                
                } else{
                    System.out.println(" Paswords do not match");
                }
            }
    
        }


} 

}

 