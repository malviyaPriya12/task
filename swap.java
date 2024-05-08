class swap {
    public static void main(String ar[]) {
        int a = 12;
        int b = 8;
        System.out.println("before swapping =");
        System.out.println("a="+a +" " +"b="+b);
        a = a + b;
        b = a - b;
        a= a - b;
        System.out.println("after swapping =");
        System.out.println("a="+a +" "+"b="+b);
    }
}

