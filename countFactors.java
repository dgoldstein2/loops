public class countFactors{
    public int countfactors(int x){
        int cur = 2;
        
        int count = 0;
        while (cur <= x){
            if (x % cur == 0){
                count++;
            }
            cur++;
        }
        return count;



}
public boolean isPrime(int y){
    boolean prime;
    
    
    if (countfactors(y) == 1){
        prime = true;
    }
    else{
        prime = false;
    }
    return prime;

}

}