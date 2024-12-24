
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class welcomeUser extends Users {

    public welcomeUser(String UserName, String Password) {
        super(UserName, Password);
    }
    public void getDetails() {
        JOptionPane optionPane = new JOptionPane("Welcome to User Panel "+UserName, JOptionPane.CANCEL_OPTION);
        JDialog dialog = optionPane.createDialog("");
        dialog.setAlwaysOnTop(true); // to show top of all other application
        dialog.setVisible(true); // to visible the dialog

    }
}
