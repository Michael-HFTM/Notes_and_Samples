# Arbeitsblatt sudo

## Übung 1
>sudo(1) besitzt einen Parameter, um die einem User zugeordneten Rechte anzuzeigen.
Finde den richtigen Parameter in der man page und führe sudo(1) auf deiner VM mit
diesem Paramter aus. Notiere dir die Ausgabe des Parameters.

**Lösung:**

- sudo Brechtigungen des aktiven Users anzeigen: <br>
`sudo -l`
- *Ausgabe in textfile*: <br>
`sudo -l > text.txt`
- Ausgabe:
```
Matching Defaults entries for michael on server:
    env_reset, mail_badpass, secure_path=/usr/local/sbin\:/usr/local/bin\:/usr/sbin\:/usr/bin\:/sbin\:/bin\:/snap/bin, use_pty

User michael may run the following commands on server:
    (ALL : ALL) ALL

```

## Übung 2
>Betrachte die Datei /etc/sudoers mit more(1) or less(1). Darin sind Gruppen definiert,
welche alle Kommandos als root – oder einen beliebigen anderen User – ausführen
dürfen. Welche Gruppen sind das? In welcher dieser Gruppen ist dein persönlicher
Account Mitglied?


**Lösung:**

- sudoers file oeffnen und in text.txt file ausgeben: <br>
`sudo more /etc/sudores > text.txt` <br>
Ein Teil der Augabe: <br>
``` 
# User privilege specification
root	ALL=(ALL:ALL) ALL

# Members of the admin group may gain root privileges
%admin ALL=(ALL) ALL

# Allow members of group sudo to execute any command
%sudo	ALL=(ALL:ALL) ALL
```
- Prüfen in welchen Gruppen der aktuelle User ist: <br>
`id`

- Mein user scheint nur in der Gruppo 'sudo' zu sein, er ist zwar auch in der Gruppe 'adm' aber die andere Schreibweise weist darauf hin, dass dies nicht die gleichen Gruppen sind.

## Übung 3
>Die Kommentare am Anfang der Datei /etc/sudoers geben wertvolle Hinweise wie mit
der Datei und ihren Geschwistern unter /etc/sudoers.d/ zu verfahren ist. Warum ist
es eine gute Idee, lokale sudo Policies eigene Dateien zu schreiben und diese in
/etc/sudoers.d/ zu platzieren?

**Lösung:**
- Vermutlich wird dies Datei mit einem Systemupdate auch aktualisiert, auslagern von Modifikationen vereinfacht dies und veringert auch die Warhscheinlichkeit das Syntaxfehler an der Hauptdatei gemacht werden, welche das ganze Berechtiugnssytem unbrauchbar machen würden. 

## Übung 4
>Zeige mit ls -al /etc/sudoers die Berechtigungen der Datei an. Überlege dir
welche Rechte genau auf der Datei gesetzt sind. Und warum genau diese Rechte auf der
Datei gesetzt sind.

**Lösung:**

- Berechtigungen der Datei 'sudoers' anzeigen: <br>
`ls -al /etc/sudoers` 
- Die Brechetigungen sind 'r--r-----' zudem gehört die Datei dem user root und der Gruppe root an.<br>
Ich vermute dass die Berechtigungen so restriktiv sind um unbeabsichtigt Anpassungen möglichst auszuschliessen. Da die Datei nur Read Berechtigungen auf Stufe Owner & Gruppe hat, müsste man vermutlich extra die Berechtigungen der Datei überschreiben um diese zu editieren. <br>
Wenn man sich also selber ins Bein schiessen will, muss man dies bewusst machen. xD