import java.util.Scanner;
public class CelciusFahrenheit {
    public static void main(String [] args){
        float Celcius, hasil;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Celcius :");
        Celcius = input.nextFloat();
        
        hasil = (Celcius*9/5)+32;
        System.out.println("Fahrenheit : "+ hasil);
    }
}
