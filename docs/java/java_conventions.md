# Java code conventions

Bezeichner (Identifier) bezeichnen in Java Klassen, Variablen, Methoden und Konstanten.
Einfach gesagt, sind dies die Namen der genannten Elemente. 
Mit Hilfe dieser Namen kann Java die zugeordneten Speicherbereiche ansprechen und nutzen.

 
## Wichtige Vorgaben

### Erstes Zeichen
- Java-Bezeichner beginnen in der Regel mit einem Buchstaben.
- Als erstes Zeichen darf keine Zahl verwendet werden.
- $ oder _als erstes Zeichen sind technisch möglich, sollten aber nicht verwendet werden (Java Konventionen)

### Erlaubte Zeichen
- Technisch erlaubt ist der Unicode-Zeichensatz <br>
(z.B.:  a-z, A-Z, 0-9, ä, é, ب  Arabisch, β (Griechisch), Währungszeichen).

- Umlaute wie ä, ö und ü sind zwar erlaubt, sollten jedoch nicht verwendet werden, da sie beim Kopieren respektive Importieren des Programmcodes nicht konvertiert werden können und somit Probleme verursachen.

### Verbotene Zeichen

- Keine Leerzeichen
- Es dürfen keine Schlüsselwörter verwendet werden.
- Zum Beispiel byte, class, String, break, private, public, super, this, void, if, when, final, double, usw.
- Arithmetische Operatoren und Zeichen `+  -  ++  --  *  /  %  <  >`
- Java Klassen wie Scanner, System, Interface, Random usw.
- Zeichen wie ‘ « ,  ;  :  #  @ &  (  ) [  ]  {  }

Dies sind **Java Regeln** und die Nichteinhaltung führt zum Abbruch des Programms, respektive das Programm kann entweder nicht kompiliert (ausgeführt) oder nur fehlerhaft ausgeführt werden.

 
### Gross- und Kleinschreibung
Java unterscheidet Gross- und Kleinschreibung: MyProgramm ist nicht dasselbe wie myProgramm.

 
### Konventionen

Konventionen wurden eingeführt, um die Verständlichkeit und Austauschbarkeit des Programmcodes zu vereinfachen:

- Erster Buchstabe sollte ein Buchstabe sein
- Einhaltung Gross- und Kleinschreibung
- Einsatz von CamelCase
- Einsatz von Nomen, Verben je nach Element
- Aussagekräftige Bezeichner verwenden (z.B. ageOfPerson anstelle von x)
- Keine Umlaute verwenden

 
### CamelCase

Wenn ein Bezeichner aus mehreren Wörtern besteht, werden zur besseren Lesbarkeit alle Wortanfänge in Grossbuchstaben geschrieben. <br>
Hier wird unterschieden zwischen UpperCamelCase (auch bekannt als PascalCase) und dem "normalen" camelCase.

 
### Englische Bezeichner

Es empfiehlt sich grundsätzlich englische Bezeichner zu verwenden.

 
## Beispiele:

### Klasse
	
**Erster Buchstabe:**<br>
Gross (UpperCamelCase)<br>
**Beschreibung:**<br>
Klassen repräsentieren Objekte und Objekte sind Substantive <br>
**Beispiele:**
- Person.java
- SportsCar.java

### Variable
	
**Erster Buchstabe:**<br>
klein (camelCase) <br>
**Beschreibung:**<br>
Variablen repräsentieren Werte und die Bezeichner müssen eindeutig sein<br>
**Beispiele:**
- number
- firstName

### Methode
	
**Erster Buchstabe:**<br>
klein (camelCase) <br>
**Beschreibung:**<br>
Methoden repräsentieren die Tätigkeiten der Objekte und sind somit Verben.<br>
**Beispiele:**
- calculate()
- getAmount()

### Konstante
	
**Erster Buchstabe:**<br>
GROSS (alle Buchstaben) <br>
**Beschreibung:**<br>
Konstante werden erzeugt, indem man eine Variable  static final deklariert. Die Werte können nicht verändert.<br>
**Beispiele:**
- MAX_AMOUNT
- MIN_AMOUNT

### Maven Projekt artifact-id
	
**Erster Buchstabe:**<br>
klein <br>
**Beschreibung:**<br>
Die artifact-id eines Maven-Projektes entspricht dem Namen des Java-Projektes. Dieses wird grundsätzlich klein geschrieben und Wörter werden mit Binde-Strichen getrennt.<br>
**Beispiele:**
- my-java-project

### Packages
	
**Erster Buchstabe:**<br>
klein <br>
**Beschreibung:**<br>
Klassen werden in Maven-Projekten innerhalb von src/main/java erstellt. In diesem Verzeichnis werden zur besseren Übersicht der Programmstruktur packages erstellt (lower case).<br>
**Beispiele:**
- model
- view
- controller