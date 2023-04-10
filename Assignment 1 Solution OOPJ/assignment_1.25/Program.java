class Program {
    public static void main(String[] args) {
        Float f = Float.valueOf(343.4f);

        byte b = f.byteValue();
        System.out.println("float instance to byte "+b);

        short s= f.shortValue();
        System.out.println("float instance to short "+s);

        int i= f.intValue();
        System.out.println("float instance to int "+i);

        long l = f.longValue();
        System.out.println("float instance to long "+l);

        float f1 = f.floatValue();
        System.out.println("float instance to float "+f1);

        double d = f.doubleValue();
        System.out.println("float instance to double "+d);

  
    }
    
}
