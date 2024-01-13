import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null,"Enter your name");
        JOptionPane.showMessageDialog(null,"Your name length is:"+name.length());
    }
}