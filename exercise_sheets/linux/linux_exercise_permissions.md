# Arbeitsblatt Permissions
*Diese Befehle habe ich an einem anderen Directory getestet, beim Directory gugus (im shared folder) ging es nicht*

## Übung 1
>Kopiere das Script `enpermenv.sh` via Shared Folder in deine VM `(bruno@server:~$
cp Kurs/genpermenv.sh ~)`. Damit du das Script ausführen kannst musst du die
richtigen Rechte darauf mittels `chmod(1)` setzen. Danach kannst du das Script so
ausführen: `bruno@server:~$ ./genpermenv.sh`

**Lösung:**<br>

- Rechte für Owner und Gruppe setzen: <br>
`sudo chmod 0777 genprmenv.sh`
- Ausführen:<br>
`./genpermenv.sh`

## Übung 2
>Damit die Mitglieder der Gruppe gugus auch mit dem Verzeichnis gugus/ arbeiten können
muss dem Verzeichnis die Gruppe zugewiesen werden. Das gilt auch für alle
Unterverzeichnisse. In chgrp(1) ist beschrieben wie du die Gruppe rekursiv ändern
kannst.

**Lösung:**<br>

- In das Directory wechseln in dem sich das Directory 'gugus' befindet.
- Primärgruppe anpassen:<br>
`sudo chgrp -v -R gugus ./gugus` (`./` vor der Dateibezeichnung ist in diesem Fall optional)

## Übung 3
>Die Verzeichnisse des Projektes Gugus sollen dem User root gehören. So wird keines
der Teammitglieder bevorzugt behandelt. Du machst dich mit Hilfe von chown(1) an die
Arbeit.

**Lösung:**<br>

- In das Directory wechseln in dem sich das Directory 'gugus' befindet.
- Ownership anpassen:<br>
`sudo chown -v -R root ./gugus` (`./` vor der Dateibezeichnung ist in diesem Fall optional)

## Übung 4
>Zum Schluss der Einrichtung des Verzeichnisbaumes von Gugus fällt dir ein, dass du
noch die folgenden Rechte für alle Verzeichnisse des Baumes setzen musst:
rwxswx--- *(Michael: vermutlich ist hier ein Tippfehler und es sollte rwxrws--- sein)* 
In chmod(1) steht wie das geht.

**Lösung:**<br>

- In das Directory wechseln in dem sich das Directory 'gugus' befindet.
- Rechte anpassen:<br>
`sudo chown -v -R 2770 ./gugus` (`./` vor der Dateibezeichnung ist in diesem Fall optional)