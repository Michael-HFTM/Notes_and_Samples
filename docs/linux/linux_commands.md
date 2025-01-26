# Linux commands

## General stuff
- `whoami` shows the user logd in
- `hostname` shows the name of the hosting system
- `pwd` *(print working directory)*shows the path to the current directory
- `man "command"` shows the manual Page of this command <br> 
*[] = optional, {} = mandatory* <br>
*Arrows, Pagup/down, h=help*<br>
*press / to start search in man, jump to next with `u`* <br>
*`man 2 "command"` shows the sepcified man page of this command*
- `Crtl+D` log out
- `Ctrl+C` abbrechen

## Working tree
- `cd` *(change directroy)*
- `..` back one directory
- `cd /` cd to root directory
- `ls` lists all files in directory
- `ls -al` lists all files including 
- `find` Findet Dateien im Dateisystem


## Files & Verzeichnisse
- `more` Zeigt den Inhalt von Dateien
- `less` Zeigt den Inhalt von Dateien
- `cat` Verknuepft die Inhalte von Dateien
- `head` Zeigt die ersten Zeilen einer Datei an
- `tail` Zeigt die letzten Zeilen einer Datei an
- `grep` *(Global Regular Expression Printer)* Durchsucht den Inhalt von Dateien (Regex)
- `rm` *(Remove)* Löscht die Datei
- `rmdir` *(Remove Directory)* Löscht Verzeichnisse
- `mv` *(mv)*
- `mkdir` *(Make Directory)* Erstellt ein Verzeichnis
<br><br>
- `ln` *(Link)* Erstellt Hard- & Softlinks
- `diff` *(Differences)* Zeigt den Unterschied zwischen Dateien an 


## Umleitungen

- Ausgabe in eine Datei (überschreiben): `>` <br>
Ex. `bruno@server:~$ ls > verzeichnis.txt`
- Ausgabe in eine Datei (anhängen): `>>`<br>
Ex. `bruno@server:~$ ls >> verzeichnis.txt`
- Ausgabe auf Eingabe (Pipe) : `|`<br>
Ex. `bruno@server:~$ ls | grep novelle.txt`
- Eingabe aus einer Datei: `<`<br>
Ex. `bruno@server:~$ mail –s “Testmail” bruno.flueckiger@hftm.ch < email.txt`

## Usermanagement
- Userhinzufügen `sudo useradd [options] LOGIN` <br> *LOGIN=user login name*
ToDo: *Wichtigste Parameter ergänzen*

- User modifizieren `sudo usermod [options] LOGIN` 
- User löschen `sudo userdel [options] LOGIN` 

ToDo: *Gruppen commands ergänzen*
