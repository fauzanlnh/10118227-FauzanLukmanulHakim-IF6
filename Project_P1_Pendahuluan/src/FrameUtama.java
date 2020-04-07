
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fauzanlh
 */
public class FrameUtama extends JFrame {

    public  FrameUtama() {
        this.setSize(200, 200);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void tampil() {
        this.setVisible(true);
    }

    public void tampil(String Nama) {
        this.setTitle(Nama);
        this.setVisible(true);
    }
}
