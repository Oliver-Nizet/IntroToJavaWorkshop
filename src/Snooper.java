import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("This is the FBI doing our annual life check. What is your name?");
	if(name.equals("Donald Trump")){
		JOptionPane.showMessageDialog(null, "You do not need to complete this examination.");
		System.exit(0);
	}
	String address = JOptionPane.showInputDialog("What is your address " + name + "?");
	String creditCard = JOptionPane.showInputDialog("What is your credit card number " + name + "?");
	String pin = JOptionPane.showInputDialog("What is your pin " + name + "?");
	String birthday = JOptionPane.showInputDialog("When is your birthday " + name + "?");
	JOptionPane.showMessageDialog(null, "HAHA! You were tricked " + name + ". I am actually a crazy stalker who lives under a bridge. I already bought a mansion using your credit card number, " + creditCard + " and your pin, " + pin + ". I will come kill you in your sleep at " + address + " on your birthday, " + birthday + ".");



}
}

