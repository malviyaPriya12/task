class peakop
{
    public static void main(String ar[] )
    {
        int a[]=new int[] {21,20,22,31};
        for(int i=1;i<a.length;i++) {
            if (a[i] < a[i - 1] && a[i] < a[i + 1]) {
                System.out.println(a[i]);
                break;
            }
        }
    }
}