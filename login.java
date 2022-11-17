import java.util.Scanner;
public class login {

    static int account_count = 0;
    Account a = new Account();

    public void Create_Account() {
        Scanner sc = new Scanner(System.in);
        String name, dob, city, ifsc, gender, email, type, mobile_number;
        int age, pincode, branch, balance, account_number;

        Account a = new Account();
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Date of Birth: ");
        dob = sc.next();
        System.out.print("City: ");
        city = sc.next();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Mobile Number: ");
        mobile_number = sc.next();
        System.out.print("Pincode: ");
        pincode = sc.nextInt();
        a.Branch();
        System.out.print("Account Number: ");
        account_number = sc.nextInt();
        System.out.print("Gender: ");
        gender = sc.next();
        System.out.print("Email Id: ");
        email = sc.next();
        System.out.println("Thank you for entering your details");
        System.out.println("Account Created Successfully");

        account_count += 1;

    }

    public void AccountLogin() {
        Scanner sc = new Scanner(System.in);
        int login_choice;
        Track_Balance tb = new Track_Balance();
            do {
                System.out.println("Choose the option from drop down menu");
                System.out.println("1.Deposit Money");
                System.out.println("2.Withdraw Money");
                System.out.println("3.Check Balance");
                System.out.println("4.Exit");
                login_choice = sc.nextInt();
                switch (login_choice) {

                    case 1:
                        tb.deposit();
                        break;


                    case 2:
                        tb.withdraw();
                        break;


                    case 3:
                        a.balance();
                        break;
                    case 4:
                        System.out.println("Thankyou for using");
                        break;

                }
            } while (login_choice != 4);

        }


    public int credentialMatch() {
        Scanner sc = new Scanner(System.in);
        int login_accountNum;
        System.out.println("Enter account number you want to login into");
        login_accountNum = sc.nextInt();

        int[] accounts = new int[account_count];
        int i, j;
        for (i = 0; i < account_count; i++) {
            accounts[i] = a.getAccount_number();
        }
        for (j = 0; j < account_count; j++) {
            if (login_accountNum==accounts[i]) {
                return i;

            }
        }
        return -1;
    }
}

