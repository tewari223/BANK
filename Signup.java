package bank.management.system;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1, r2, M1, M2, M3;
    JButton next;
    JTextField textname, textFname, textEmail, textAdd, textCity, textpin, textstate;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    Signup() {

        super("Application Form");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("Application from no." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Ralway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name");
        labelName.setFont(new Font("Ralway", Font.BOLD, 20));
        labelName.setBounds(100, 150, 100, 30);
        add(labelName);

        textname = new JTextField();
        textname.setFont(new Font("Ralway", Font.BOLD, 20));
        textname.setBounds(300, 150, 400, 30);
        add(textname);

        JLabel labelFName = new JLabel("Father's Name");
        labelFName.setFont(new Font("Ralway", Font.BOLD, 20));
        labelFName.setBounds(100, 190, 200, 30);
        add(labelFName);

        textFname = new JTextField();
        textFname.setFont(new Font("Ralway", Font.BOLD, 20));
        textFname.setBounds(300, 190, 400, 30);
        add(textFname);

        JLabel DDB = new JLabel("Date of Birth");
        DDB.setFont(new Font("Ralway", Font.BOLD, 20));
        DDB.setBounds(100, 230, 200, 30);
        add(DDB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 230, 400, 30);
        add(dateChooser);

        JLabel labelj = new JLabel("Gender");
        labelj.setFont(new Font("Ralway", Font.BOLD, 20));
        labelj.setBounds(100, 270, 200, 30);
        add(labelj);

        r1 = new JRadioButton("MALE");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222, 225, 228));
        r1.setBounds(350, 270, 90, 30);
        add(r1);

        r2 = new JRadioButton("FEMALE");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222, 225, 228));
        r2.setBounds(450, 270, 90, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Address");
        labelEmail.setFont(new Font("Ralway", Font.BOLD, 20));
        labelEmail.setBounds(100, 310, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Ralway", Font.BOLD, 30));
        textEmail.setBounds(300, 310, 400, 30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Ralway", Font.BOLD, 20));
        labelMs.setBounds(100, 350, 200, 30);
        add(labelMs);

        M1 = new JRadioButton("Married");
        M1.setBounds(300, 350, 100, 30);
        M1.setBackground(new Color(222, 225, 228));
        M1.setFont(new Font("Ralway", Font.BOLD, 14));
        add(M1);

        M2 = new JRadioButton("UnMarried");
        M2.setBounds(450, 350, 100, 30);
        M2.setBackground(new Color(222, 225, 228));
        M2.setFont(new Font("Ralway", Font.BOLD, 14));
        add(M2);
        M3 = new JRadioButton("Other");
        M3.setBounds(635, 350, 100, 30);
        M3.setBackground(new Color(222, 225, 228));
        M3.setFont(new Font("Ralway", Font.BOLD, 14));
        add(M3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(M1);
        buttonGroup1.add(M2);
        buttonGroup1.add(M3);


        JLabel labelAdd = new JLabel("Address");
        labelAdd.setFont(new Font("Ralway", Font.BOLD, 20));
        labelAdd.setBounds(100, 390, 200, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Ralway", Font.BOLD, 30));
        textAdd.setBounds(300, 390, 400, 30);
        add(textAdd);

        JLabel labelCity = new JLabel("City");
        labelCity.setFont(new Font("Ralway", Font.BOLD, 20));
        labelCity.setBounds(100, 440, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Ralway", Font.BOLD, 14));
        textCity.setBounds(300, 440, 400, 30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin");
        labelPin.setFont(new Font("Ralway", Font.BOLD, 20));
        labelPin.setBounds(100, 480, 200, 30);
        add(labelPin);

        textpin = new JTextField();
        textpin.setFont(new Font("Ralway", Font.BOLD, 14));
        textpin.setBounds(300, 480, 400, 30);
        add(textpin);

        JLabel labelstate = new JLabel("State");
        labelstate.setFont(new Font("Ralway", Font.BOLD, 20));
        labelstate.setBounds(100, 520, 200, 30);
        add(labelstate);

        textstate = new JTextField();
        textstate.setFont(new Font("Ralway", Font.BOLD, 14));
        textstate.setBounds(300, 520, 400, 30);
        add(textstate);

        next = new JButton("Next");
        next.setFont(new Font("Ralway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 600, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 225, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textname.getText();
        String fathername = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;

        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if (M1.isSelected()) {
            marital = "Married";
        } else if (M2.isSelected()) {
            marital = "Unmarried";
        } else if (M3.isSelected()) {
            marital = "Other";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textpin.getText();
        String state = textstate.getText();


     try{
         if(textname.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Fill all the fields");
         }
         else {
             Con CON1 = new Con();
             String q ="Insert Into signup values('"+formno+"', '"+name+"','"+fathername+"', '"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
             CON1.statement.executeUpdate(q);
             new Signup2(formno);
             setVisible(false);

         }

     }
     catch (Exception E){
         E.printStackTrace();

     }

    }


    public static void main(String[] args) {
        new Signup();
    }

    }


