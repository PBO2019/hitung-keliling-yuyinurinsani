public class Main {

    public static void main(String[] args) {

        bujursangkar b = new bujursangkar();
        Kelilinglingkaran a = new Kelilinglingkaran();


       b.setsisi (5);
       b.hitungbs () ;
               System.out.println("keliling bujur sangkar adalah"+  b.getkeliling () + "cm" );
       a.setjari (5);
       a.hitungkeliling ();
               System.out.println("keliling lingkaran adalah"+ a.getkll () + "cm" );
    }
}
