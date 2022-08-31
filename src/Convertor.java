import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Convertor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double amount;
        double usd,uah ,pln,cad;

        int choice;
        DecimalFormat f = new DecimalFormat("##.##");
        System.out.println("Enter your choice: ");
        System.out.println("Enter 1 usd");
        System.out.println("Enter 2 uah");
        System.out.println("Enter 3 pln");

        System.out.println("Choose from above options: ");
        choice =Integer.parseInt(reader.readLine());


        System.out.println("Enter your amount: ");
        amount = Integer.parseInt(reader.readLine());


        switch (choice){

            case 1:
                uah=amount/37;
                System.out.println(amount +" USD= "+f.format(uah)+" UAH");

                pln=amount*4.55;
                System.out.println(amount + " USD = "+f.format(pln)+ "PLN");
                break;

            case 2:
                usd = amount/36;
                System.out.println(amount + " UAH = " +f.format(usd)+ "USD");
                pln=amount/8.1;
                System.out.println(amount + " UAH = "+f.format(pln)+ "PLN");
                break;
            case 3:
                usd = amount/4.55;
                System.out.println(amount + "PLN = "+f.format(usd)+" USD");
                uah= amount*8.1;
                System.out.println(amount+ " PLN = "+f.format(uah)+ " UAH");
                break;

            default:
                System.out.println("Invalid Input");
        }
    }
}
