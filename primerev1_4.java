public class primerev1_4 {

    static boolean isPrime(int n)
    {
        if(n==1)
        return false;
        for(int i=2; i<n; i++)
            if(n%i==0)
                return false;
        return true;
    }

    static int reverse(int n)
    {
        int rev = 0;
        while(n>0)
        {
            int last = n % 10;
            rev = rev*10 + last;
            n = n / 10;
        }
        return rev;
    }
    static int[] check(int n[])
    {
        int[] res = new int[n.length];
        int k = 0;
        for(int i=0; i<n.length; i++)
        {
            if(isPrime(n[i])&&isPrime(reverse(n[i])))
            res[k++] = n[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int a[] = new int[args.length];
        for(int i=0; i<args.length; i++)
            a[i] = Integer.parseInt(args[i]);

        System.out.println("Prime elements whose reverse is also prime numbers are: \n");
        a = check(a);
        for(int i: a)
            if(i!=0)
                System.out.print(i+ " ");
    }
    
}
