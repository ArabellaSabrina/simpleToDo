package simpleToDo;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * Geplant ist eine To-Do Applikation, welche die einzelnen Tasks 
 * mit Buttons hinzufügt oder löscht.
 * 
 */

public class GUIwithRemove implements ActionListener{
	
	// fügt die Komponenten hinzu
			private static JFrame frame;
			private static JPanel topPanel;
			private static JPanel panel;
			private static JLabel label;
			private static JTextField textField;
			private static JButton addButton;
			private static JButton removeButton;
			private static DefaultListModel<String> listModel;
			private static JList<String> taskList;
			

	public static void main(String[] args) {
		
			
		// JFrame: Erstellt das Fenster
		frame = new JFrame("To-Do Liste");
		// Fenster Grösse definieren
		frame.setSize(450, 350);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		// Definiert das obere Panel zur Unterteilung des Fensters
		topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(400,40));
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		// Definiert das untere Panel zur Unterteilung des Fensters
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(400, 300));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		// definiert die Komponenten
		label = new JLabel("Gib einen To-Do-Listen Punkt ein:");
		textField = new JTextField(20);
		addButton = new JButton("hinzufügen");
		removeButton = new JButton("löschen"); 
		listModel = new DefaultListModel<>();
		taskList = new JList<>(listModel);
		
		// fügt den ActionListener zu den Buttons hinzu
		addButton.addActionListener(new GUIwithRemove());
		removeButton.addActionListener(new GUIwithRemove());
		
		// fügt die einzelnen Komponenten entsprechen der gewünschten Positionierung dem frame, panel oder topPanel hinzu.
		frame.add(label);
		frame.add(textField);
		topPanel.add(addButton);
		topPanel.add(removeButton);
		frame.add(topPanel);
		frame.add(panel);
		panel.add(taskList);
		
		
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addButton) {
		      String task = textField.getText();
		      if (!task.isEmpty()) {
		        listModel.addElement(task);
		        textField.setText(""); // Leert das Eingabefeld nach dem Hinzufügen der Task
		      }
		    } else if (e.getSource() == removeButton) {
		      int selectedIndex = taskList.getSelectedIndex();	// gibt der Variable den Wert des Indexes der ausgewählten Aufgabe
		      if (selectedIndex != -1) {	// Wenn die Variable selectedIndex einen anderen Wert als -1 (nichts ausgwählt) hat, wird die entsprechende Aufgabe gelöscht
		        listModel.removeElementAt(selectedIndex);
		      } else {
		        JOptionPane.showMessageDialog(null, "Wähle eine zu löschende Aufgabe aus!");
		      }
		    }
		  }

		
	

}
