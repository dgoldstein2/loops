public class countPrimes{
    public int countPrimes(int input){
        int cur = 2;
        int count = 0;
        while(cur <= input){
            if ((cur % 2) != 0){
                System.out.println(cur);
                count++;
            }
            cur++;
        }
        return(count);
    }
}