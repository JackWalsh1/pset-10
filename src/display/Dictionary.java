package display;

import application.Application;
import java.awt.*;  
import java.awt.event.*;
import java.awt.EventQueue;
import javax.swing.*;
import utilities.Word;

@SuppressWarnings("serial")
public class Dictionary extends Frame implements ActionListener {
	
	private Application app;
	private JFrame frame;
	private Word[] words;
	private SearchPanel searchPanel;
	private JPanel sidePanel;
	
	public Dictionary() {
		app = new Application();
		words = app.getWords();
		initialize();
		//createPanel(words);
	}
	
	public void initialize() {
		frame = new JFrame();
		searchPanel = new SearchPanel();
		sidePanel = new JPanel();
		
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width/2, screenSize.height/2);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setLayout(new BorderLayout());
		frame.setTitle("Jack's Dictionary");
		
		sidePanel = searchPanel.createPanel(words);
		
		frame.add(sidePanel, BorderLayout.WEST);

	}

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Dictionary window = new Dictionary();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}  