import java.util.Scanner;
public class KilometerMeter {
    public static void main(String [] args){
        float Kilometer, meter;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kilometer : ");
        Kilometer = input.nextFloat();
        
        meter = Kilometer*1000;
        System.out.println("Meter : "+ meter);
    }
}
