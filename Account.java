import java.util.Scanner;

public class Account
{
    Scanner sc= new Scanner(System.in);

    String name,dob,city,ifsc,gender,email, type;
 int age,pincode,branch,balance,account_number;
    String mobile_number;


    Account()
     {
     }

    Account(String name,String dob,String city,String gender, String email,int age, int pincode, int balance,
            String mobile_number,int account_number)
    {
     this.name=name;
     this.dob=dob;
     this.city=city;
     this.gender=gender;
     this.email=email;
     this.age=age;
     this.pincode=pincode;
     this.balance=balance;
     this.mobile_number=mobile_number;
     this.account_number=account_number;
    }

    public void Branch()
    {
        System.out.println("Select your Branch");
        System.out.println("1.Shivaji Nagar");
        System.out.println("2.Hinjewadi") ;
        System.out.println("3.Kothrud");
        System.out.println("Enter choice");
        branch=sc.nextInt();
        if(branch==1)
        {
            ifsc = "HDFC0098765";
            System.out.println("IFSC CODE:  " + ifsc);
        }
        else if(branch==2)
        {
            ifsc="HDFC0034567";
            System.out.println("IFSC CODE :" + ifsc);
        }
        else if(branch==3)
        {
            ifsc="HDFC0012345";
            System.out.println("IFSC CODE: " + ifsc);

        }
        else
        {
            System.out.println("Invalid Input !! Please select a branch mentioned above! ");
        }
    }


    public void balance()
    {
        System.out.println("Available Balance in your account is " + balance);
        System.out.println("***************************************************");
    }

    public int getAccount_number() {
        return account_number;
    }
}
