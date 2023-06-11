package tree.recoverbinarysearchtree_99;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;


public class abc {
  public static void main(String[] args) {
    
    int numberOfDecimalPlaces = 6;
    Double d = 12345678989898.123456;
    BigDecimal bigDecimal = new BigDecimal(d.toString());
    bigDecimal.setScale(numberOfDecimalPlaces, RoundingMode.HALF_UP);

    NumberFormat numberFormat = NumberFormat.getInstance();
    numberFormat.setMinimumFractionDigits(numberOfDecimalPlaces);

    System.out.println(numberFormat.format(bigDecimal));
  }
  
  public static void main1(String[] args) {

    DecimalFormat df = new DecimalFormat("#,###.######");

    // different locale - GERMAN
    DecimalFormat dfGerman = new DecimalFormat("#,###.##",
            new DecimalFormatSymbols(Locale.US));

    Double d = 12345678989898.123456;

    System.out.println(d);       // 1,234,567,890.12

    System.out.println(dfGerman.format(d)); // 1.234.567.890,12

}
}
