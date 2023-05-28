
package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author Dip Ganguli
 */
public class SignUpOne extends JFrame {

    SignUpOne() {
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        JLabel formno = new JLabel("Application Form no. "+ random);
        formno.setFont(new Font("Raleway",Font.BOLD,36));
        formno.setBounds(150, 20, 500, 40);
        add(formno);

        setLayout(null);
        getContentPane().setBackground(Color.white);
        setSize(800, 600);
        setVisible(true);
        setLocation(320, 100);
    }

    public static void main(String args[]) {
        new SignUpOne();
    }
}
