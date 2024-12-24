
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class welcomeAdmin extends Admins {

    public welcomeAdmin(String AdminName, String AdminPass) {
        super(AdminName, AdminPass);
       
    }
    public void getDetails() {
        JOptionPane optionPane = new JOptionPane("Welcome to Admin Panel \n"+getAdminName(), JOptionPane.CANCEL_OPTION);
        JDialog dialog = optionPane.createDialog("");
        dialog.setAlwaysOnTop(true); // to show top of all other application
        dialog.setVisible(true); // to visible the dialog

    }
     public void getDetailsUser() {
        JOptionPane optionPane = new JOptionPane("Welcome to User Panel "+getAdminName(), JOptionPane.CANCEL_OPTION);
        JDialog dialog = optionPane.createDialog("");
        dialog.setAlwaysOnTop(true); // to show top of all other application
        dialog.setVisible(true); // to visible the dialog

    }
}
