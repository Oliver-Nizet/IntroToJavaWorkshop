import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	String school =JOptionPane.showInputDialog("Hello there, " + name + ". Do you like school?");
	
}
}
