import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve{

    private int lastNumber = 0;
    private Boolean[] primes;


    public EratosthenesPrimeSieve(int lastNumber){
        this.lastNumber = lastNumber;
        primes = new Boolean[lastNumber];
        Arrays.fill(primes, true);
        calculateAllPrimes();
    }

    private void calculateAllPrimes() {
        for (int i = 2; i < primes.length; i++) {
            for (int j = 2; j < primes.length; j++) {
                if (i % j == 0 && j != i){
                    primes[i] = false;
                }
            }
        }
    }

    @Override
    public Boolean isPrime(int p) {
        return primes[p];
    }

    @Override
    public void printPrime() {
        for (int i = 0; i < primes.length; i++) {
            System.out.println(i + " = " + primes[i]);
        }
    }
}
