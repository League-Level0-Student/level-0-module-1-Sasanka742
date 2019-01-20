import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("When is your birthday?");
		String today = "01/20"; 
		if(birthday.equals(today)) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}else {
			JOptionPane.showMessageDialog(null, "Very Merry UNbirthday!");
		}
	}
}
