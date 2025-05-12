public class ReverseString {
    public static void main(String[] args) {
        String org = "ChennaiCity";
        String condition = "even";
        String rev = "";

        for (int index = 0; index < org.length(); index++) {
            if (condition.equals("odd") && index % 2 == 0) {
                rev += org.charAt(index);
            }
            else if (condition.equals("even") && index % 2 != 0) {
                rev += org.charAt(index);
            }
        }

        System.out.println(rev);
    }
}
