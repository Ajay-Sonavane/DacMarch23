class Program {
    public static void main(String[] args) {
        short s = 2424;
        Short sh = Short.valueOf(s);
         
        byte b = sh.byteValue();
        System.out.println(b);

         
        short s1 = sh.shortValue();
        System.out.println(s1);
        
         
        int i = sh.intValue();
        System.out.println(i);
        
         
        long l = sh.longValue();
        System.out.println(l);
        
         
        float f = sh.floatValue();
        System.out.println(f);
        
         
       double d = sh.doubleValue();
        System.out.println(d);
        
    }
}