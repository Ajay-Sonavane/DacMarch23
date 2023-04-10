            class Program {
            public static void main(String[] args) {
            double d = 4542.445;

            Double din = Double.valueOf(d);
            System.out.println("double value to double instace  "+din);

            byte b = din.byteValue();
            System.out.println(b);

            short s = din.shortValue();
            System.out.println(s);
            
            int i = din.intValue();
            System.out.println(i);
            
            long l = din.longValue();
            System.out.println(l);

            }
            }   
