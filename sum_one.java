class sum_one
{
    static int sumof(int arr[])
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {   
                    
                int s = arr[i] + arr[j];
                if(s > sum && i!=j)
                    sum = s;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int l = args.length;
        int arr[] = new int[l];
        for(int i=0; i<l; i++)
        {
            arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println("The largest sum of two numbers is "+sumof(arr));
    }
}