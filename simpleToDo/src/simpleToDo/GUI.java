
package simpleToDo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 * Erster Versuch eine Grafische Benutzeroberfläche zu kreieren.
 * Ziele: 
 * - Eingabe der ToDo's via Dialogfenster (Textfeld)
 * - Submit-Button um Punkt hinzuzufügen
 * - Anzeige der erfassten ToDo's im Textfeld
 * - Bearbeiten der Liste im Textfeld
 * - Speichern der Liste in einer ArrayList 
 * - Abschliessen der ToDo-Liste mit Beenden-Button (der das Fenster automatisch schliesst)
 * 
 */
public class GUI implements ActionListener {	// ActionListener für Button-Action Erfassung
	
	// Komponenten hinzufügen
	private static JFrame frame;
	private static JLabel inputLabel;
	private static JLabel showList;
	private static JLabel describeList;
	private static JTextField userText;
	private static JScrollPane scrollPane;
	private static JButton button;
	private static JButton saveButton;
	private static JTextArea textArea;
	private static JButton closeButton;
	

	public static void main(String[] args) {
		
	// Komponenten Definieren
		
		// JFrame: Erstellt das Fenster
		frame = new JFrame("einfache To-Do Liste");
		// Fenster Grösse definieren
		frame.setSize(450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// In einem Panel können Text, Felder, Buttons, etc. hinzugefügt werden.
		JPanel topPanel = new JPanel();
		frame.add(topPanel);
		topPanel.setLayout(null);
		
		inputLabel = new JLabel("Gib einen To-Do-Listen Punkt ein:");
		inputLabel.setBounds(10, 20, 200, 25);
		topPanel.add(inputLabel);
		
		userText = new JTextField(20);
		userText.setBounds(10, 42, 200, 25);
		topPanel.add(userText);	
		
		button = new JButton("Submit");
		button.setBounds(210, 41, 80, 25);
		button.addActionListener(new GUI()); // ActionListener zu Button hinzugefügt
		topPanel.add(button);
		
		showList = new JLabel("Deine To-Do-Liste:");
		showList.setBounds(10, 80, 150, 25);
		topPanel.add(showList);
		
		describeList = new JLabel("Hier kannst du die Punkte noch bearbeiten...");
		describeList.setBounds(10, 100, 300, 15);
		topPanel.add(describeList);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 120, 200, 100);
		topPanel.add(textArea);
		
		scrollPane = new JScrollPane();
		scrollPane.setViewportView(textArea);
		scrollPane.setBounds(10, 120, 200, 100);
		topPanel.add(scrollPane);
		
		saveButton = new JButton("Save");
		saveButton.setBounds(210, 194, 80, 25);
		saveButton.addActionListener(new GUI()); // ActionListener zu Button hinzugefügt
		topPanel.add(saveButton);
		
		closeButton = new JButton("Close");
		closeButton.setBounds(292, 194, 80, 25);
		closeButton.addActionListener(new GUI()); // ActionListener zu Button hinzugefügt
		topPanel.add(closeButton);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
		String task = userText.getText();	// kreiert String-Variable 'task'
		
			if (task.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Bitte Aufgabe aufschreiben!");	// Fehlermeldung bei leerem TextField
			} else {
				textArea.append(task + "\n"); // Fügt Zeilenumbruch zur Eingabe hinzu
				userText.setText(""); // Leert das Eingabefeld nach dem Hinzufügen des Tasks
			}
		} else if (e.getSource() == saveButton) {
			String textAreaContent = textArea.getText(); // kreiert String-Variable 'textAreaContent'
			
			ArrayList<String> toDoArrayList	= new ArrayList<>(); // kreiert ArrayList 'toDoArrayList'
			
			String[] toDoArrayLines = textAreaContent.split("\\n"); // kreiert Array 'toDoArrayLines' mit Inhalt aus 'textAreaContent' und fügt Zeilenumrüche hinzu
			
			for (String line : toDoArrayLines) {	// fügt Inhalt aus 'toDoArrayLines' zur ArrayList hinzu
				toDoArrayList.add(line);
			}
				System.out.println("Deine To-Do Liste: ");
				System.out.println(toDoArrayList);	// zeigt die ganze To-do-Liste in der Konsole an.
		} else if (e.getSource() == closeButton) {
			frame.dispose();	// schliesst das Fenster
		}
		
	}
	

}