import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("When is your birthday?");
		if(birthday.equals("01/13")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}else {
			JOptionPane.showMessageDialog(null, "Very Merry UNbirthday!");
		}
	}
}
