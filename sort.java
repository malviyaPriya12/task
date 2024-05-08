import java.util.*;
class sort
{
    public static void main(String ar[] )
    {
        int temp=0;
        System.out.println("enter array size");
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<size;i++)
        {
            a[i] =sc.nextInt();
        }

        for(int i=size-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        int i=0;
        System.out.println(" second largest element is-");
        System.out.print(a[i+1]+" ");

    }
}