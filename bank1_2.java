import java.util.Scanner;

class BankCustomer
{
    String id, name,email;
    int  acno, phno;
    double bal;
    BankCustomer(String id, String name, String email, int acno, int phno, double bal)
    {
        this.id = id;
        this.name = name;
        this.email = email; 
        this.acno = acno;
        this.phno = phno;
        this.bal = bal;
    }

    void display()
    {   
        System.out.println("\n*********************");
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+acno);
        System.out.println("Email: "+email);
        System.out.println("Phone Number: "+phno);
        System.out.println("Balance: "+bal);
        System.out.println("*********************\n");
        
    }
    void deposite(double n)
    {
        bal += n;
        display();
    }
    void withdraw(double n)
    {
        if(n<bal)
            bal -= n;
        else
            System.out.println("No Balance");
        display();
    }
}

public class bank1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the customer details");
        BankCustomer c1 = new BankCustomer("123", "abc", "abc@gmail.com", 12345678, 77442231, 10000);
        BankCustomer c2 = new BankCustomer("456", "pqr", "pqr@gmail.com", 87654321, 99221131, 100);

        c1.display();
        c1.deposite(103131);
        c1.withdraw(1000);
        
        c2.display();
        c2.withdraw(10000);

    }
}
