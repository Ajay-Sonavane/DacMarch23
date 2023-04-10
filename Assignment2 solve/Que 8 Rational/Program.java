import java.util.*;

public class Program {
    double a;
    double b;
    double n1;
    double n2;
    String o;
    static Scanner sc = new Scanner(System.in);

    public void Rational(){
       
        System.out.print("Enter number 1 numerator : ");
        a = sc.nextDouble();
        System.out.print("Enter number 1 denominator : ");
        b = sc.nextDouble();
        this.n1 = a/b;
        System.out.print("Enter number 2 numerator : ");
        a = sc.nextDouble();
        System.out.print("Enter number 2 denominator : ");
        b = sc.nextDouble();
        this.n2 = a/b;
    }

    public void Calculate(){
        System.out.print("Enter arithmetic operation( + - * / ) to perform : ");
        o = sc.next();
        if(o.equals("+")){
            System.out.println("Answer is "+(n1+n2));
 }
        else if(o.equals("-")){
            System.out.println("Answer is "+(n1-n2));
             }
        else if(o.equals("*")){
            System.out.println("Answer is "+(n1*n2));
             }
        else if(o.equals("/")){
            System.out.println("Answer is "+(n1/n2));
            }
        else{
            System.out.println(" Wrong operator ");
            return;
             }

    }

    public static void main(String[] args) {
        Program a = new Program();
        a.Rational();
        a.Calculate();
    }
}