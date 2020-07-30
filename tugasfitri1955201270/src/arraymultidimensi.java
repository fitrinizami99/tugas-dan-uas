
import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import javax.swing.JOptionPane;
import static sun.nio.cs.Surrogate.is;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO 110-14IAP
 */
public class arraymultidimensi {
    public static void main(String[] args) {
         String forgivness_is_a_coice[][] = {{"01","melupakan"},{"02","memaafkan"},{"03","tidak memaafkan"}};
        for (int i = 0; i < forgivness_is_a_coice.length; i++){
            for (int j = 0; j < forgivness_is_a_coice[0].length; j++){
                System.out.print(forgivness_is_a_coice[i][j]+" ");
            }
            System.out.println();
        }
        
        String cari = JOptionPane.showInputDialog(null, "cari pilihan penyelesaian masalah :");
        for (int i = 0; i < forgivness_is_a_coice.length; i++){
            for (int j = 0; j < forgivness_is_a_coice[0].length; j++){
                if (forgivness_is_a_coice[i][j].equals(cari)) {
                    JOptionPane.showConfirmDialog(null, "forgivness_is_a_coice dengan nomor " + cari + " di temukan berjenis " + forgivness_is_a_coice[i][j+1]);
                }
                System.out.print(forgivness_is_a_coice[i][j]+" ");
            }
            System.out.println();
        }
    }
}
