package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini extends JFrame implements ActionListener {
    String pin;
    JButton button;
     Mini(String pin){
         this.pin = pin;

         getContentPane().setBackground(new Color(255,204,204));
         setSize(400,600);
         setLocation(20,20);
         setLayout(null)
         ;

         JLabel label1 = new JLabel();
         label1.setBounds(20,140,400,400);
         add(label1);

         JLabel label2 = new JLabel("Diksha Bank");
         label2.setFont(new Font("System",Font.BOLD,15));
         label2.setBounds(150,20,200,20);
         add(label2);


         JLabel label3 = new JLabel();
         label3.setBounds(20,80,300,20);
         add(label3);


         JLabel label4 = new JLabel();
         label4.setBounds(20,400,300,20);
         add(label4);

         try {
             Con c = new Con();
             ResultSet rs = c.statement.executeQuery("Select * from login where pin = '"+pin+"'");
             while (rs.next()){
               label3.setText("Card Number:"+rs.getString("card_number").substring(0,4)+"XXXXXXXXXXXXX"+rs.getString("card_number").substring(12));
             }

         }catch (Exception e){
             e.printStackTrace();
         }
         try {
             int balance =0;
             Con c = new Con();
             ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");

             while (resultSet.next()) {

                 label1.setText(label1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><br><html>");
                 if (resultSet.getString("type").equals("Deposit")) {
                     balance += Integer.parseInt(resultSet.getString("amount"));
                 } else {
                     balance -= Integer.parseInt(resultSet.getString("amount"));

                 }
             }
             label4.setText("YOUR TOTAL BALANCE IS RS"+balance);
         }catch (Exception e){
             e.printStackTrace();
         }

         button = new JButton("Exit ");
         button.setBounds(20,500,100,25);
         add(button);
         button.setBackground(Color.BLACK);
         button.setForeground(Color.white);
         button.addActionListener(this);
         setVisible(true);

     }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
         new Mini("");

    }
}
