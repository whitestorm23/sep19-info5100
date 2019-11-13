package question1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
public class Calculator implements ActionListener {
    String arr[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "+", "-", "*", "/", "=" };
    JButton button[] = new JButton[arr.length];
    JTextField textField1;
    JLabel label1;
    JTextField textField2;
    JLabel label2;
    JTextField textField3;
    JButton button_c;
    boolean isOp1=true,isOp2;
    public Calculator() {
        JFrame frame = new JFrame("Integer Calculator");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 300, 300);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        textField1 = new JTextField(3);
        label1 = new JLabel("?");
        textField2 = new JTextField(3);
        label2 = new JLabel("=");
        textField3 = new JTextField(6);
        button_c = new JButton("C");
        button_c.addActionListener(this);
        panel1.add(textField1);
        panel1.add(label1);
        panel1.add(textField2);
        panel1.add(label2);
        panel1.add(textField3);
        panel1.add(button_c);
        panel2.setLayout(new GridLayout(4, 5, 5, 5));// 3行5列，空隙为5
        for (int i = 0; i < arr.length; i++) {
            button[i] = new JButton(arr[i]);
            button[i].addActionListener(this);
            panel2.add(button[i]);
        }
        frame.add(panel1);
        frame.add(panel2);
        frame.setVisible(true);
    }
    public static String compute(int x,int y,String op) {
        int result=0;
        DecimalFormat df = new DecimalFormat("0.0000");
        if(y==0&&op.equals("/")) {
            return "the divisor cannot be zero";
        }
        switch (op) {
        case "+":
            result = x + y;
            break;
        case "-":
            result = x - y;
            break;
        case "*":
            result = x * y;
            break;
        case "/":
            return df.format((x+0.0) / y);//格式化小数
        }
        return result+"";
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       
        if("0123456789".indexOf(e.getActionCommand())>=0) {
            if(isOp1&&textField1.getText().length()<3) {
                textField1.setText(textField1.getText()+e.getActionCommand());
                isOp2 = false;
            }
            if(!isOp1&&isOp2&&textField2.getText().length()<3) {
                textField2.setText(textField2.getText()+e.getActionCommand());
            }
        }
        if("+-*/".indexOf(e.getActionCommand())>=0) {
            label1.setText(e.getActionCommand());
            isOp2 = true;
            isOp1 = false;
        }
        if(e.getActionCommand().equals("C")) {
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
            label1.setText("?");
            isOp1 = true;
            isOp2 = false;
        }
        if(e.getActionCommand().equals("=")) {
            isOp1 = false;
            isOp2 = false;
            textField3.setText(compute(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()), label1.getText()));
        }
    }
}
