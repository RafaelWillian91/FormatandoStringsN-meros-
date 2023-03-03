package Exercises;

import java.text.NumberFormat;
import java.util.Currency;

public class ItemProfessor {

    private final String description;
    private final double price;
    private final String current;

    private final NumberFormat numberFormat;

    public ItemProfessor(String description, double price, String current) {
        this.description = description;
        this.price = price;
        this.current = current;
        this.numberFormat = NumberFormat.getCurrencyInstance();
        this.numberFormat.setCurrency(Currency.getInstance(current));

    }

    @Override
    public String toString() {
        return String.format("%-15s - %-15s", description, numberFormat.format(price));
    }
}
