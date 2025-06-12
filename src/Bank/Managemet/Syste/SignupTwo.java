package Bank.Managemet.Syste;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.Random;

public class SignupTwo extends JFrame implements ActionListener {
    JComboBox religion,category,income,education,occupation;
    JTextField pan,aadhar;
    JButton next;
    JRadioButton sno,syes,eno,eyes;
    JDateChooser dateChooser;
    String formno;
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);

        setTitle("New Account Opening Form - Page ");

        JLabel additionalDetails = new JLabel("Page 2 : Additional Details. " );
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,38));
        additionalDetails.setBounds(140,20,600,40);
        add(additionalDetails);

        JLabel personalDetails = new JLabel("Page 1: Personal Details " );
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,300,30);
        add(personalDetails);

        JLabel name = new JLabel("Religion : ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Others"};
        religion= new JComboBox<>(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setFont(new Font("Raleway",Font.BOLD,16));
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel fname = new JLabel("Category : ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        String valCategory[] = {"General","OBC","SC","ST","Others"};
        category = new JComboBox<>(valCategory);
        category.setBounds(300,190,400,30);
        category.setFont(new Font("Raleway",Font.BOLD,16));
        category.setBackground(Color.WHITE);
        add(category);

        JLabel dob = new JLabel("Income: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        String incomecategory[] = {"Null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
        income = new JComboBox<>(incomecategory);
        income.setBounds(300,240,400,30);
        income.setFont(new Font("Raleway",Font.BOLD,16));
        income.setBackground(Color.WHITE);
        add(income);

        JLabel gender = new JLabel("Educational ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        JLabel emailadd = new JLabel("Qualification : ");
        emailadd.setFont(new Font("Raleway",Font.BOLD,20));
        emailadd.setBounds(100,315,200,30);
        add(emailadd);

        String educationValues[] = {"Non-Graduate","Graduate","Post-Graduate","Docterate","Post-Doc","Others"};
        education = new JComboBox<>(educationValues);
        education.setBounds(300,315,400,30);
        education.setFont(new Font("Raleway",Font.BOLD,16));
        education.setBackground(Color.WHITE);
        add(education);


        JLabel marital = new JLabel("Occupation : ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        String occupationValues[] = {"Salaried","Self-Employed","Business","Student","Retired","Others"};
        occupation = new JComboBox<>(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setFont(new Font("Raleway",Font.BOLD,16));
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel address = new JLabel("Pan Number : ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);

        JLabel city = new JLabel("Aadhar Number : ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);

        JLabel state = new JLabel("Senior Citizen : ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,120,30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(500,540,120,30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup  seniorgroup = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);

        JLabel pincode = new JLabel("Existing Account: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,120,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(500,590,120,30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup  existgroup = new ButtonGroup();
        existgroup.add(eyes);
        existgroup.add(eno);

        next = new JButton("Next");
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ex) {
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "Yes";
        }else if(eno.isSelected()){
            existingaccount = "No";
        }
        String span = pan.getText();
        String saadhar = aadhar.getText();

        try{
            if(equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            }else {
                Conn c = new Conn();
                String query = "insert into signuptwo values('" + this.formno + "','" + sreligion + "','" + scategory + "','" + sincome + "','" + seducation + "','" + soccupation + "','" + seniorcitizen +"','" + existingaccount + "','" + span + "','" + saadhar + "')";
                c.s.executeUpdate(query);

                //SignupThree Object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupTwo("");
    }
}
