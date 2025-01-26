# Arbeitsblatt User Management

Alle Kommandos in den Übungen erfordern die Rechte von root mittels sudo.

## Übung 1
>In useradd(8) ist beschrieben mit welchen Parametern du das Kommando ausführen
musst, um einen neuen Benutzer auf deiner VM anzulegen.<br>
Der Benutzer soll über die folgenden Attribute verfügen:
>- Login: bertha
>- Full name: Bertha Beispiel
>- Expire date: 31. März 2025
>- Additional groups: sudo
>- Create home: yes

**Lösung:**

- User hinzufügen: <br>
`sudo useradd -c "Bertha Beispiel" -e 2025-03-31 -g sudo -m bertha`

## Übung 2
>Für dieses Arbeitsblatt gilt die folgende Passwort Policy:
>- Mindestalter: 1 Tag
>- Maximalalter: 90 Tage
>- Warnung: 14 Tage
>
>Mit Hilfe von passwd(1) setzt du nun – unter Beachtung der Policy – folgendes Passwort
für die neue Benutzerin bertha:<br>
>bertha

**Lösung:**

- Passwort policies des users bearbeiten: <br>
`sudo passwd -n 1 -x 90 -w 14 bertha`
- Passwort des users setzen: <br>
`sudo passwd bertha`
- Änderungen prüfen: <br>
`sudo chage -l bertha`


## Übung 3
>Nach ihrem ersten Login sieht sich Bertha ihren Eintrag in /etc/passwd an und stellt
entsetzt fest, dass ihr zweiter Vorname Barbara fehlt. Da Bertha nicht weiss, wie sie den
Eintrag selbst ändern kann kommt sie zu dir. Du zeigst ihr, wie du mit chfn(1) ihren
Namen korrigierst.

**Lösung:**

- Fullname eines Users editieren (als Admin): <br>
`sudo chfn -f "Bertha Barbara Beispiel" bertha`
- Änderungen prüfen: <br>
`more /etc/passwd`

## Übung 4
>Nach Berthas Austritt am 31.03. willst du am 1. April auf Nummer sicher gehen und ihren
User Account bertha sowohl sperren als auch aus der Gruppe sudo entfernen. Man weiss
ja nie, wem sie ihr Passwort weitergegeben hat. Mit Hilfe von usermod(8) gelingt es dir,
beide Fliegen mit einer Klappe zu schlagen.

**Lösung:**
- User Sperren und aus Gruppe sudo entfernen: <br>
`sudo usermod -G sudo -r -L -e 1 bertha`
- Prüfen ob Passwort gesperrt wurde:<br>
`sudo less /etc/shadow` <br>*(Listest die PW Informationen aller User auf, bei gelockten Passwärtern shtet vor dem verschlüsselten Passwort ein `!`)*
- Gruppe prüfen: <br>
`less /etc/group`
