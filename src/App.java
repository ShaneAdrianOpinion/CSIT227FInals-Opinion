import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class App extends JFrame{
    private JPanel pnlMain;
    private JRadioButton rbCustomer;
    private JRadioButton rbClerk;
    private JRadioButton rbManager;
    private JTextField tfName;
    private JTextArea taPersons;
    private JButton btnSave;
    private JTextField tfAge;
    private JTextField tfMonths;
    private JTextField tfSalary;
    private JButton btnClear;
    private JTextField tfLoad;
    private JButton btnLoad;
    private JButton btnSayHi;
    private JButton btnSavePerson;
    private JButton btnLoadPerson;
    private JButton btnReward;

    private List<Person> persons;

    public App() {
        ButtonGroup group = new ButtonGroup();
        group.add(rbClerk);
        group.add(rbCustomer);
        group.add(rbManager);

        // TODO add implementations for all milestones here
        persons = new ArrayList<>();
        btnSayHi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    var input = String.valueOf(tfName.getText());
                    JOptionPane.showMessageDialog(pnlMain, "Hi" + input);
                } catch (IllegalArgumentException letterError){
                    JOptionPane.showMessageDialog(pnlMain, "Do not input letters!");
                }catch (Exception error){
                    JOptionPane.showMessageDialog(pnlMain, "Input a positive integers");
                }
            }
        });

    }

    public static void main(String[] args) {
        // add here how to make GUI visible
        App opinion = new App();
        opinion.setSize(600,500);
        opinion.setTitle("Anything");
        opinion.setContentPane(opinion.pnlMain);
        opinion.setDefaultCloseOperation(EXIT_ON_CLOSE);
        opinion.setVisible(true);

    }

    static void giveReward(int n) {

    }
}
