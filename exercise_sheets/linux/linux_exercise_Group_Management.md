# Arbeitsblatt Group Management

>Alle Kommandos in den Übungen erfordern die Rechte von root mittels sudo.

## Übung 1
>Ein neues Projekt steht an: Gugus. Du hast den Auftrag, auf dem Server eine Gruppe für
die Projektmitarbeiter anzulegen. Die Gruppe soll gugus heissen und eine GID von 1984
haben. Du schaust sicherheitshalber in groupadd(8) nach.

**Lösung:**

- Neue Gruppe mit spezifischer GID erstelen: <br>
`sudo groupadd -g 1984 gugus`
- Ergebniss prüfen <br>
`less /etc/group`

## Übung 2
>Dein Junior Admin hat sich in der Liste der GIDs vertan und dir die falsche GID für die
neue Gruppe gugus mitgeteilt. Die richtige GID lautet 2001. Noch während du dir eine
angemessene Strafe für diese Inkompetenz überlegst schaust du in groupmod(8) nach
was jetzt zu tun ist.

**Lösung:**

- GID einer Gruppe anpassen: <br>
`sudo groupmod -g 2001 gugus`
- Ergebniss prüfen <br>
`less /etc/group`

## Übung 3
>Das Projekt Gugus ist abgeschlossen und alle Dateien sind auf dem Fileserver archiviert
worden. Das erlaubt es dir, auch die Gruppe gugus für das Projekt nun von deinem
System zu löschen. Wie du das machst steht in groupdel(8).

**Lösung:**

- Gruppe löschen: <br>
`sudo groupdel gugus`

## Übung 4
>Für die monatliche Überprüfung der Rechte musst du deinem Chef melden, in welchen
Gruppen sich dein persönlicher User Account befindet. Du weisst, dass du dafür sowohl
groups(1) als auch id(1) verwenden kannst. Welches der beiden Tools bevorzugst du?

**Lösung:**

- Befehl `groups`: <br>
`groups michael`
- Befehl `id`: <br>
`id michael`

**Es kommt darauf an welche Informationen man genau beötigt.** Wenn nur die Gruppennamen benötigt werden, ist `groups`wohl der einfahcer Weg, da es auch nur diese ausgbit. `id` gibt auch noch weitere Informationen aus, UID, Primary GID und die GID zu allen Gruppen. <br>
In den meisten Fällen würde ich wochl `id` bevorzugen, da ich dort mehr Inforamtionen abrufen kann.