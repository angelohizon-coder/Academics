import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Notepad implements ActionListener
{
	// Containers
	private JFrame f;
	private JPanel p1, p2, p3;

	// Compartments
	private JButton load, save, clear, close, sort, search, replace, wordCount;
	private JTextArea textArea;

	public Notepad()
	{
		f = new JFrame("Angelo's Notepad");

		GridBagConstraints c = new GridBagConstraints();

		textArea = new JTextArea("", 25, 50);

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();

		load = new JButton("Load");
		save = new JButton("Save");
		clear = new JButton("Clear");
		close = new JButton("Close");
		sort = new JButton("Sort");
		search = new JButton("Search");
		replace = new JButton("Replace");
		wordCount = new JButton("Word Count");

		p1.setLayout(new FlowLayout());
		p1.add(textArea);

		p2.setLayout(new GridLayout(1, 4, 0, 0));
		p2.add(load);
		p2.add(save);
		p2.add(clear);
		p2.add(close);	

		p3.setLayout(new GridLayout(1, 4, 0, 0));
		p3.add(sort);
		p3.add(search);
		p3.add(replace);
		p3.add(wordCount);

		f.getContentPane().add(p3, BorderLayout.NORTH);
		f.getContentPane().add(p1, BorderLayout.CENTER);
		f.getContentPane().add(p2, BorderLayout.SOUTH);

		f.pack();
		f.setVisible(true);

		f.addWindowListener(new MyCloseButtonHandler());

		load.addActionListener(this);
		save.addActionListener(this);
		clear.addActionListener(this);
		close.addActionListener(this);
		sort.addActionListener(this);
		search.addActionListener(this);
		replace.addActionListener(this);
		wordCount.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		Object source = ae.getSource();

		if(source == load)
		{
			try(BufferedReader br = new BufferedReader(new FileReader("noname.txt")))
			{
				textArea.read(br, null);
				br.close();
				textArea.requestFocus();
			} 

			catch(IOException e)
	        {
	            System.out.println(e.getMessage());
	        }
		}

		else if(source == save)
		{
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("noname.txt")))
			{
				String word = textArea.getText();
				bw.write(word);
				JOptionPane.showMessageDialog(null, "Your File Has Been Saved");
			}

			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}

		else if(source == clear)
		{
			textArea.setText("");
		}

		else if(source == close)
		{
			System.exit(0);
		}

		else if(source == sort)
		{

		}

		else if(source == search)
		{
			String search = JOptionPane.showInputDialog(f, "Enter Word");
			String word = textArea.getText();

			if(word.contains(search))
				JOptionPane.showMessageDialog(null, "Search Search: " + search);

			else
				JOptionPane.showMessageDialog(null, "Word Search: Word Not Found");
		}

		else if(source == replace)
		{
			String search = JOptionPane.showInputDialog(f, "Search Word");
			String replace = JOptionPane.showInputDialog(f, "Replace with Word");
			String word = textArea.getText();

			char[] searchArray = search.toCharArray();
			char[] replaceArray = replace.toCharArray();

			if(word.contains(search))
			{
				int index = word.indexOf(search);

				for(int i = 0; i < searchArray.length; i++)
				{

				}
			}

			else
				JOptionPane.showMessageDialog(null, "Word Replcement: Word Does Not Exist");
		}

		else if(source == wordCount)
		{
			String word = textArea.getText();

			boolean text = false;
			char[] characters = word.toCharArray();
			int counter = 0;
			int end = characters.length-1;

			for(int i = 0; i < characters.length; i++)
			{
				if(Character.isLetter(characters[i]) && i != end)
					text = true;

				else if(!Character.isLetter(characters[i]) && text)
				{
					counter++;
					text = false;
				}

				else if((Character.isLetter(characters[i]) || !Character.isLetter(characters[i])) && i == end && text)
				{
					counter++;
				}
			}

			JOptionPane.showMessageDialog(null, "Word Count: " + counter);
		}	
	}

	private class MyCloseButtonHandler extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}

	public static void main(String args[]) throws IOException
	{
		Notepad notepad = new Notepad();
	}
}

