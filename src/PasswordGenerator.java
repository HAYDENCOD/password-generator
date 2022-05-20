import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.util.stream.Collectors;

public class PasswordGenerator extends JDialog {
    private JPanel contentPane;
    private JButton button1;
    private JLabel label;


    public PasswordGenerator() {
        JFrame frame =  new JFrame("PASSWORD GENERATOR");
        frame.setContentPane(contentPane);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new Random().ints(10,33,122).mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());
                label.setText("YOUR PASSWORD IS:   "+password);
            }
        });

    }


    public static void main(String[] args) {
        PasswordGenerator dialog = new PasswordGenerator();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

    }
}
