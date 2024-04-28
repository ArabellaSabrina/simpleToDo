/**
 * 
 * Erster Versuch eine Grafische Benutzeroberfläche zu kreieren.
 * Ziele: 
 * - Eingabe der ToDo's via Dialogfenster (Textfeld)
 * - Submit-Button oder Enter um Punkt hinzuzufügen
 * - Anzeige der erfassten ToDo's
 * - Abschliessen der ToDo-Liste mit Beenden-Button der das Fenster automatisch schliesst
 * 
 */
package simpleToDo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI {

	public static void main(String[] args) {
		// JFrame: Erstellt das Fenster
		JFrame frame = new JFrame("einfache To-Do Liste");
		// Fenster Grösse definieren
		frame.setSize(450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// In einem Panel können Text, Felder, Buttons, etc. hinzugefügt werden.
		JPanel topPanel = new JPanel();
	// JPanel bottomPanel = new JPanel();
		// panel zu frame hinzufügen
		frame.add(topPanel);
	// frame.add(bottomPanel);
		
		topPanel.setLayout(null);
		
		
		JLabel inputLabel = new JLabel("Gib einen To-Do-Listen Punkt ein:");
				
		inputLabel.setBounds(10, 20, 200, 25);
		topPanel.add(inputLabel);
		
		JTextField userText = new JTextField(20);
		userText.setBounds(10, 42, 200, 25);
		topPanel.add(userText);	
		
		JButton button = new JButton("Submit");
		button.setBounds(210, 41, 80, 25);
		topPanel.add(button);
		
		JLabel showList = new JLabel("Deine To-Do-Liste:");
		showList.setBounds(10, 80, 150, 25);
		topPanel.add(showList);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 110, 200, 100);
		topPanel.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(textArea);
		scrollPane.setBounds(10, 110, 200, 100);
		topPanel.add(scrollPane);
		
		JButton saveButton = new JButton("Save");
		saveButton.setBounds(210, 184, 80, 25);
		topPanel.add(saveButton);
		
		frame.setVisible(true);
	}

}
