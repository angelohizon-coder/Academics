import javax.swing.*;
import java.awt.EventQueue;
public class SetGet{
	public static void main(String[] args) {
		String variables = "";
		String methods = "";
		String variablename = "";
		String methodname = "";
		String type = "";
		String classname = JOptionPane.showInputDialog(null, 
				"Enter the class name:");
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of variables: "));

		for(int x = 1; x < number + 1; x++){
			variablename = JOptionPane.showInputDialog(null, 
				"Enter the variable name for #" + x + ":\nsyntaxgoeslikethis");
			methodname = JOptionPane.showInputDialog(null, 
				"Enter the method name for #" + x + ":\nSyntaxGoesLikeThis");
			type = JOptionPane.showInputDialog(null, 
				"Enter type for variable #" + x + ":\nbyte, short, int, long, float, double, String");
			variables += "\tprivate " + type + " " + variablename + ";\n";
			methods += "\n\tpublic void set" + methodname + "(" + type + " " 
				+ variablename + "){\n\t\tthis." + variablename + " = " 
				+ variablename + ";\n\t}\n\n\tpublic " + type + " get" 
				+ methodname + "(){\n\t\treturn " + variablename + ";\n\t}\n";
		}

		String MESSAGE = "public class " + classname + "{\n" 
		+ variables + methods + "\n}";

		EventQueue.invokeLater(new Runnable(){
		public void run(){
			try{UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			}catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {}

			JTextArea ta = new JTextArea(10, 10);
			ta.setText(MESSAGE);
			ta.setWrapStyleWord(true);
			ta.setLineWrap(false);
			ta.setCaretPosition(0);
			ta.setEditable(false);

			JOptionPane.showMessageDialog(null, new JScrollPane(ta), "Output", JOptionPane.PLAIN_MESSAGE);
			}
		});
	}
}