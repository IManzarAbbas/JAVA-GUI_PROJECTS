

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Calculator implements  ActionListener
{
    double number1=0,number2=0,result1=0;
    int calculation;
    JFrame frame ;
    JLabel result;
    JPanel home;
    JTextField resultField ;
    JButton divide, multi,plus,minus,equals,zero,one,two,three,four,five,six,seven,eight,nine,clear,point;
    Calculator()
    {
        DesignGuiOfcalCulator();
    }



    public void DesignGuiOfcalCulator()
    {
        frame = new JFrame("Calculator");
        frame.setLayout(null);
        frame.setLocation(300,50);
        frame.setSize(320,500);
        home=new JPanel();
        home.setLayout(null);
        home.setBounds(0,0,350,500);
        home.setBackground(Color.black);
        frame.add(home);

         result = new JLabel(" ");
        result.setBounds(0,0,320,20);
        result.setForeground(Color.WHITE);
        result.setHorizontalAlignment(JLabel.CENTER);
        home.add(result);

        resultField = new JTextField();
        resultField.setBounds(0,45,350,70);
        resultField.setFont(new Font("Arial", Font.BOLD,22));
        resultField.setEditable(false);
        resultField.addActionListener(this);
        home.add(resultField);
        equals = new JButton("=");
        equals.setBounds(170,410,120,30);
        equals.setFont(new Font("Arial", Font.BOLD,22));
        equals.setForeground(Color.BLACK);
        equals.setBackground(Color.WHITE);
        equals.setFocusPainted(false);
        equals.addActionListener(this);
        home.add(equals);

        clear = new JButton("C");
        clear.setBounds(20,410,120,30);
        clear.setFont(new Font("Arial", Font.BOLD,22));
        clear.setForeground( Color.BLACK);
        clear.setBackground(Color.WHITE);
        clear.setFocusPainted(false);
        home.add(clear);
        clear.addActionListener(this);














        divide = new JButton("/");
        divide.setBounds(240,200,50,30);
        divide.setFont(new Font("Arial", Font.BOLD,22));
        divide.setForeground(Color.BLACK);
        divide.setBackground(new Color(245, 134, 52));
        divide.setFocusPainted(false);
        home.add(divide);
        divide.addActionListener(this);




        multi = new JButton("X");
        multi.setBounds(240,250,50,30);
        multi.setFont(new Font("Arial", Font.BOLD,22));
        multi.setForeground(Color.BLACK);
        multi.setBackground(new Color(245, 134, 52));
        multi.setFocusPainted(false);
        home.add(multi);
        multi.addActionListener(this);


        minus = new JButton("-");
        minus.setBounds(240,300,50,30);
        minus.setFont(new Font("Arial", Font.BOLD,22));
        minus.setForeground(Color.BLACK);
        minus.setBackground(new Color(245, 134, 52));
        minus.setFocusPainted(false);
        home.add(minus);
        minus.addActionListener(this);



        plus = new JButton("+");
        plus.setBounds(240,350,50,30);
        plus.setFont(new Font("Arial", Font.BOLD,22));
        plus.setForeground(Color.BLACK);
        plus.setBackground(new Color(245, 134, 52));
        plus.setFocusPainted(false);
        home.add(plus);
        plus.addActionListener(this);


        nine = new JButton("9");
        nine.setBounds(170,200,50,30);
        nine.setFont(new Font("Arial", Font.BOLD,22));
        nine.setForeground(Color.BLACK);
        nine.setBackground(new Color(245, 134, 52));
        nine.setFocusPainted(false);
        home.add(nine);
        nine.addActionListener(this);


        eight = new JButton("8");
        eight.setBounds(100,200,50,30);
        eight.setFont(new Font("Arial", Font.BOLD,22));
        eight.setForeground(Color.BLACK);
        eight.setBackground(new Color(245, 134, 52));
        eight.setFocusPainted(false);
        home.add(eight);
        eight.addActionListener(this);




        seven = new JButton("7");
        seven.setBounds(20,200,50,30);
        seven.setFont(new Font("Arial", Font.BOLD,22));
        seven.setForeground(Color.BLACK);
        seven.setBackground(new Color(245, 134, 52));
        seven.setFocusPainted(false);
        home.add(seven);
        seven.addActionListener(this);





        six = new JButton("6");
        six.setBounds(170,250,50,30);
        six.setFont(new Font("Arial", Font.BOLD,22));
        six.setForeground(Color.BLACK);
        six.setBackground(new Color(245, 134, 52));
        six.setFocusPainted(false);
        home.add(six);
        six.addActionListener(this);


        five = new JButton("5");
        five.setBounds(100,250,50,30);
        five.setFont(new Font("Arial", Font.BOLD,22));
        five.setForeground(Color.BLACK);
        five.setBackground(new Color(245, 134, 52));
        five.setFocusPainted(false);
        home.add(five);
        five.addActionListener(this);




        four = new JButton("4");
        four.setBounds(20,250,50,30);
        four.setFont(new Font("Arial", Font.BOLD,22));
        four.setForeground(Color.BLACK);
        four.setBackground(new Color(245, 134, 52));
        four.setFocusPainted(false);
        home.add(four);
        four.addActionListener(this);





        three = new JButton("3");
        three.setBounds(170,300,50,30);
        three.setFont(new Font("Arial", Font.BOLD,22));
        three.setForeground(Color.BLACK);
        three.setBackground(new Color(245, 134, 52));
        three.setFocusPainted(false);
        home.add(three);
        three.addActionListener(this);


        two = new JButton("2");
        two.setBounds(100,300,50,30);
        two.setFont(new Font("Arial", Font.BOLD,22));
        two.setForeground(Color.BLACK);
        two.setBackground(new Color(245, 134, 52));
        two.setFocusPainted(false);
        home.add(two);
        two.addActionListener(this);




        one = new JButton("1");
        one.setBounds(20,300,50,30);
        one.setFont(new Font("Arial", Font.BOLD,22));
        one.setForeground(Color.BLACK);
        one.setBackground(new Color(245, 134, 52));
        one.setFocusPainted(false);
        home.add(one);
        one.addActionListener(this);



        point = new JButton(".");
        point.setBounds(170,350,50,30);
        point.setFont(new Font("Arial", Font.BOLD,22));
        point.setForeground(Color.BLACK);
        point.setBackground(new Color(245, 134, 52));
        point.setFocusPainted(false);
        home.add(point);
        point.addActionListener(this);


        zero = new JButton("0");
        zero.setBounds(20,350,130,30);
        zero.setFont(new Font("Arial", Font.BOLD,22));
        zero.setForeground(Color.BLACK);
        zero.setBackground(new Color(245, 134, 52));
        zero.setFocusPainted(false);
        home.add(zero);
        zero.addActionListener(this);





















        frame.setVisible(true );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }




    public static void main(String[] args) {
        new Calculator ();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==clear)
       {
           resultField.setText("");
           result.setText("");
           result1=0;
       }
       else if(e.getSource()==zero)
       {
           if(resultField.getText().equals("0"))
           {
               return;
           }
           else
           {
               resultField.setText(resultField.getText()+"0");

           }
       }
       else if(e.getSource()==one)
       {
           resultField.setText(resultField.getText()+"1");
       }
       else if(e.getSource()==two)
       {
           resultField.setText(resultField.getText()+"2");
       }
       else if(e.getSource()==three)
       {
           resultField.setText(resultField.getText()+"3");
       }
       else if (e.getSource()==four) {
           resultField.setText(resultField.getText()+"4");

       }
       else if (e.getSource() == five) {
           resultField.setText(resultField.getText()+"5");
       }
       else if (e.getSource() == six) {
           resultField.setText(resultField.getText()+"6");
       }
       else if (e.getSource() ==seven) {
           resultField.setText(resultField.getText()+"7");
       }
       else if (e.getSource() == eight) {
           resultField.setText(resultField.getText()+"8");
       }
       else if (e.getSource() == nine) {
           resultField.setText(resultField.getText()+"9");
       }
       else if (e.getSource() ==point) {
           if(resultField.getText().equals("."))
           {
               return;
           }
           else
           {
               resultField.setText(resultField.getText()+".");

           }
       }
       else if (e.getSource() ==plus)
       {
           String temp=resultField.getText();
           number1 = Double.parseDouble(resultField.getText());
           calculation=1;
           resultField.setText("");
           result.setText(temp+"+");
       }

       else if (e.getSource() ==minus)
       {
           String temp=resultField.getText();
           number1 = Double.parseDouble(resultField.getText());
           calculation=2;
           resultField.setText("");
           result.setText(temp+"-");
       }

       else if (e.getSource() ==divide)
       {
           String temp=resultField.getText();
           number1 = Double.parseDouble(resultField.getText());
           calculation=3;
           resultField.setText("");
           result.setText(temp+"/");
       }

       else if (e.getSource() ==multi)
       {
           String temp=resultField.getText();
           number1 = Double.parseDouble(resultField.getText());
           calculation=4;
           resultField.setText("");
           result.setText(temp+"x");
       }
       else if(e.getSource()==equals)
       {
           number2 = Double.parseDouble(resultField.getText());
           switch (calculation)
           {
               case 1:
                   result1=number1+number2;
               break;
               case 2:
                   result1=number1-number2;
                   break;
               case 3:
                   result1=number1/number2;
                   break;
               case 4:
                   result1=number1*number2;
                   break;
           }
           if(Double.toString(result1).endsWith(".0"))
           {
               resultField.setText(Double.toString(result1).replace(".0",""));
           }
           else {
               resultField.setText(Double.toString(result1));
           }
           result.setText("");
           number1=result1;
       }





    }
}
