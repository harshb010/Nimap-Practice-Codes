
public class IfPrimeElseNextPrime {
    public static void main(String[] args) {
        int num = 0;
        boolean isPrime = false;
        while(true)
        {
            isPrime = true;
            if(num<=1)
            {
                isPrime = false;
            }else{
                for(int i=2;i<=num/2;i++)
                {
                    if(num%i==0)
                    {
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime)
            {
                System.out.println(num);
                break;
            }else {
                num++;
            }
        }
    }
}
