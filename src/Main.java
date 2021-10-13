
public class Main {
    public static void main(String[] args) {
        Calculator t1 = new Calculator();
        
        t1.setBalance(10000);
        t1.deposit(10000);
       System.out.println("残高は" + t1.getBalance());

        t1.payment(5000);
        System.out.println("残高は" + t1.getBalance());
       
        t1.payment(20000);
        if (t1.payment(20000) == 0) {
        	System.out.println("残高は" + t1.getBalance());
        }else {
        	System.out.println("ERROR残高が足りません。現在の残高は" + t1.getBalance());
        }
    }
}