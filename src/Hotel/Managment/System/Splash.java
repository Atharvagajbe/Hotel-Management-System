package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Splash.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(-10,0,1200,650);
        add(label);

        setLayout(null);
        setLocation(50,80);
        setSize(1200,690);
        setVisible(true);

        try {
            Thread.sleep(4000);
            new Hotel.Management.System.Login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}
