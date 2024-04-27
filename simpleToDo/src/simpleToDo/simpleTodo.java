package simpleToDo;

import java.util.Scanner;

public class simpleTodo {
	
	// Einfache Abfrage eines User Inputs zum kreieren einer neuen Aufgabe

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Gib einen To-Do-Listen Punkt ein: ");
		
		String newTask = reader.next(); // Test mit der Aufgabe: 'Hausaufgaben'
		reader.close();
		
		System.out.println("...du hast die Aufgabe " + newTask + " zur To-Do-Liste hinzugefügt.");

	}

}
