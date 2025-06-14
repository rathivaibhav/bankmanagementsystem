package Bank.Managemet.Syste;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {

    JPasswordField pin,repin;
    JButton change,back;
    String pinnumber;
    PinChange(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("Change your Pin");
        text.setBounds(250,280,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        JLabel pintext = new JLabel("New Pin");
        pintext.setBounds(165,320,180,25);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        image.add(pintext);

        pin = new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330,320,180,25);
        image.add(pin);

        JLabel repintext = new JLabel("Re-Enter New Pin");
        repintext.setBounds(165,360,180,25);
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,16));
        image.add(repintext);

        repin = new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(330,360,180,25);
        image.add(repin);

        change = new JButton("CHANGE");
        change.setBounds(355,520,150,30);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("BACK");
        back.setBounds(355,485,150,30);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==change){
            try{
                String npin = pin.getText();
                String rpin = repin.getText();
                if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null,"Entered Pin doesn't match");
                    return;
                }
                if (npin.equals("")){
                    JOptionPane.showMessageDialog(null," Pin enter pin");
                    return;
                }
                if (rpin.equals("")){
                    JOptionPane.showMessageDialog(null," Pin re-enter new pin");
                    return;
                }
                Conn conn = new Conn();
                String query1 = "update bank set pin ='"+rpin+"'where pin = '"+pinnumber+"'";
                String query2 = "update login set pin ='"+rpin+"'where pin = '"+pinnumber+"'";
                String query3 = "update signupthree set pin ='"+rpin+"'where pin = '"+pinnumber+"'";

                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);

                JOptionPane.showMessageDialog(null," Pin changed successfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}
