package FormarApp1;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        int n = 2;
        for (int i = 0; i <= 10 ; i++) {
            //String s = n + " x " + i + " = " + (n * i);
           // String s = String.format("%d x %d = %d", n, i, n*i);
            //System.out.println(s);
            System.out.format("%d x %d = %d \n", n, i, n * i);
           // System.out.printf("%d x %d = %d \n", n, i, n * i); Funciona da mesma forma
        }

        System.out.printf("Hora Local: %tT", Calendar.getInstance());

    }

}
