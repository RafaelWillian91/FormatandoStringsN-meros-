package ListandoLocalescurrencies;

import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class main {

    public static void main(String[] args) {

        System.out.println(Currency.getAvailableCurrencies());
        System.out.println("Locales => " + Arrays.asList(Locale.getAvailableLocales()));

    }

}
