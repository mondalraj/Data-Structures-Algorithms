class Solution
{
    public long prime_Sum(int n)
    {
        long sum = 0;
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public boolean isPrime(int num){
        for(int i=2; i<= Math.sqrt(num); i++){
            if( num % i == 0){
                return false;
            }
        }
        return true;
    }
}