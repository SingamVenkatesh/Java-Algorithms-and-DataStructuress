package IntegerTOBinary;
public class NumtoBinary {
    public static void main(String[] args) {
        int number = 25;
        String binary = "";
        /*
          // to convert t obinary
int a=7;
String s=Integer.toBinaryString(a);
System.out.println(s);
         */

        int n = number;
        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }

        System.out.println("Decimal: " + number);
        System.out.println("Binary: " + binary);
    }
}
