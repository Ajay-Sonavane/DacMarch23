class Program {
            public static void main(String[] args) {
                
                Long ld = Long.valueOf(34787L);

                byte b = ld.byteValue();//long instance to byte
                System.out.println(b);    

                short s = ld.shortValue();
                System.out.println(s);

                int  i = ld.intValue();
                System.out.println(i);

                long l = ld.longValue();
                System.out.println(l);

                float f = ld.floatValue();
                System.out.println(f);
                

                double d = ld.doubleValue();
                System.out.println(d);
                
            }  
        } 
               
