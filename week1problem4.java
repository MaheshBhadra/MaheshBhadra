import java.io.*;
import java.util.*;
class D
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=findMin(n);
        System.out.print(b);
    }
    static int findMin(int n)
    {
        int count=0;
        while(n>1)
        {
            count+=1;
            if((n&1)==1)
            {
                if(((n&2)==11) && (n!=3))
                {
                    n+=1;
                }
                else
                {
                    n-=1;
                }
            }
            else
            {
                n>>=1;
            }
        }
        return count;
    }
}