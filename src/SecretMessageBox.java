import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		String password= "123password123";
		String secret = JOptionPane.showInputDialog("Enter a secret message:");
		JOptionPane.showMessageDialog(null, "You can see the secret message if you can guess the password.");
		String guess = JOptionPane.showInputDialog("Guess the passcode:");
		if(password.equals(guess)) {
			JOptionPane.showMessageDialog(null, "secret message: " + secret);
		}else {
			JOptionPane.showMessageDialog(null, "INTRUDER!!!!!!!");
		}
		
	}
}
