package Bank_Project;
import java.util.*;
public class Creat_User_Bank_Acc {

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.println();
        System.out.println("\t\t\t====WelCome to International Bank====\n");
        System.out.print("Are you Opening International Bank \n[Yes/No]: ");
        String acc_open=s.nextLine();
        if(acc_open.equals("yes"))
        {
            System.out.println("=====Enter user Details====");
            System.out.print("Enter user Name: ");
            String name=s.nextLine();
            System.out.print("Enter user Relationship\n[Father/Mother name]: ");
            String rel=s.nextLine();
            System.out.print("Enter user Date of Birth: ");
            String dob=s.nextLine();
            System.out.print("Enter user Gender\n(M/F): ");
            String gnd=s.nextLine();
            System.out.print("Enter user Marital Status: ");
            String mrg=s.nextLine();
            System.out.print("Enter user Aadharaa No: ");
            long adhr=Long.parseLong(s.nextLine());
            System.out.print("Enter user Phone No: ");
            long ph=Long.parseLong(s.nextLine());
            System.out.print("Enter user MailId: ");
            String email=s.nextLine();
            s.nextLine(); // when you enter then nextline

            System.out.println("=====Enter user Permanente Address Details====");
            System.out.print("Enter At: ");
            String at=s.nextLine();
            System.out.print("Enter Po: ");
            String po=s.nextLine();
            System.out.print("Enter Dist: ");
            String dis=s.nextLine();
            System.out.print("Enter State: ");
            String sta=s.nextLine();
            System.out.print("Enter Pinconde: ");
            long pin=Long.parseLong(s.nextLine());
            //display user details

            s.nextLine(); // when you enter then nextline

            System.out.println("\t\t\t\t\t*****[WelComr to Internationa Bank]******");
            String namecap=name.toUpperCase();
            System.out.println("\t\t\t=====Internationa Bank [Mr: "+namecap+"] Your Account hasbeen Submitted====\n");
            System.out.println("=====user Details====");
            System.out.println("Enter user Name: "+name);
            System.out.println("user Relationship\n(Father/Mother name): "+rel);
            System.out.println("user Date of Birth: "+dob);
            System.out.println("user Gender\n(M/F): "+gnd);
            System.out.println("user Marital Status: "+mrg);
            System.out.println("user Aadharaa No: "+adhr);
            System.out.println("user Phone No: "+ph);
            System.out.println("user MailId: \n"+email);
            System.out.println("===user Permanente Address Details====");
            System.out.println("At: "+at);
            System.out.println("Po: "+ph);
            System.out.println("Dist: "+dis);
            System.out.println("State: "+sta);
            System.out.println("Pinconde: "+pin);
        }
        else
        {
           System.out.print("'thanks' H've good day Sir: ");
        }

    }
}
