import java.util.Scanner;
public class contact_manager 
{
    public static void main(String[]args)
    {
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter serial number of SK-club member from 1 to 10 : ");
        int i1=sc1.nextInt();
        String phone_number[]=new String[11];
        phone_number[1]="Name : Talha \nPhone number :03261859908";
        phone_number[2]="Name : Khuzama \nPhone number :03161487908";
        phone_number[3]="Name : Usama \nPhone number :03061359908";
        phone_number[4]="Name : Assan \nPhone number :03061749908";
        phone_number[5]="Name : Hassnain \nPhone number :03361159908";
        phone_number[6]="Name : Hamza \nPhone number :03061357908";
        phone_number[7]="Name : Muzamil \nphone number :03561153908";
        phone_number[8]="Name : Hadi \nPhone number :03261529708";
        phone_number[9]="Name : Rafay \nPhone number :03361493908";
        phone_number[10]="Name : Saad \nPhone number :03452689853";
        System.out.println(phone_number[i1]);
    }
}
