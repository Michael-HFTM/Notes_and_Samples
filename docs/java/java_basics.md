# Java Basics

## Basics

### Main Methode

**Ein Java-Programm startet IMMER in der Main Methode**

```
public static void main(String[] args) {
	"Codeblock"
}
```
### System.out.pritln()
`System.out.println("Ausgabetext");`

### Kommentare
`//` - Kommentiert diese Zeile aus <br>
`/* */` - Kommentiert den ganzen Block dazwischen aus 
```
/*
Codeblock Anfang
...
...
Codeblock Ende
*/
```
*VS-Code Tipp:* <br>
`CTRL+§` *Auswahl auskommentieren / Kommentar entfernen*

### Formatierung
`SHIFT-ALT-F` passt das Layout korrekt an.

## Variablen

### Variablen / Datentypen
- String `String x = "Zeichenkette";`
- Boolean `boolean x = true;`
- Integer (Ganzzahl) `int x = 1;`
- Double (Fliesskommazahl) `double x = 1.11`
- ...

### Variable Deklarieren und später zuweisen
```
boolean bool;

bool = true;
```

Es ist auch möglich mehrere Variablen gleichzeitig zu Deklarieren und diese erst später zuzuweisen:
```
double doubleVar1, doubleVar2, doubleVar3, doubleVar4;

doubleVar1 = 1.1;
doubleVar2 = 2.1;
doubleVar3 = 3.1;
doubleVar4 = 4.1;
```

### Variable Deklarieren und direkt zuweisen
`int x = 1;`
### Bereits deklariete Variable neu zuweisen
`x = 2;`
*oder für mehrere*
`x = y = 2;`

