
import java.util.Formatter;
import java.util.Locale;

public class formatter {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);
        formatter.format("%4$2s %3$2llll  s %2$2s %1$2s", "a", "b", "c", "d"); 
        formatter.format(Locale.ITALY, " e = %+10.4f", Math.E);         
        System.out.println(sb.toString());
    }
}
