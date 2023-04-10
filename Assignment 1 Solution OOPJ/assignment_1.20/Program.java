 class Program {
    public static void main(String[] args) {
        String str = Long.toString(3434l);
        System.out.println("Long to string"+str);

        Long ld = Long.valueOf(3434l);
        System.out.println("Long value to long instance");

        String str1 = String.valueOf(str);
        Long ld1 = Long.valueOf(str1);
        System.out.println("String instance to long instance"+str1);
        
        Long value = 343343L;
        String binary = Long.toBinaryString(value);
        String octal = Long.toOctalString(value);
        String hexa = Long.toHexString(value);
        System.out.println("binary: "+binary+" " +" octal   "+octal+" "+hexa+"+ hexa");



    }
    
}
