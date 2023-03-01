package FomatandoNumeros;

import java.text.ChoiceFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatApp3 {

    public static void main(String[] args) {

        double d = 3487.23;

        //A classe de NumberFormat tem uma série de métodos estáticos que retornam uma instacia de NumberFormat
        NumberFormat nf = NumberFormat.getInstance();
        // A partir dessa referencia nf nos temos acesso a um metodo chamado format
        String s1 = nf.format(d);

        //Quando nao dizemos a Localizacao o padra do java é Locale padrão do sistema Operacional
        System.out.println(s1);

        //forcar o padrão Brasileiro ou outro
        Locale l1 = new Locale("pt", "BR");//Sempre a lingua e o Paìs
        //Locale l2 = Locale.CANADA;

        //Esse Locale pode ser passado no metodo estático de NumberFormat
        NumberFormat n2 =NumberFormat.getInstance(l1);
        System.out.println("Padrã Feito => " + n2.format(d));

    }

}
