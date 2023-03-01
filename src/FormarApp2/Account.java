package FormarApp2;

public class Account {

    private final String number;
    private final String name;
    private final double balandce;


    public Account(String number, String name, double balandce) {
        this.number = number;
        this.name = name;
        this.balandce = balandce;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getBalandce() {
        return balandce;
    }

    @Override
    public String toString() {
       // return number + " " + name + " " + balandce;

        return String.format("%-11s\t\t%-20s\t%.2f", number, name, balandce);//%s para String %f para double e um numero entre eles
        //para deixar alinhado de acordo com o espaco do numero passado entre % e o s, o (-) inverte o lado.
        //%t adiciona uma tabulacao
        //para formatar o %f posso usar o .2 ou seja duas casas decimais ficando %.2f
    }
}
