import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.Locale;

public class MainClass {
    public static void main(String[] args) {
        long number = 787878787;
        RuleBasedNumberFormat ruleBasedNumberFormat = new RuleBasedNumberFormat( new Locale("EN", "US"), RuleBasedNumberFormat.SPELLOUT );
        System.out.println(ruleBasedNumberFormat.format(number));
    }
}
