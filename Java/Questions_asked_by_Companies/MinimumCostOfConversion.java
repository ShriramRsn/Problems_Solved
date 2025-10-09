public class MinimumCostOfConversion{
    public static void main(String[] args) {
        int N = 4;
        int M = 1;
        String S = "abcd";
        String T = "a";
        
        int totalCost = 0;
        for(char sChar : S.toCharArray()){
            int minCost = Integer.MAX_VALUE;
            for(char tChar : T.toCharArray()){
                int diff = Math.abs(sChar - tChar);
                int circularDiff = 26 - diff;
                minCost = Math.min(minCost,Math.min(diff,circularDiff));
            }
            
            totalCost += minCost;
        }
        
        System.out.println(totalCost);
    }
}