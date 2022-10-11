public class Ejercicio1 {
    public static void main (String [] args) {
    int x=144;
    int y=999;
    double div=(double)x/(double)y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(x + " + " + y + " = " + (x+y));
        System.out.println(x + " - " + y + " = " + (x-y));
        System.out.println(x + " * " + y + " = " + (x*y));
        System.out.printf(x + " / " + y + " = " + "%.2f",div);
    }
}