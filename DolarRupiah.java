import java.util.Scanner;
public class DolarRupiah {
    public static void main (String[] args){
        float dolar, hasil;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Dollar: ");
        dolar = input.nextFloat();
        
        hasil = dolar*15284;
        System.out.println("Rupiah :"+ hasil);
    }
}
