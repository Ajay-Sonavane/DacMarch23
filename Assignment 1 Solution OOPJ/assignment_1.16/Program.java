 class Program {
    public static void main(String[] args) {
        int i = 76574;
        String str = Integer.toString(i);//primitive to string
        System.out.println(str);
        
        Integer In = Interger.valueOf(i); //  primitive to object/instance
        System.out.println(In);

        String sin = String.valueOf("123");
        Integer In1 = Integer.valueOf (sin);
        System.out.println(In1);

        String s1 = Integer.toBinaryString(i); //int to binary string
        System.out.println(s1);

        String s2 = Integer.toOctalString(i); //int to octal string
        System.out.println(s2);

        String s3 = Integer.toHexString(i);  //int to hexa string
        System.out.println(s3);


    }
}
