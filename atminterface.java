package internship;

public class atminterface {

}
import java.util.*;
class Mechine 
{
    
    public double deposit (double amt,double bal)
    {
        double c=bal+amt;
        return c;
    }
    public double withdraw (double amt,double bal)
    {
        bal-=amt;
        return bal;
    }
    public void balance (double bal)
    {
        System.out.println("Balance : "+bal);
    }
}
class User{
    String userId;
    String userPin;
    public User(String userId,String userPin)
    {
        this.userId=userId;
        this.userPin=userPin;
    }
}
class T3
{
    static User currentUser;
    static void initializeUser() {
        
        currentUser = new User("12345", "6789");
    }

    static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter User ID:");
        String userId = scanner.next();

        System.out.println("Enter PIN:");
        String pin = scanner.next();

        if (userId.equals(currentUser.userId) && pin.equals(currentUser.userPin)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials. Exiting...");
            System.exit(0);
        }
    }
 public static void main (String args[])
 {
    initializeUser();
    login();
    Mechine m=new Mechine();
    Scanner ob=new Scanner (System.in);
    String BankAcc;
    double bal=100;
    int i=0;
    System.out.println("Initial balance = "+bal);
    String H[]=new String[20];
    int j=0;
    while(i!=10)
    {
        
        System.out.print("Operation : 1) Deposit\t2) Withdraw\t3) Balance Check\t4)History\t5)Transfer\t6)Exit\nEnter your choice : ");
        int op=ob.nextInt();
        double amt;
        switch (op)
        {
        case 1:
        {
            System.out.println("Amount to deposit : ");
            amt=ob.nextInt();
            double c=m.deposit(amt,bal);
            System.out.println("Money deposited successfully...");
            bal=c;
            m.balance(bal);
            H[j]="Money deposited:"+amt;
            j++;
            break;
        }
        case 2:
        {
            System.out.println("Amount to withdraw : ");
     
            amt=ob.nextInt();
            if(amt<(bal-100))
            {
                bal=m.withdraw(amt,bal);
                System.out.println("Money withdrawal successfully...");
                H[j]="Money withdraw:"+amt;
                j++;
            }
            else
            {
            System.out.println("Insufficient balance to withdraw ");   
             H[j]="Money withdrawal Failed";
                j++;
            break;
            }
        }
        case 3:
        {
            m.balance(bal);
    
            break;
        }
        case 4:
        {
            System.out.println("History:");
            for(int p=0;p<20;p++)
            {
                if(H[p]!=null)
                {
                   System.out.println(H[p]); 
                }
            }
            break;
        }
        case 5:
        {
             System.out.println("Enter Resiptant User Id");
             String rp=ob.next();
             System.out.println("Amount to transfer : ");
     
            amt=ob.nextInt();
            if(amt<(bal-100))
            {
                bal=m.withdraw(amt,bal);
                System.out.println("Money transfer successfully...");
                
                H[j]="Money transfer:\nUser Id:"+rp+"\tAmount:"+amt;
                j++;
            }
            else
            {
            System.out.println("Insufficient balance to Transfer ");   
             H[j]="Money withdrawal Failed";
                j++;
            break;
            }
            break;
        }
        case 6:
        {
            i=10;
            break;
        }
   
        }
    }
  
 } 

}
package internship;

public class atminterface {

}
import java.util.*;
class Mechine 
{
    
    public double deposit (double amt,double bal)
    {
        double c=bal+amt;
        return c;
    }
    public double withdraw (double amt,double bal)
    {
        bal-=amt;
        return bal;
    }
    public void balance (double bal)
    {
        System.out.println("Balance : "+bal);
    }
}
class User{
    String userId;
    String userPin;
    public User(String userId,String userPin)
    {
        this.userId=userId;
        this.userPin=userPin;
    }
}
class T3
{
    static User currentUser;
    static void initializeUser() {
        
        currentUser = new User("12345", "6789");
    }

    static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter User ID:");
        String userId = scanner.next();

        System.out.println("Enter PIN:");
        String pin = scanner.next();

        if (userId.equals(currentUser.userId) && pin.equals(currentUser.userPin)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials. Exiting...");
            System.exit(0);
        }
    }
 public static void main (String args[])
 {
    initializeUser();
    login();
    Mechine m=new Mechine();
    Scanner ob=new Scanner (System.in);
    String BankAcc;
    double bal=100;
    int i=0;
    System.out.println("Initial balance = "+bal);
    String H[]=new String[20];
    int j=0;
    while(i!=10)
    {
        
        System.out.print("Operation : 1) Deposit\t2) Withdraw\t3) Balance Check\t4)History\t5)Transfer\t6)Exit\nEnter your choice : ");
        int op=ob.nextInt();
        double amt;
        switch (op)
        {
        case 1:
        {
            System.out.println("Amount to deposit : ");
            amt=ob.nextInt();
            double c=m.deposit(amt,bal);
            System.out.println("Money deposited successfully...");
            bal=c;
            m.balance(bal);
            H[j]="Money deposited:"+amt;
            j++;
            break;
        }
        case 2:
        {
            System.out.println("Amount to withdraw : ");
     
            amt=ob.nextInt();
            if(amt<(bal-100))
            {
                bal=m.withdraw(amt,bal);
                System.out.println("Money withdrawal successfully...");
                H[j]="Money withdraw:"+amt;
                j++;
            }
            else
            {
            System.out.println("Insufficient balance to withdraw ");   
             H[j]="Money withdrawal Failed";
                j++;
            break;
            }
        }
        case 3:
        {
            m.balance(bal);
    
            break;
        }
        case 4:
        {
            System.out.println("History:");
            for(int p=0;p<20;p++)
            {
                if(H[p]!=null)
                {
                   System.out.println(H[p]); 
                }
            }
            break;
        }
        case 5:
        {
             System.out.println("Enter Resiptant User Id");
             String rp=ob.next();
             System.out.println("Amount to transfer : ");
     
            amt=ob.nextInt();
            if(amt<(bal-100))
            {
                bal=m.withdraw(amt,bal);
                System.out.println("Money transfer successfully...");
                
                H[j]="Money transfer:\nUser Id:"+rp+"\tAmount:"+amt;
                j++;
            }
            else
            {
            System.out.println("Insufficient balance to Transfer ");   
             H[j]="Money withdrawal Failed";
                j++;
            break;
            }
            break;
        }
        case 6:
        {
            i=10;
            break;
        }
   
        }
    }
  
 } 

}
package internship;

public class atminterface {

}
import java.util.*;
class Mechine 
{
    
    public double deposit (double amt,double bal)
    {
        double c=bal+amt;
        return c;
    }
    public double withdraw (double amt,double bal)
    {
        bal-=amt;
        return bal;
    }
    public void balance (double bal)
    {
        System.out.println("Balance : "+bal);
    }
}
class User{
    String userId;
    String userPin;
    public User(String userId,String userPin)
    {
        this.userId=userId;
        this.userPin=userPin;
    }
}
class T3
{
    static User currentUser;
    static void initializeUser() {
        
        currentUser = new User("12345", "6789");
    }

    static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter User ID:");
        String userId = scanner.next();

        System.out.println("Enter PIN:");
        String pin = scanner.next();

        if (userId.equals(currentUser.userId) && pin.equals(currentUser.userPin)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials. Exiting...");
            System.exit(0);
        }
    }
 public static void main (String args[])
 {
    initializeUser();
    login();
    Mechine m=new Mechine();
    Scanner ob=new Scanner (System.in);
    String BankAcc;
    double bal=100;
    int i=0;
    System.out.println("Initial balance = "+bal);
    String H[]=new String[20];
    int j=0;
    while(i!=10)
    {
        
        System.out.print("Operation : 1) Deposit\t2) Withdraw\t3) Balance Check\t4)History\t5)Transfer\t6)Exit\nEnter your choice : ");
        int op=ob.nextInt();
        double amt;
        switch (op)
        {
        case 1:
        {
            System.out.println("Amount to deposit : ");
            amt=ob.nextInt();
            double c=m.deposit(amt,bal);
            System.out.println("Money deposited successfully...");
            bal=c;
            m.balance(bal);
            H[j]="Money deposited:"+amt;
            j++;
            break;
        }
        case 2:
        {
            System.out.println("Amount to withdraw : ");
     
            amt=ob.nextInt();
            if(amt<(bal-100))
            {
                bal=m.withdraw(amt,bal);
                System.out.println("Money withdrawal successfully...");
                H[j]="Money withdraw:"+amt;
                j++;
            }
            else
            {
            System.out.println("Insufficient balance to withdraw ");   
             H[j]="Money withdrawal Failed";
                j++;
            break;
            }
        }
        case 3:
        {
            m.balance(bal);
    
            break;
        }
        case 4:
        {
            System.out.println("History:");
            for(int p=0;p<20;p++)
            {
                if(H[p]!=null)
                {
                   System.out.println(H[p]); 
                }
            }
            break;
        }
        case 5:
        {
             System.out.println("Enter Resiptant User Id");
             String rp=ob.next();
             System.out.println("Amount to transfer : ");
     
            amt=ob.nextInt();
            if(amt<(bal-100))
            {
                bal=m.withdraw(amt,bal);
                System.out.println("Money transfer successfully...");
                
                H[j]="Money transfer:\nUser Id:"+rp+"\tAmount:"+amt;
                j++;
            }
            else
            {
            System.out.println("Insufficient balance to Transfer ");   
             H[j]="Money withdrawal Failed";
                j++;
            break;
            }
            break;
        }
        case 6:
        {
            i=10;
            break;
        }
   
        }
    }
  
 } 

}
package internship;

public class atminterface {

}
import java.util.*;
class Mechine 
{
    
    public double deposit (double amt,double bal)
    {
        double c=bal+amt;
        return c;
    }
    public double withdraw (double amt,double bal)
    {
        bal-=amt;
        return bal;
    }
    public void balance (double bal)
    {
        System.out.println("Balance : "+bal);
    }
}
class User{
    String userId;
    String userPin;
    public User(String userId,String userPin)
    {
        this.userId=userId;
        this.userPin=userPin;
    }
}
class T3
{
    static User currentUser;
    static void initializeUser() {
        
        currentUser = new User("12345", "6789");
    }

    static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter User ID:");
        String userId = scanner.next();

        System.out.println("Enter PIN:");
        String pin = scanner.next();

        if (userId.equals(currentUser.userId) && pin.equals(currentUser.userPin)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials. Exiting...");
            System.exit(0);
        }
    }
 public static void main (String args[])
 {
    initializeUser();
    login();
    Mechine m=new Mechine();
    Scanner ob=new Scanner (System.in);
    String BankAcc;
    double bal=100;
    int i=0;
    System.out.println("Initial balance = "+bal);
    String H[]=new String[20];
    int j=0;
    while(i!=10)
    {
        
        System.out.print("Operation : 1) Deposit\t2) Withdraw\t3) Balance Check\t4)History\t5)Transfer\t6)Exit\nEnter your choice : ");
        int op=ob.nextInt();
        double amt;
        switch (op)
        {
        case 1:
        {
            System.out.println("Amount to deposit : ");
            amt=ob.nextInt();
            double c=m.deposit(amt,bal);
            System.out.println("Money deposited successfully...");
            bal=c;
            m.balance(bal);
            H[j]="Money deposited:"+amt;
            j++;
            break;
        }
        case 2:
        {
            System.out.println("Amount to withdraw : ");
     
            amt=ob.nextInt();
            if(amt<(bal-100))
            {
                bal=m.withdraw(amt,bal);
                System.out.println("Money withdrawal successfully...");
                H[j]="Money withdraw:"+amt;
                j++;
            }
            else
            {
            System.out.println("Insufficient balance to withdraw ");   
             H[j]="Money withdrawal Failed";
                j++;
            break;
            }
        }
        case 3:
        {
            m.balance(bal);
    
            break;
        }
        case 4:
        {
            System.out.println("History:");
            for(int p=0;p<20;p++)
            {
                if(H[p]!=null)
                {
                   System.out.println(H[p]); 
                }
            }
            break;
        }
        case 5:
        {
             System.out.println("Enter Resiptant User Id");
             String rp=ob.next();
             System.out.println("Amount to transfer : ");
     
            amt=ob.nextInt();
            if(amt<(bal-100))
            {
                bal=m.withdraw(amt,bal);
                System.out.println("Money transfer successfully...");
                
                H[j]="Money transfer:\nUser Id:"+rp+"\tAmount:"+amt;
                j++;
            }
            else
            {
            System.out.println("Insufficient balance to Transfer ");   
             H[j]="Money withdrawal Failed";
                j++;
            break;
            }
            break;
        }
        case 6:
        {
            i=10;
            break;
        }
   
        }
    }
  
 } 

}
/*
Enter User ID:
12345
Enter PIN:
6789
Login successful!
Initial balance = 100.0
Operation : 1) Deposit  2) Withdraw     3) Balance Check       4)History        5)Transfer     6)Exit
Enter your choice : 1
Amount to deposit : 
30905
Money deposited successfully...
Balance : 31005.0
Operation : 1) Deposit  2) Withdraw     3) Balance Check       4)History        5)Transfer     6)Exit
Enter your choice : 2
Amount to withdraw : 
45000
Insufficient balance to withdraw

Operation : 1) Deposit  2) Withdraw     3) Balance Check       4)History        5)Transfer     6)Exit
Enter your choice : 2
Amount to withdraw : 
3000
Money withdrawal successfully...
Balance : 28005.0
Operation : 1) Deposit  2) Withdraw     3) Balance Check       4)History        5)Transfer     6)Exit
Enter your choice : 3
Balance : 28005.0
Operation : 1) Deposit  2) Withdraw     3) Balance Check       4)History        5)Transfer     6)Exit
Enter your choice : 4
History:
Money deposited:30905.0
Money withdrawal Failed
Money withdraw:3000.0
Operation : 1) Deposit  2) Withdraw     3) Balance Check       4)History        5)Transfer     6)Exit
Enter your choice : 5
Enter Resiptant User Id
34567
Amount to transfer : 
3000
Money transfer successfully...
*/
