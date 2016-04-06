import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;

public class Gui extends JFrame{
	private static JTextArea jta;
	private static JTextArea lines;
	private static JMenuBar menuBar;
	private static JMenu run;
	
	
	public Gui(){
		super("Line Numbering Example");
	}
 
	public static void createAndShowGUI(){
		JFrame frame = new Gui();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();
		
		run = new JMenu("Run");
		
		menuBar.add(run);
		
 
		JScrollPane jsp = new JScrollPane();
		jta = new JTextArea();
		lines = new JTextArea("1");
 
		lines.setBackground(Color.LIGHT_GRAY);
		lines.setEditable(false);
 
		jta.getDocument().addDocumentListener(new DocumentListener(){
			public String getText(){
				int caretPosition = jta.getDocument().getLength();
				Element root = jta.getDocument().getDefaultRootElement();
				String text = "1" + System.getProperty("line.separator");
				for(int i = 2; i < root.getElementIndex( caretPosition ) + 2; i++){
					text += i + System.getProperty("line.separator");
				}
				return text;
			}
			@Override
			public void changedUpdate(DocumentEvent de) {
				lines.setText(getText());
			}
 
			@Override
			public void insertUpdate(DocumentEvent de) {
				lines.setText(getText());
			}
 
			@Override
			public void removeUpdate(DocumentEvent de) {
				lines.setText(getText());
			}
 
		});
 
		jsp.getViewport().add(jta);
		jsp.setRowHeaderView(lines);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
 
		frame.add(jsp);
		frame.setJMenuBar(menuBar);
		frame.pack();
		frame.setSize(500,500);
		frame.setVisible(true);
	}
 
	
}