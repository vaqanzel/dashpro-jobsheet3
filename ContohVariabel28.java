 public class ContohVariabel28 { 
    public static void main(String[] args) {

        String NamaLengkap = "Valentina Santi Grehasta";
        String HobiSaya = "Memasak";
        boolean isPandai = true;
        char Jenis_Kelamin= 'P';
        byte UmurSaya = 19 ;
        double $ipk = 3.99, tinggi = 1.78;
        
        System.out.println ("Nama Saya Adalah " + NamaLengkap);
        System.out.println ("Hobi Saya " + HobiSaya);
        System.out.println ("Apakah pandai? " + isPandai);
        System.out.println ("Jenis kelamin saya adalah: " + Jenis_Kelamin);
        System.out.println ("Umur saya saat ini adalah: " + UmurSaya);
        System.out.println (String.format("Saya beripk %s, dan tinggi badan saya adalah %s", $ipk, tinggi));
        
    }
 }