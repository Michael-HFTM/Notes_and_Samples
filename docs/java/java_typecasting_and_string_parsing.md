# Typecasting und Parsen von Strings in Java

## Implizites Typecasting (Widening / Promotion)
- Automatische Konvertierung eines kleineren Datentyps in einen größeren.
- Kein Datenverlust, daher sicher.
- Typische Fälle:
    - `byte → short → int → long → float → double`
    - Ganzzahlen können automatisch in Gleitkommazahlen umgewandelt werden.

Beispiele:
```java
int num = 10;
double d = num; // int → double (automatisch)

long intToLong = 6;     // int → long
double intToDouble = 4; // int → double
```
**Achtung:**  
- Integer-Division führt zu unerwarteten Ergebnissen, wenn nicht mindestens ein Operand ein `double` ist:
```java
double x = 9 / 2; // x ist 4.0, nicht 4.5!
double y = 9 / 2.0; // y ist 4.5
```

## Explizites Typecasting (Narrowing)
- Manuelle Konvertierung eines größeren Datentyps in einen kleineren.
- **Kann zu Daten- oder Präzisionsverlust führen!**
- Erfordert eine explizite Angabe mittels `(Typ)`.
- Typische Fälle:
    - `double → float → long → int → short → byte`
    - Gleitkommazahlen werden abgeschnitten, wenn sie in Ganzzahlen konvertiert werden.

Beispiele:
```java
double d = 10.99;
int num = (int) d; // double → int (explizit), num = 10

long myLong = 123987654321L;
int myInt = (int) myLong; // Potenzieller Datenverlust!
```
**Achtung:**  
- Ein Casting kann dazu führen, dass Werte abgeschnitten oder umgewandelt werden.
- Beispiel:
```java
int myInt;
double myPercent = 51.9;
myInt = (int) myPercent; // myInt = 51 (Nachkommastellen werden abgeschnitten)
```

## Besonderheiten beim Typecasting
- **Überlaufprobleme:**<br>
`byte`-Wertebereich von `-128` bis `127`. Addition kann zu unerwartetem Verhalten führen.
```java
byte b = 127;
b += 1; // b wird -128 wegen Überlauf!
```
- **Casting bei Berechnungen:**<br>
Java behandelt `byte`, `short`, und `char` als `int`, wenn sie in Berechnungen verwendet werden.
```java
byte num1 = 50;
byte num2 = 50;
byte sum = (byte) (num1 + num2); // Ohne (byte) gibt es einen Fehler!
```

## Parsen von Strings in Zahlen
- **Umwandlung von Strings in numerische Datentypen.**
- Benutzung von Wrapper-Klassen (`Integer`, `Double`, etc.).
- Typische Methoden:
    - `Integer.parseInt(String)`
    - `Double.parseDouble(String)`

Beispiele:
```java
String strNum = "123";
int num = Integer.parseInt(strNum); // String → int

double d = Double.parseDouble("12.34"); // String → double
```
**Achtung:**  
- Ein ungültiger String löst eine `NumberFormatException` aus:
```java
int value = Integer.parseInt("abc"); // Fehler!
```
- Versuche, `Double.parseDouble("3.14")` als `int` zu casten, führen zu Fehlern.

## Tipps zur Fehlervermeidung
- **Benutzer-Eingaben validieren:**<br>
Überprüfen, ob der String wirklich eine Zahl enthält, bevor er geparst wird.

- **Exception-Handling nutzen:** 
```java
try {
    int num = Integer.parseInt("abc");
} catch (NumberFormatException e) {
    System.out.println("Ungültige Eingabe!");
}
```
