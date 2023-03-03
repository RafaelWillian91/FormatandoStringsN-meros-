package customizandoNumberFrmate;

import java.text.NumberFormat;
import java.util.Currency;

public class FormattApp5 {

    public static void main(String[] args) {

        double d = 320320323.9998;

        NumberFormat nf = NumberFormat.getInstance(); //
        //NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(d));

        nf.setGroupingUsed(false);
        System.out.println(nf.format(d));

        nf.setMaximumFractionDigits(7);
        nf.setMinimumFractionDigits(7);
        System.out.println(nf.format(d));

        nf.setCurrency(Currency.getInstance("EUR"));//Para ter Suporte a esse set Tenho que passar um NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(d));

    }

}
