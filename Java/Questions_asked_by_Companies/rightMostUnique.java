package Questions_asked_by_Companies;
public class rightMostUnique {
    

	public static void main(String[] args) {
		int n = 112233456;
		int unique = rightmostunigue(n);
		System.out.print(unique);
	}

	static int rightmostunigue(int n) {
		String str = n + "";
		int[] count = new int[10];
		for(char c : str.toCharArray()) {
			int digit = c - '0';
			count[digit]++;
		}
		for(int i = str.length() - 1; i >=0 ; i--) {
			int digit = str.charAt(i) - '0';
			if(count[digit] == 1) {
				return digit;
			}
		}

		return -1;

}
}
