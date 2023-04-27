import javax.swing.JOptionPane;
public class ödev2 {
    public static void main(String[] args) {
        int hiz = Integer.parseInt(JOptionPane.showInputDialog("Lütfen hızınızı km/saat cinsinden giriniz: "));
        int tekrar = Integer.parseInt(JOptionPane.showInputDialog("Lütfen tekrar sayısını giriniz: "));
        
        int bazCeza = 0;
        
        if (hiz >= 111 && hiz <= 140) {
            if (tekrar >= 1 && tekrar <= 3) {
                bazCeza = 150;
            } else if (tekrar >= 4 && tekrar <= 5) {
                bazCeza = 350;
            } else if (tekrar >= 6 && tekrar <= 8) {
                bazCeza = 800;
            } else {
                bazCeza = 5000;
            }
        } else if (hiz >= 141 && hiz <= 160) {
            if (tekrar >= 1 && tekrar <= 3) {
                bazCeza = 375;
            } else if (tekrar >= 4 && tekrar <= 5) {
                bazCeza = 875;
            } else if (tekrar >= 6 && tekrar <= 8) {
                bazCeza = 2000;
            } else {
                bazCeza = 11000;
            }
        } else if (hiz >= 161 && hiz <= 180) {
            if (tekrar >= 1 && tekrar <= 3) {
                bazCeza = 720;
            } else if (tekrar >= 4 && tekrar <= 5) {
                bazCeza = 1650;
            } else if (tekrar >= 6 && tekrar <= 8) {
                bazCeza = 3800;
            } else {
                bazCeza = 18000;
            }
        } else {
            if (tekrar >= 1 && tekrar <= 3) {
                bazCeza = 1200;
            } else if (tekrar >= 4 && tekrar <= 5) {
                bazCeza = 2800;
            } else if (tekrar >= 6 && tekrar <= 8) {
                bazCeza = 6500;
            } else {
                bazCeza = 42000;
            }
        }
        
        int toplamCeza = bazCeza + (hiz * 2);
        JOptionPane.showMessageDialog(null, "Baz ceza: " + bazCeza + " TL\nToplam ceza: " + toplamCeza + " TL");
    }
    
}
