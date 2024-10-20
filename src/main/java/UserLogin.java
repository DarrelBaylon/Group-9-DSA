/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Darrel
 */
public class UserLogin extends JFrame implements ActionListener{

    private JTextField txtFirstName, txtLastName, txtEmail;
    private JPasswordField txtPassword, txtConfirmPassword;
    private JButton btnCreateAccount;
    private JLabel lblFirstName,lblLastName,lblEmail,lblPassword,lblConfirmPassword,lblLogo;
    private ImageIcon imgLogo;
    
    UserLogin() {
        
        setTitle("Create Account");
        setSize(1000, 600);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(253,252,233));
        
        
        imgLogo = new ImageIcon("C:\\Users\\Darrel\\Documents\\NetBeansProjects\\LoginUser\\src\\Capture.JPG");
        lblLogo = new JLabel();
        lblLogo.setBounds(400, 1, 163, 134);
        lblLogo.setIcon(imgLogo);
        add(lblLogo);      
       
        lblFirstName = new JLabel("First Name:");
        lblFirstName.setBounds(225, 125, 200, 30);
        lblFirstName.setFont(new Font("Garet",Font.BOLD,17));
        add(lblFirstName);

        txtFirstName = new JTextField();
        txtFirstName.setBounds(225, 165, 250, 30);
        txtFirstName.setBackground(new Color(180, 204, 224));
        add(txtFirstName);
        
        lblEmail = new JLabel("Email Address:");
        lblEmail.setBounds(225, 225, 200, 30);
        lblEmail.setFont(new Font("Garet",Font.BOLD,17));
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(225, 265, 540, 30);
        txtEmail.setBackground(new Color(180, 204, 224));
        add(txtEmail);
        
        lblPassword = new JLabel("Password:");
        lblPassword.setBounds(225, 325, 200, 30);
        lblPassword.setFont(new Font("Garet",Font.BOLD,17));
        add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(225, 365, 250, 30);
        txtPassword.setBackground(new Color(180, 204, 224));
        add(txtPassword);

        lblLastName = new JLabel("Last Name:");
        lblLastName.setBounds(515, 125, 200, 30);
        lblLastName.setFont(new Font("Garet",Font.BOLD,17));
        add(lblLastName);

        txtLastName = new JTextField();
        txtLastName.setBounds(515, 165, 250, 30);
        txtLastName.setBackground(new Color(180, 204, 224));
        add(txtLastName);

        lblConfirmPassword = new JLabel("Confirm Password:");
        lblConfirmPassword.setBounds(515, 325, 200, 30);
        lblConfirmPassword.setFont(new Font("Garet",Font.BOLD,17));
        add(lblConfirmPassword);

        txtConfirmPassword = new JPasswordField();
        txtConfirmPassword.setBounds(515, 365, 250, 30);
        txtConfirmPassword.setBackground(new Color(180, 204, 224));
        add(txtConfirmPassword);

        btnCreateAccount = new JButton("Create Account");
        btnCreateAccount.setBounds(225, 450, 230, 40);
        btnCreateAccount.setFont(new Font("Garet",Font.BOLD,17));
        btnCreateAccount.setBackground(new Color(37, 113, 128));
        btnCreateAccount.setForeground(new Color(253, 252, 233));
        add(btnCreateAccount);

        
        btnCreateAccount.addActionListener(this);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCreateAccount) {
            String firstName = txtFirstName.getText().trim();
            String lastName = txtLastName.getText().trim();
            String email = txtEmail.getText().trim();
            String password = new String(txtPassword.getPassword());
            String confirmPassword = new String(txtConfirmPassword.getPassword());

            if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields are required to be filled!", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(null, "Passwords do not match!", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                
                dispose();
                
            }
        }
    }


}

