package Bank_Project;
import java.io.*;
public class User_Intereset {
        private double bal;
        User_Intereset(double b)
        {
            bal=b;
        }
        void concat(double r) throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter password :");
            String psw=br.readLine();
            if(psw.equals("sipun@123"))
            {
                Interest in=new Interest(r);
                in.ClaculateOfinterest();
            }
            else
            {
                System.out.println("Sorry, you are not an authorized persion......");
            }
        }
        //inner class
        private class Interest{
            //rate of inerest
            private double rate;
            Interest(double r)
            {
                rate=r;
            }
            void ClaculateOfinterest()
            {
                double interest= bal*rate/100;
                bal +=interest;
                System.out.println("Update Balance= "+bal);
            }
        }

    }
