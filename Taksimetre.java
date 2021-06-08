import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        
        double km, min=20.0, taksimetreAç=10.0, kmTl=2.20, total;

        System.out.println("please login that you went how many KM with taxi : ");
        km = inp.nextDouble();

        double baslangıc = km*2.20;
        baslangıc = taksimetreAç + baslangıc;
        
        total = baslangıc < 20 ? 20 : baslangıc;

        System.out.println("Your cost is : " + total);





    }

}

