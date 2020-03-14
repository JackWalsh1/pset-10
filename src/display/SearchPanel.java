package display;

import application.Application;
import java.awt.*;  
import java.awt.event.*;
import java.awt.EventQueue;
import javax.swing.*;
import utilities.Word;

public class SearchPanel implements ActionListener {
	
	private JPanel toolbar;
	private JList<String> scrollWords;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private JPanel searchAndSortFunctions;
	

	public JPanel createPanel(Word[] words) {
		
		toolbar = new JPanel();
		
		//Start general panel (encompasses top bar / word list)
		toolbar.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		//Start top bar (search bar, asc/desc checkboxes, add/remove buttons)
        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");
        
        addButton.addActionListener(this);
        deleteButton.addActionListener(this);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        
        //Add & Delete buttons
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 5;
        toolbar.add(addButton, gbc);
        
        gbc.gridx = 1;
        toolbar.add(deleteButton, gbc);
        
        //Search bar
        JTextField search = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        toolbar.add(search, gbc);
        
        //Asc / Desc Buttons
        JRadioButton ascButton = new JRadioButton("Asc", true);
        gbc.gridx = 0;
        gbc.gridy = 2;
        toolbar.add(ascButton, gbc);
        
        JRadioButton descButton = new JRadioButton("Desc", false);
        gbc.gridx = 1;
        gbc.gridy = 2;
        toolbar.add(descButton, gbc);
		
		//Start word list (Scroll bar / word box)
		DefaultListModel<String> wordList;
		wordList = new DefaultListModel<>();
		
		for (int i = 0; i < words.length; i++) {          
          wordList.addElement(words[i].getWord());
		}	
		
		scrollWords = new JList<>(wordList);
		scrollWords.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		scrollWords.setLayoutOrientation(JList.VERTICAL);
		scrollWords.setVisibleRowCount(-1);
		
		JScrollPane scrollPane = new JScrollPane(scrollWords);
		scrollPane.setViewportView(scrollWords);
		scrollPane.setPreferredSize(new Dimension(200, (int) Math.round(screenSize.getHeight() / 2)));
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		toolbar.add(scrollPane, gbc);
		
		return toolbar;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

	