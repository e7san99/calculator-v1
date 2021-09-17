package com.company;

import javax.swing.*;
public class Main {
    private static JPanel panel;
    private static JFrame frame;
    private static JTextField number1;
    private static JTextField number2;
    private static JButton sum;
    private static JButton min;
    private static JButton multi;
    private static JButton div;
    private static JButton result;
    private static JLabel resultNumber;
    private static double num1,num2,num3;

    public static void main(String[] args) {
        panel = new JPanel();
        panel.setLayout(null);

        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 350);
        frame.setTitle("Calculator");
        frame.add(panel);

        numbers();

        summation();

        minimize();

        multiply();

        divide();

        resultMethod();

        reset();



        frame.setVisible(true);
    }
    private static void numbers() {
        number1 = new JTextField();
        number1.setBounds(50,50,90,20);
        panel.add(number1);

        number2 = new JTextField();
        number2.setBounds(150,50,90,20);
        panel.add(number2);
    }


    private static void summation() {
        sum = new JButton("+");
        sum.setBounds(30, 130, 50, 20);
        sum.addActionListener(e->{
            try {
                num1 = Double.parseDouble(number1.getText());
                num2 = Double.parseDouble(number2.getText());
                num3 = num1 + num2;
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,"insert a Number");
            }
        });
        panel.add(sum);
    }

    private static void minimize() {
        min = new JButton("ـــ");
        min.setBounds(90, 130, 50, 20);
        min.addActionListener(e->{
            try {
                num1 = Double.parseDouble(number1.getText());
                num2 = Double.parseDouble(number2.getText());
                num3 = num1 - num2;
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,"insert a Number");
            }
        });
        panel.add(min);
    }

    private static void multiply() {
        multi = new JButton("*");
        multi.setBounds(150, 130, 50, 20);
        multi.addActionListener(e->{
            try {
                num1 = Double.parseDouble(number1.getText());
                num2 = Double.parseDouble(number2.getText());
                num3 = num1 * num2;
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,"insert a Number");
            }
        });
        panel.add(multi);
    }

    private static void divide() {
        div = new JButton("/");
        div.setBounds(210, 130, 50, 20);
        div.addActionListener(e->{
            try {
                num1 = Double.parseDouble(number1.getText());
                num2 = Double.parseDouble(number2.getText());
                num3 = num1 / num2;
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,"insert a Number");
            }
        });
        panel.add(div);
    }

    private static void resultMethod() {
        result = new JButton(" Result ");
        result.setBounds(100, 190, 80, 20);
        result.addActionListener(e->{
                resultNumber.setText(String.valueOf(num3));
        });
        panel.add(result);

        resultNumber = new JLabel();
        resultNumber.setBounds(130, 220, 80, 20);
        panel.add(resultNumber);
    }

    private static void reset(){
        JButton reset = new JButton("Reset");
        reset.setBounds(200,250,70,18);
        reset.addActionListener(e->{
            number1.setText(null);
            number2.setText(null);
            resultNumber.setText(null);
        });
        panel.add(reset);
    }
}
