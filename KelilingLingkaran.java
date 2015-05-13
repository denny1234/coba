// Nama file : KelilingLingkaran
// Menampilkan nilai keliling lingkaran di kotak dialok pesan
// dengan nilai variabel jari2 diinput melalui kotak dialok input
 
// Mengimpor kelas JOptionPane
import javax.swing.JOptionPane;
 
public class KelilingLingkaran {
   public static void main(String[] args) {
 
      // Deklarasi konstanta
      final double PI = 3.14159;
 
      // Deklarasi variabel jari-jari dan luas lingkaran
      int jari2;
      double keliling;
      String sJari2;
 
      // Nilai variabel jari2 diinput melalui kotak dialok input
      sJari2 = JOptionPane.showInputDialog(null,
         "Masukkan jari-jari lingkaran\ndengan tipe data integer",
         "Input Data Jari-jari", JOptionPane.QUESTION_MESSAGE);
 
      // Konversi tipe data String ke int
      jari2 = Integer.parseInt(sJari2);
 
      // Menghitung luas lingkaran
      keliling = 2 * PI * jari2;
 
      // Menampilkan hasil di kotak dialok pesan
      JOptionPane.showMessageDialog(null, "Jari-jari lingkaran = " +
         jari2 + "\nKeliling lingkaran = " + keliling, "Keliling Lingkaran",
         JOptionPane.INFORMATION_MESSAGE);
       
      // Mengakhiri program yang menampilkan GUI
      System.exit(0);
   }
}