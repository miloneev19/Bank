import java.util.Scanner;

public class Track_Balance
{
    static int max_withdraw;
    static String acc_type;
    int balance=0;
    static Scanner sc=new Scanner(System.in);

    public static String account_type()
    {
        System.out.println("Select the type of account:");
        System.out.println("1.Saving account");
        System.out.println("2.Current account");
        System.out.println("3.Salary Account");
        System.out.println("Please enter the type of account you want to create: ");
        int account_choice = sc.nextInt();
          if(account_choice==1)
          {
                System.out.println("You're creating a Savings account.");
                //max_withdraw = 5000;
                acc_type="Saving";

            }
        else if(account_choice==2){
             System.out.println("You're creating a Current account.");
             //max_withdraw=20000;
             acc_type="Current";

            }
         else  if(account_choice==3) {
                System.out.println("You're creating a Salary account. ");
               // max_withdraw=70000;
               acc_type="Salary";

            }
        else {
               System.out.println("Invalid selection!");
           }
        System.out.println("***************************************************");
        return  acc_type;
    }

    int maxWithdraw()
    {
        if(acc_type == "Savings")
        {
            max_withdraw=8000;
        }
        if(acc_type=="Current")
        {
            max_withdraw=100000;
        }
        if(acc_type=="Salary")
        {
            max_withdraw=80000;
        }
        return max_withdraw;
    }

   public int deposit()
    {
        System.out.print("Enter amount to be deposited: ");
        int deposit_amount;
        deposit_amount=sc.nextInt();
        balance=balance+deposit_amount;
        System.out.println("Amount deposited Successfully");
        System.out.println("******************************************************");
        return balance;
    }

    public int withdraw()
    {
        maxWithdraw();
        System.out.print("Enter Amount to de withdrawn");
        int withdraw_amount;
        withdraw_amount=sc.nextInt();
        balance=balance-withdraw_amount;
        System.out.println("Amount Withdrawn Successfully");
        System.out.println("Updated Balance :" + balance);
        System.out.println("******************************************************");
        max_withdraw = max_withdraw- withdraw_amount;
        return balance;
    }


}
