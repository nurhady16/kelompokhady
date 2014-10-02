
 
import javax.swing.JOptionPane;
 
public class Konversi {
 
    public static void main(String[] args) {
 
        double hasil = 0;
        boolean ulang = false;
        do {
            String suhuString = JOptionPane.showInputDialog("Masukkan nilai suhu");
            double suhu = Integer.parseInt(suhuString);
            String pilihderajat = JOptionPane.showInputDialog("Masukkan pilihan derajat \n1.untuk C\n2.untuk R \n3.untuk F");
            int nopilihderajat = Integer.parseInt(pilihderajat);
 
            switch (nopilihderajat) {
                case 1:
                    String pilihhitungC =
                            JOptionPane.showInputDialog("Masukkan pilihan hitung konversi C :\n1.c --> R\n2. C---> F");
                    int nokonversiC = Integer.parseInt(pilihhitungC);
                    switch (nokonversiC) {
                        case 1:
                            hasil = (4.0 / 5.0) * suhu;
                            break;
                        case 2:
                            hasil = (9.0 / 5.0) * suhu + 32;
                            break;
                    }
                    break; //break hitung konversi C
                case 2:
                    String pilihhitungR =
                            JOptionPane.showInputDialog("Masukkan pilihan hitung konversi R:\n1. R --> C\n2. R --> F");
                    int nokonversiR = Integer.parseInt(pilihhitungR);
                    switch (nokonversiR) {
                        case 1:
                            hasil = (5.0 / 4.0) * suhu;
                            break;
                        case 2:
                            hasil = (9.0 / 4.0) * suhu + 32;
                            break;
                    }
                    break; //hitung konversi R
                case 3:
                    String pilihhitungF =
                            JOptionPane.showInputDialog("Masukkan pilihan hitung konversi :\n1. F --> R\n2. F --> C");
                    int nokonversiF = Integer.parseInt(pilihhitungF);
                    switch (nokonversiF) {
                        case 1:
                            hasil = (4.0 / 9.0) * (suhu - 32);
                            break;
                        case 2:
                            hasil = (5.0 / 9.0) * (suhu - 32);
                            break;
                    }
                    break; //hitung konversi F;
 
            }
            JOptionPane.showMessageDialog(null, "hasil: " + hasil, "Hasil konversi",
                    JOptionPane.INFORMATION_MESSAGE);
 
            int lagi = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Mengulang", "Ulang",
                    JOptionPane.YES_NO_OPTION);
            if (lagi == JOptionPane.YES_OPTION) {
                ulang = true;
            } else {
                ulang = false;
            }
        } while (ulang == true);
    }
}