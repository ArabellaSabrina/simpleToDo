# simpleToDo
Eine einfache To-Do-Listen-Anwendung mit Java kreieren.

## Beschreibung
Ziel der Aufgabe ist es eine einfachte To-Do-Listen Anwendung zu kreieren mit den folgenden Anforderungen:
- Funktionen: Hinzufügen und Löschen von Aufgaben.
- Schnittstelle: Einfache Befehlszeile oder grafische Schnittstelle.
- Fehlerbehandlung: Implementierung einer grundlegenden Fehlerbehandlung.

Daraus entstaden drei Varianten von einfachen Anwendungen:
1. simpleTodo.java
2. GUI.java
3. GUIwithRemove.java

### 1. simpleTodo.java
To-Do-Liste wird mit UserInputs aus der Konsole erstellt.
Die kreierte Liste wird nach dem Beenden der Eingabe neuer UserInputs in der Konsole ausgegeben.

### 2. GUI.java
Erster Versuch eine Grafische Benutzeroberfläche zu kreieren für die Ein- und Ausgabe der To-Do-Liste.
Ziele: 
- Eingabe der To-Do's via Dialogfenster (Textfeld)
- Submit-Button um Punkt hinzuzufügen
- Anzeige der erfassten To-Do's in der TextArea
- Bearbeiten der Liste in der TextArea
- Speichern der Liste in einer ArrayList 
- Abschliessen der To-Do-Liste mit Beenden-Button (der das Fenster automatisch schliesst)

### 3. GUIwithRemove.java
Vereinfachung der Grafischen Benutzeroberfläche. 
- Eingabe neuer To-Do's via Textfeld und 'Hinzufügen'-Button
- Löschen eines To-Do's durch Auswahl der entsprechenden Task und 'Löschen'-Button

## Verwendung
Die einzelnen Varianten werden unterschiedlich bedient daher zu jeder eine kurze Verwendungsanweisung:

### 1. simpleTodo.java
1. Run Code
2. Folge dem Prompt in der Konsole und gibt einen To-Do-Listen Punkt ein
3. Bestätige mit Enter
4. Folge dem Prompt in der Konsole und gibt weitere To-Do-Listen Punkte ein
5. Um zu Beenden gib 'exit' ein und bestätige mit Enter
6. In der Konsole wird dir die Länge deiner To-Do-Liste und die Einzelnen Punkte angezeigt.

### 2. GUI.java

1. Run Code
2. Um einen neuen To-Do-Listen Punkt hinzuzufügen, muss dieser im Textfeld eigegeben werden.
3. Durch Klicken auf den Button 'Submit' wird dieser der Liste in der Textarea (unten) hinzugefügt.
4. Um weitere Punkte hinzuzufügen wieder hole die Schritte 2. und 3.
5. Um Punkte zu Bearbeiten oder zu Löschen kannst du sie in der Textarea direkt bearbeiten.
6. Wenn die Liste fertig ist, kannst du mit Klicken auf den 'Save'-Button die Liste speichern und sie wird dir in der Konsole angezeigt.
7. Um das Fenster zu schliessen, kannst du den 'Close'-Button klicken.

### 3. GUIwithRemove.java
1. Run Code
2. Um einen neuen To-Do-Listen Punkt hinzuzufügen, muss dieser im Textfeld eigegeben werden.
3. Durch Klicken auf den Button 'hinzufügen' wird dieser der Liste unten hinzugefügt.
4. Um weitere Punkte hinzuzufügen wieder hole die Schritte 2. und 3.
5. Um Punkte zu Löschen kannst du sie in der Liste unten auswählen un mit Klicken auf den 'löschen'-Button entfernen.

## Quellen und verwendete Hilfsmittel
Für die Erstellung der To-Do-Anwendungen wurden verschieden Quellen und Hilfsmittel hinzugezogen.
Diese sind hier folgend aufgelistet:

How to enlarge icons in eclipse:
https://stackoverflow.com/questions/20718093/eclipse-interface-icons-very-small-on-high-resolution-screen-in-windows-8-1

How to get UserInput:
https://stackoverflow.com/questions/5287538/how-to-get-the-user-input-in-java

ArrayLists:
https://www.w3schools.com/java/java_arraylist.asp

How to make a GUI:
https://youtu.be/5o3fMLPY7qY?si=VGLTAerlAshuFZOx

Swing Tutorial:
https://beginnersbook.com/2015/07/java-swing-tutorial/
https://www.youtube.com/watch?v=iE8tZ0hn2Ws&t=53s

multiple panel on JFrame:
https://stackoverflow.com/questions/15694107/how-to-layout-multiple-panels-on-a-jframe-java

Listendarstellung in Swing,
Commit-Kommenardarstellung,
Readme File Gestaltung/Aufbau:
https://gemini.google.com/

