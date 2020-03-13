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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;

public class MainDisplay {

	private Application app;
	private JFrame frame;
	private Word[] words;
	private SearchPanel searchPanel;
	private JPanel sidePanel;

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
	JList<String> scrollWords;
	private JPanel toolbar;
	
	private void initialize() {
		frame = new JFrame();
		searchPanel = new SearchPanel();
		sidePanel = new JPanel();
		
		frame.setLayout(new BorderLayout());
		
		toolbar = searchPanel.createPanel(words);
		
		frame.add(toolbar, BorderLayout.WEST);
		
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width/2, screenSize.height/2);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setTitle("Jack's Dictionary");
	}
}
