import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sample implements ActionListener {
    //Defining buttons as globaly

    JButton addbutton,multibutton,divbutton,minbutton,dotbutton,sixbutton,sevenbutton,eightbutton,ninebutton,fourbutton,fivebutton,onebutton,
            twobutton,threebutton,zerobutton,clear,equalbutton;
    JLabel displaybox;
    boolean isOperatorclicked=false,isaddClicked=false,isminClicked=false,isdivClicked=false,ismultiClicked=false;
    //Defining variables as globaly
    Float num1,num2,sum;

    public sample() {
        //SCREEN
        JFrame jf = new JFrame("Calculator");
        jf.setSize(500,600);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //LABEL
        displaybox = new JLabel();
        displaybox.setBounds(30,20,430,60);
        displaybox.setBackground(Color.darkGray);
        displaybox.setOpaque(true);
        displaybox.setHorizontalAlignment(SwingConstants.RIGHT);
        displaybox.setForeground(Color.WHITE);
        jf.add(displaybox);

        //sevenButton
        sevenbutton = new JButton("7");
        sevenbutton.setBounds(30,110,70,70);
        sevenbutton.addActionListener(this);
        jf.add(sevenbutton);

        //eightButton
        eightbutton = new JButton("8");
        eightbutton.setBounds(120,110,70,70);
        eightbutton.addActionListener(this);
        jf.add(eightbutton);

        //nineButton
        ninebutton = new JButton("9");
        ninebutton.setBounds(210,110,70,70);
        ninebutton.addActionListener(this);
        jf.add(ninebutton);

        //fourButton
        fourbutton = new JButton("4");
        fourbutton.setBounds(30,200,70,70);
        fourbutton.addActionListener(this);
        jf.add(fourbutton);

        //fiveButton
        fivebutton = new JButton("5");
        fivebutton.setBounds(120,200,70,70);
        fivebutton.addActionListener(this);
        jf.add(fivebutton);

        //sixButton
        sixbutton = new JButton("6");
        sixbutton.setBounds(210,200,70,70);
        sixbutton.addActionListener(this);
        jf.add(sixbutton);

        //oneButton
        onebutton = new JButton("1");
        onebutton.setBounds(30,290,70,70);
        onebutton.addActionListener(this);
        jf.add(onebutton);

        //twoButton
        twobutton = new JButton("2");
        twobutton.setBounds(120,290,70,70);
        twobutton.addActionListener(this);
        jf.add(twobutton);

        //threeButton
        threebutton = new JButton("3");
        threebutton.setBounds(210,290,70,70);
        threebutton.addActionListener(this);
        jf.add(threebutton);

        //clearButton
        clear = new JButton("clear");
        clear.setBounds(300 ,290, 70,70);
        clear.addActionListener(this);
        jf.add(clear);

        //addButton
        addbutton = new JButton("+");
        addbutton.setBounds(30,380,70,70);
        addbutton.addActionListener(this);
        jf.add(addbutton);

        //substractButton
        minbutton = new JButton("-");
        minbutton.setBounds(120,380,70,70);
        minbutton.addActionListener(this);
        jf.add(minbutton);

        //zeroButton
        zerobutton = new JButton("0");
        zerobutton.setBounds(210,380,70,70);
        zerobutton.addActionListener(this);
        jf.add(zerobutton);

        //multiplyButton
        multibutton = new JButton("x");
        multibutton.setBounds(300,110,70,70);
        multibutton.addActionListener(this);
        jf.add(multibutton);

        //divideButton
        divbutton = new JButton("/");
        divbutton.setBounds(300,200,70,70);
        divbutton.addActionListener(this);
        jf.add(divbutton);

        //dotButton
        dotbutton = new JButton(".");
        dotbutton.setBounds(300,380,70,70);
        dotbutton.addActionListener(this);
        jf.add(dotbutton);

        //equalButton
        equalbutton = new JButton("=");
        equalbutton.setBounds(400,380,70,70);
        equalbutton.addActionListener(this);
        jf.add(equalbutton);


    }

    public static void main(String[] args) {
      new sample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==threebutton){

         if (isOperatorclicked){
             displaybox.setText("3");
             isOperatorclicked=false;

         }else {
             displaybox.setText(displaybox.getText()+"3");
         }

        }else if(e.getSource()==twobutton){
            if (isOperatorclicked){
                displaybox.setText("2");
                isOperatorclicked=false;
            }else{
                displaybox.setText(displaybox.getText()+"2");
            }

        }else if(e.getSource()==onebutton){
            if (isOperatorclicked){
                displaybox.setText("1");
                isOperatorclicked=false;
            }else {
                displaybox.setText(displaybox.getText()+"1");
            }

        }else if(e.getSource()==fourbutton){
            if (isOperatorclicked){
                displaybox.setText("4");
                isOperatorclicked=false;
            }else {
                displaybox.setText(displaybox.getText()+"4");
            }
        }else if(e.getSource()==fivebutton){
            if (isOperatorclicked){
                displaybox.setText("5");
                isOperatorclicked=false;
            }else {
                displaybox.setText(displaybox.getText()+"5");
            }
        }else if (e.getSource()==sixbutton){

            if (isOperatorclicked){
                displaybox.setText("6");
                isOperatorclicked=false;
            }else{
                displaybox.setText(displaybox.getText()+"6");
            }

        }else if(e.getSource()==sevenbutton){

            if (isOperatorclicked){
                displaybox.setText("7");
                isOperatorclicked=false;
            }else{
                displaybox.setText(displaybox.getText()+"7");
            }

        }else if (e.getSource()==eightbutton){

            if (isOperatorclicked){
                displaybox.setText("8");
                isOperatorclicked=false;
            }else{
                displaybox.setText(displaybox.getText()+"8");
            }
        }else if(e.getSource()==ninebutton){

            if (isOperatorclicked){
                displaybox.setText("9");
                isOperatorclicked=false;
            }else{
                displaybox.setText(displaybox.getText()+"9");
            }
        }else if (e.getSource()==zerobutton){
            if (isOperatorclicked){
                displaybox.setText("0");
                isOperatorclicked=false;
            }else{
                displaybox.setText(displaybox.getText()+"0");
            }
        }
        else if (e.getSource()==clear) {
            displaybox.setText("");

        }else if (e.getSource()==dotbutton){
            if (isOperatorclicked){
                displaybox.setText(".");
                isOperatorclicked=false;
            }else{
                displaybox.setText(displaybox.getText()+".");
            }
        }

        else if (e.getSource()==addbutton){
                num1=Float.parseFloat(displaybox.getText());
                isOperatorclicked=true;
                isaddClicked=true;

        }else if (e.getSource()==minbutton){
            num1=Float.parseFloat(displaybox.getText());
            isOperatorclicked=true;
            isminClicked=true;
        }else if (e.getSource()==divbutton){

            num1=Float.parseFloat(displaybox.getText());
            isOperatorclicked=true;
            isdivClicked=true;

        }else if (e.getSource()==multibutton){

            num1=Float.parseFloat(displaybox.getText());
            isOperatorclicked=true;
            ismultiClicked=true;
        }else if (e.getSource()==equalbutton){
            if (isaddClicked){
                num2=Float.parseFloat(displaybox.getText());
                sum = num1+num2;
                String sumF = Float.toString(sum);
                displaybox.setText(sumF);

            }else if (isminClicked) {

                num2 = Float.parseFloat(displaybox.getText());
                sum = num1 - num2;
                String sumF = Float.toString(sum);
                displaybox.setText(sumF);
            }else if (ismultiClicked){
                num2 = Float.parseFloat(displaybox.getText());
                sum = num1 * num2;
                String sumF = Float.toString(sum);
                displaybox.setText(sumF);
            }else if (isdivClicked){
                num2 = Float.parseFloat(displaybox.getText());
                sum = num1 / num2;
                String sumF = Float.toString(sum);
                displaybox.setText(sumF);
            }


        }

    }
}


//Ping me to improve my code,thanks.