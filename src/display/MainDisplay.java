package display;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

import application.Application;
import utilities.Word;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;

public class MainDisplay {

	private Application app;
	private JFrame frame;
	private Word[] words;
	private SearchPanel searchPanel;
	private JPanel toolbar;
	private InformationWindow informationWindow;
	private JPanel wordDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDisplay window = new MainDisplay();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainDisplay() {
		app = new Application();
		words = app.getWords();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	
	private void initialize() {
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		searchPanel = new SearchPanel();
		informationWindow = new InformationWindow();
		
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.print(screenSize);
        
        frame.setSize(screenSize.width/2, screenSize.height/2);
		frame.setTitle("Jack's Dictionary");
		
		toolbar = searchPanel.createPanel(words);	
		frame.add(toolbar, BorderLayout.WEST);
		
		wordDisplay = informationWindow.createPanel();
		frame.add(wordDisplay, BorderLayout.CENTER);
		
		frame.pack();
	}
}
