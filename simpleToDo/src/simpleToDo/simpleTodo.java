package simpleToDo;

	// Imports aufgrund des verwedeten Codes

import java.util.ArrayList;
import java.util.Scanner;

public class simpleTodo {
	
	// Einfache Abfrage eines User Inputs zum kreieren einer neuen Aufgabe

	public static void main(String[] args) {
		/** 
		*
		*
		Scanner reader = new Scanner(System.in);
		System.out.println("Gib einen To-Do-Listen Punkt ein: ");
		
		String newTask = reader.next(); // Test mit der Aufgabe: 'Hausaufgaben'
		reader.close();
		
		System.out.println("...du hast die Aufgabe " + newTask + " zur To-Do-Liste hinzugefügt.");
		*
		*
		*/
		
		
	// Mehrere Aufgaben in einer Liste sammeln und Aufrufen (Konsole) mit ArrayList
		
		ArrayList<String> TodoArrayList	= new ArrayList<>();	//Import ArrayList
		
		Scanner reader = new Scanner(System.in);	//Um User Input in Konsole erhalten
		
		
		/**
		 *  While-Schlaufe um mehrere Inputs nacheinander zu ermöglichen 
		 *  und Abbruchbedingung für Eingabe festzulegen mit if-Statement
		 */
		
		while(true) {
			System.out.println("Gib einen To-Do-Listen Punkt ein (oder 'exit' um zu beenden): ");	// User Inputs erhalten
			String newTask = reader.nextLine();	// *1 .next() mit .nextLine() ersetzt
			
			if (newTask.equals("exit")) {
				break;
			}
			
			TodoArrayList.add(newTask);
			System.out.println("...du hast die Aufgabe " + newTask + " zur To-Do-Liste hinzugefügt.");
		}
					
		System.out.println("Die To-Do Liste enthält " + TodoArrayList.size() + " Aufgaben");	// Wie lange ist die ToDo-Liste
		System.out.println("Deine To-Do Liste: ");
		System.out.println(TodoArrayList); 	// *1 Abbruch Bedingung für Eingabe muss angepasst werden, dass nicht das Leerzeichen als Ende des Strings erkannt wird, sondern Zeilenumbruch (Enter).
		
		reader.close();		// reader erst zum Schluss(nach While-Schlaufe) schliessen, um Eingabe weiter zu ermöglichen
		
		
	}

}
