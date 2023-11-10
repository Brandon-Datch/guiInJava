import javax.swing.*;

public class MainFrame extends JFrame {
    private JTextField tfFirstName;
    private JTextField tfSecondName;
    private JButton OKButton;
    private JButton CLEARButton;
    private JLabel lbWelcome;
    private JPanel mainPanel;

    public MainFrame() {
        setContentPane(mainPanel);
setTitle("Welcome");
setSize(450,300);
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
setVisible(true);
        OKButton.addActionListener(e -> {
                String LBfirstName = tfFirstName.getText();
                String LBsecondName = tfSecondName.getText();
            if (!LBfirstName.isEmpty() && !LBsecondName.isEmpty()) {
                lbWelcome.setText("Welcome " + LBfirstName + " " + LBsecondName + "!");
            } else {
                // Display a message or take some action if names are not entered
                JOptionPane.showMessageDialog(this, "Please enter both first and second names.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        CLEARButton.addActionListener(e -> {
            tfFirstName.setText("");
            tfSecondName.setText("");
            lbWelcome.setText("");
        });
    }

    public static void main(String[] args) {
        new MainFrame();

    }
}

