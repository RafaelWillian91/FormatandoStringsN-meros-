package Exercises;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class Item {

    private final String [] item;
    private int i = 0;

    NumberFormat nf = NumberFormat.getCurrencyInstance();

    public Item(int size){
        this.item = new String[size];
    }

    public String intemIndice (int indice){
        return item[indice];
    }

    public void addItem(String item, double value, Locale locale){
        nf.setCurrency(Currency.getInstance(locale));
        String s = String.format("%-15s\t\t%-15s",item, nf.format(value));
        this.item[i] = String.valueOf(s);
        i++;
    }

    public void totalItems() {
        for (String n: item
            )
            if(n != null){
        {
            System.out.println(n);
        }
      }
    }


    @Override
    public String toString() {
        totalItems();
        return "";
    }
}
