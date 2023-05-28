
package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Dip Ganguli
 */
public class Login extends JFrame implements ActionListener {

    JTextField cardTextField;
    JPasswordField pinTextField;

    /* Buttons */ 
    JButton login, registerButton, clearButton;

    Login() {

        setTitle("Bank Management");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, DO_NOTHING_ON_CLOSE);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(60, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome To Your Bank");
        text.setFont(new Font("Osward",Font.BOLD,36));
        text.setBounds(200, 40, 420, 40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,26));
        cardno.setBounds(100, 140, 150, 30);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 140, 250, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Osward",Font.BOLD,26));
        pin.setBounds(100, 200, 250, 30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 200, 250, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(300, 250, 100, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        clearButton = new JButton("CLEAR");
        clearButton.setBounds(450, 250, 100, 30);
        clearButton.setBackground(Color.black);
        clearButton.setForeground(Color.white);
        clearButton.addActionListener(this);
        add(clearButton);

        registerButton = new JButton("SIGN UP");
        registerButton.setBounds(300, 300, 250, 30);
        registerButton.setBackground(Color.black);
        registerButton.setForeground(Color.white);
        registerButton.addActionListener(this);
        add(registerButton);

        getContentPane().setBackground(Color.white);
        setSize(800, 600);
        setVisible(true);
        setLocation(320, 100);
        
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == login) {

        } else if(ae.getSource() == clearButton) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if(ae.getSource() == registerButton) {

        }
    }

    public static void main(String args[]) {
        new Login();
    }
}
