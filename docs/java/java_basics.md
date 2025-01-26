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
`SHIFT-ALT-F` passt das Layout korrekt an.

## Variablen

### Variablen / Datentypen
**Die wichtigsten Datentypen:**
- String `String x = "Zeichenkette";`
- Boolean `boolean x = true;`
- Integer (Ganzzahl) `int x = 1;`
- Double (Fliesskommazahl) `double x = 1.11`

### Bits und Bytes
- Binätcode besteht aus 1 & 0 ein Beispiel wäre `10011101`
- Eine Stelle dieses Coides wird Bit genannt
- Ein Bit kann immer zwei Werte halten 0 / 1, durch die Kombintaion von mehreren Bits können 2<sup>n</sup> Werte gespeichert werden. 
- 8 Bits = 1 Byte = 256 mögliche Werte
- In Java können in einem Byte Werte von -128 bis 127 gespeichert werden.

**Primitve Ganzzahltypen**
- byte ( 8 Bit | 2<sup>8</sup> | -128 bis 127) `byte x = 127;`
- short ( 16 Bit | 2<sup>16</sup> | -32'768 bis 32'767) `short x = 1234;`
- int ( 32 Bit | 2<sup>32</sup> | -2'147'483'648 bis 2'147'483'647) `int x = 123456;`
- long ( 64 Bit | 2<sup>64</sup> ) `long x = 1234567891011;`

**Primitive Fliesskommazahltypen""
- float ( 32 Bit ) `float x = 3.141592F;` (float wird quasi nie verwendet, da dieser zu ungenau ist)
- double ( 64 Bit ) `double x = 3.141592;`



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

## Operatoren
**Standardoperatoren:**
- `+` Addition `x = 2 + 3;`
- `-` Subtraktion `x = 5 - 3;`
- `*` Multiplikation `x = 2 * 5;`
- `/` Division `x = 10 / 2`; (Bei der Ganzzahldivision werden die Stellen nach dem Komma abgeschnitten)
- `%` Modulo `x = 31 % 6;`

**Increment und Decrement-Operatoren:**
- `++` erhöht den Wert der Vaiable um 1. `x++;` 
- `--` reduziert den Wert der Vaiable um 1. `x--;` 

*Bei diesen Operatoren wird zudem zwischen Prä- und Post-Increment unterschieden:*<br>
```
// Prä-Increment Bsp:

int id = 6;
int newId = ++id;
// id ist 7, newId ist 7


// Post-Increment Bsp:

int id = 6
int newId = id++;
// id ist 7, newId ist 6
```

**Zuweisung:**
- `=` weist einer Variable einen neuen Wert zu. `x = 20;`
- `+=` ehöht die Variable um den rechten Wert. `x += 2;` 
- `-=` reduziert die Variable um den rechten Wert. `x -= 2;` 
- `*=` multipliziert die Variable mit dem rechten Wert. `x *= 2;` 
- `/=` dividiert die Variable mit dem rechten Wert. `x /= 2;` 
- `%=` Den ganzzahligen Rest einer Divison ermitteln und zuweisen `x %= 3;` 

## Schlüsselworte
- `final` - Deklariert eine Variable um den Wert unveränderbar zu machen (immutable)<br>
*Namesnkonventionenen für finale Variabelen:*<br>
*Nur Grossbuchstaben & Woerte werden mit* `_` *getrennt. Bsp:* `GESCHWINDIGKEIT_DES_LICHTS`
