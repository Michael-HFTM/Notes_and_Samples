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
- `ls -al` lists all files including hidden files
- `find` Findet Dateien im Dateisystem
- `cp` Kopiert Datein oder Verzeichnisse


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
**WICHTIG!**
- Ausgabe in eine Datei (überschreiben): `>` <br>
Ex. `bruno@server:~$ ls > verzeichnis.txt`
- Ausgabe in eine Datei (anhängen): `>>`<br>
Ex. `bruno@server:~$ ls >> verzeichnis.txt`
- Ausgabe auf Eingabe (Pipe) : `|`<br>
Ex. `bruno@server:~$ ls | grep novelle.txt`
- Eingabe aus einer Datei: `<`<br>
Ex. `bruno@server:~$ mail –s “Testmail” bruno.flueckiger@hftm.ch < email.txt`

## Usermanagement
*LOGIN=user login name*
- Userhinzufügen - `sudo useradd [options] LOGIN` - [Man-Page](https://man7.org/linux/man-pages/man8/useradd.8.html)
- User modifizieren - `sudo usermod [options] LOGIN` - [Man-Page](https://man7.org/linux/man-pages/man8/usermod.8.html)
- User löschen - `sudo userdel [options] LOGIN` - [Man-Page](https://man7.org/linux/man-pages/man8/userdel.8.html)
- Passwort / Passwortpoliecies anpassen - `sudo passwd [options] [LOGIN]` - [Man-Page](https://man7.org/linux/man-pages/man1/passwd.1.html)
- Passwortpolicies anpssen/prüfen - `sudo chage [option] LOGIN` - [Man-Page](https://man7.org/linux/man-pages/man1/chage.1.html)
- 'Finger' Info anpassen - `chfn [options] LOGIN` - [Man-Page](https://man7.org/linux/man-pages/man1/chfn.1.html)
- Gruppen des Users anzeigen - ` groups [OPTION]... [USERNAME]...` - [Man-Page](https://man7.org/linux/man-pages/man1/groups.1.html)
- GruppenIDs des Users anzeigen - `id [OPTION]... [USER]...` - [Man-Page](https://man7.org/linux/man-pages/man1/id.1.html)

## Groupmanagement 
- Gruppe hinzufügen - `groupadd [OPTIONS] NEWGROUP` - [Man-Page](https://man7.org/linux/man-pages/man8/groupadd.8.html)
- Gruppe modifizieren - `groupmod [options] GROUP` - [Man-Page](https://man7.org/linux/man-pages/man8/groupmod.8.html)
- Gruppe modifizieren - `groupdel [options] GROUP` - [Man-Page](https://man7.org/linux/man-pages/man8/groupdel.8.html)

## Berechtigungen
- Berechtigunen des akitven users anzeigen: `sudo -l`
- Modes/Owner/Gruppe anzeigen - `ls -al [FILE_NAME]`
- Filemode anpassen - `chmod [OPTION]... OCTAL-MODE FILE...` - [Man-Page](https://www.man7.org/linux/man-pages/man1/chmod.1.html)
- Primärgruppe eines Files anpassen - `chgrp [OPTION]... GROUP FILE...` - [Man-Page](https://man7.org/linux/man-pages/man1/chgrp.1.html)
- Owner eines Files anpassen - `chown [OPTION]... [OWNER][:[GROUP]] FILE...` - [Man-Page](https://man7.org/linux/man-pages/man1/chown.1.html)