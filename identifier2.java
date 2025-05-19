public class identifier2 {
    public static void main(String[] args) {
        String a = "roll_no";
        String s ="$_";
        String num = "0123456789";
        char c=a.charAt(0);
        if(!((c>='a' && c <='z' )|| (c >= 'A' && c <= 'Z') || s.contains(c+""))){
            System.out.println("Not an identifier");
        }
           
        else{
        int i = 0 ;
            while(i < a.length()){
                if(!((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || s.contains(a.charAt(i)+"") || num.contains(a.charAt(i)+""))){
                    break;
                }
                i++;
            }
            if(i == a.length()){
                System.out.println("valid"); 
            }
            else{
                System.out.println("invalid");
            }
        }
    }
}
