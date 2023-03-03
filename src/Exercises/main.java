package Exercises;

import java.util.Locale;

public class main {

    public static void main(String[] args) {

        Item itens = new Item(10);

        itens.addItem("Café", 20.0000, new Locale("pt", "BR"));
        itens.addItem("Leite", 4.00, new Locale("pt", "PT"));
        itens.addItem("Açucar", 3.50, Locale.US);

        itens.totalItems();
        System.out.println("------------------");
        System.out.println(itens.toString());



    }
}
