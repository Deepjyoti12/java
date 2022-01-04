
import java.util.Scanner;
public class income_tax {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Salary in lakhs per annum");
        float amt=sc.nextFloat();
        float tax =0.0f;
        if(amt<=2.5){
             tax = tax+ 0.0f;
        }
        else if(amt>2.5 && amt<=5.0){
            tax = tax + 0.05f*(amt-2.5f);
        }
        else if(amt>5.0 && amt<=10.0){
             tax =tax + 0.05f*(amt-2.5f)+0.2f*(amt-5.0f);
        }
        else if (amt>10.0f){
            tax =tax + 0.05f*(amt-2.5f)+0.2f*(amt-5.0f)+0.3f*(amt-10.0f);
        }
        System.out.println("Total Tax "+tax);
    }
}
