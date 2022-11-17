import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String name = "Milonee";
        String Gender = "Female";
        String Branch = "Hinjewadi";
        String IFSC = "HDFCN89382";
        long Mobile = 8498423028L;
        long account_number;
        String dob = "08-06-2003";
        int age = 19;
        int balance = 0;*/


        //accept full name,auto generate account number

        int choice;
        int login_choice;
        long acc_num;
        Track_Balance tb = new Track_Balance();
        Account a;
        login l= new login();


        do {
            System.out.println("Select The operation you want to perform");
            System.out.println("1.Create Account");
            System.out.println("2.Login into Existing Account");
            System.out.println("3.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("You're now creating a new account");
                    a= new Account();
                    l.Create_Account();
                    tb.account_type();
                    System.out.println("Account Created Successfully");
                    break;
                }
                case 2: {
                    l.credentialMatch();
                    if(l.credentialMatch()==1)
                    {
                        l.AccountLogin();
                    }
                    else {
                        System.out.println("Account Number does not match");
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Thankyou for using");
            }

            }
        } while (choice != 3);
    }
}