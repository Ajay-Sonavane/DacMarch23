 class Program {
    public static void main(String[] args) {
        int i = 43334;
        Integer in = Integer.valueOf(i);
        System.out.println(i);

        byte b = in.byteValue();
        System.out.println(b);

        short s = in.shortValue();
        System.out.println(s);

        int i1 = in.intValue();
        System.out.println(i1);

        long l = in.longValue();
        System.out.println(l);

        
        float f = in.floatValue();
        System.out.println(f);
        
        double  d= in.doubleValue();
        System.out.println(d);

    }
    
}
