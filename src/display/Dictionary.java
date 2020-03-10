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
	private JList<String> scrollWords;
	
	public Dictionary() {
		app = new Application();
		words = app.getWords();
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		//Toolbar toolbar = new Toolbar(words);
		
		DefaultListModel<String> wordList;
		wordList = new DefaultListModel<>();
		
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width/2, screenSize.height/2);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setLayout(new BorderLayout());
		frame.setTitle("Jack's Dictionary");
		
		for (int i = 0; i < words.length; i++) {          
          wordList.addElement(words[i].getWord());
		}	
		
		//frame.add(toolbar, BorderLayout.WEST);
		
		scrollWords = new JList<>(wordList);
		scrollWords.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		scrollWords.setLayoutOrientation(JList.VERTICAL);
		scrollWords.setVisibleRowCount(-1);
		
		JScrollPane scrollPane = new JScrollPane(scrollWords);
		scrollPane.setViewportView(scrollWords);
		scrollPane.setPreferredSize(new Dimension(200, screenSize.height / 2));
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//adds scrollWords + scrollPane
		frame.add(scrollPane, BorderLayout.WEST);

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dictionary window = new Dictionary();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}  