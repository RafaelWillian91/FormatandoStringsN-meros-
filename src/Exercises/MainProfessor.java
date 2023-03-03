package Exercises;

public class MainProfessor {

    public static void main(String[] args) {

        ItemProfessor i1 = new ItemProfessor("Item #1", 240.0, "BRL");
        ItemProfessor i2 = new ItemProfessor("Item #2", 212.2, "USD");
        ItemProfessor i3 = new ItemProfessor("Item #3", 3332, "EUR");

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }

}
