import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.sql.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
class StudentUser{
    public String username;
    public String password;

   public StudentUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
  
}
class arrlist {
    public static ArrayList<StudentUser>list=new ArrayList<>();
    
 public static void add_user(String name,String pass){
        list.add(new StudentUser(name,pass));
    }
    public static boolean check_pass(String username,String password){
        for (StudentUser studentUser : list) {
            System.out.println("occurs");
            if(studentUser.username.equals(username) && studentUser.password.equals(password)){
                System.out.println("Occur");
                return true;

            }
        }
        return false;

    }
   
    public static boolean changepassword(String username,String newpassword){
              for (StudentUser studentUser : list) {
            if(studentUser.username.equals(username)){
                studentUser.password=newpassword;
                return true;
            }
        }
        return false;

    }
    
}
class practice extends JFrame{
    public practice(){
        JFrame frame=new JFrame();


    }
}
class Adminjava extends JFrame{
    public Adminjava() {
        arrlist.add_user("Faizan", "pass");
        JFrame frame = new JFrame();
        JLabel adminJLabel=new JLabel("Admin login");
        JButton loginButton = new JButton("Login");
        JLabel nameLabel = new JLabel("Admin ID");
        JLabel passLabel = new JLabel("Password");
        JTextField nameText = new JTextField();
        JTextField passText = new JTextField();

        frame.setLayout(null);
        frame.setSize(700, 400);
        frame.setTitle("Admin Login Page");
        frame.setLocation(500, 150);
        frame.setBackground(new Color(70, 130, 180));
         frame.getContentPane().setBackground(new Color(70, 130, 180));
        
        frame.setVisible(true);
        
        
        adminJLabel.setBounds(171, 30, 250, 40);
        adminJLabel.setForeground(Color.darkGray);
        adminJLabel.setFont(new Font("Arial", Font.PLAIN, 30));
      //  frame.add(adminJLabel);
        
        nameLabel.setBounds(80, 100, 110, 40);
        nameLabel.setFont(new Font("Serif", Font.BOLD, 17));
        frame.add(nameLabel);

        passLabel.setBounds(80, 180, 110, 40);
        passLabel.setFont(new Font("Serif", Font.BOLD, 17));
        frame.add(passLabel);

        nameText.setBounds(200, 100, 170, 40);
        frame.add(nameText);

        passText.setBounds(200, 180, 170, 40);
        frame.add(passText);

        loginButton.setBounds(140, 270, 200, 40);
        frame.add(loginButton);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\HP\\Downloads\\admin-login-icon-15.png");
        Image image = imageIcon.getImage();

       
        Image scaledImage = image.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

        
        JLabel imageLabel = new JLabel(scaledImageIcon);
        imageLabel.setBounds(430, 50, 200, 200); 

        frame.add(imageLabel);

        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                String pass = passText.getText();
                
                if (arrlist.check_pass(name, pass)) {
                    JOptionPane.showMessageDialog(null, "Admin Login Successful!");
                    frame.dispose();
                    //AdminPage Admin=new AdminPage();
                 
                } else {
                    JOptionPane.showMessageDialog(frame, "Login Failed. Invalid username or password.");
                }
            }
        });
    }
}

public class New {
    public static void main(String[] args) {

    
        
 Adminjava s=new Adminjava();

       
    }
}
