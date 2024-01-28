import java.util.Scanner;

public class PayRoll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Basic Pay:");
        double bp= sc.nextDouble();
        double hr,da;
        if(bp>=5000){
            hr=0.1*bp;
            da=0.2*bp;
            System.out.println("Gross Pay: "+(bp+hr+da));
        }else {
            hr=0.2*bp;
            da=0.3*bp;
            System.out.println("Gross Pay: "+(bp+hr+da));
        }
    }
}
