/*
Count the number of prime numbers less than a non-negative number, n.
*/
public int countPrimes(int n) {
     boolean[] isPrime = new boolean[n];
     for (int i=2;i<n;i++){
         isPrime[i]=true;
     }
     
     //mark off prime's multiples because they are not prime numbers
     for (int i=2;i*i<n;i++){
         if (!isPrime[i]) continue;
         for (int j=i*i;j<n;j+=i){
             isPrime[j]=false;
         }
     }
     
     //count prime number in total
     int count=0;
     for (int i=2;i<n;i++){
         if (isPrime[i]) count++;
     }
     return count;
    
    }
    
    /*public int countPrimes(int n) {
        int count=0
        for (int i=1;i<n;i++){
            if (isPrime(i))count++;
        }
        return count;
    }
    
    public boolean isPrime(int number){
        
        if (number==0 || number==1) return false;
        for (int i=2;i*i<=number;i++){
            if (number%i==0) return false;
            
        }
        return true;
    }*/