package Bank_Project;
import java.io.*;
import java.util.*;

public class Main_class_of_Bank {

    public static void main(String args[])throws IOException{

        Scanner s=new Scanner(System.in);
        System.out.print("Enter Balance: ");
        double bal=s.nextInt();
        User_Intereset Account=new User_Intereset(bal);
        System.out.println("Enter rate of Interest:");
        double r=s.nextDouble();
        Account.concat(r);
    }
}
