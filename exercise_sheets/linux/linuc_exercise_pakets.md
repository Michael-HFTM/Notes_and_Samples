# Arbeitsblatt Pakete
## Übung 1
>Mit Hilfe von apt(8) kannst du überprüfen ob neue Updates für dein System verfügbar sind. Falls das System dir mitteilt, dass Pakete aktualisiert werden können, lass dir gleich die Liste der Pakete anzeigen.

**Lösung:**<br>
- Upgradable Packages anzeigen:<br>
`apt list --upgradable`

## Übung 2
>Updates können auch mal schiefgehen. Daher empfehle ich dir, vor der Installation der Updates zuerst einen Snapshot der VM zu erstellen. So kannst du im Fehlerfall wieder einen funktionieren Zustand herstellen. Um sicher zu gehen, solltest du die VM vorher herunterfahren.

## Übung 3
>Installiere die verfügbaren Updates mit Hilfe von apt(8). Reboote die VM nach der Installation aller Updates.

**Lösung:**<br>
- Aktuelle Versionen der installierten packages: <br>
`sudo apt update`
- Auf aktuelle Version upgraden: <br>
`sudo apt upgrade`

## Übung 4
>Nun da deine VM mit aktuellen Patches versorgt ist wird es Zeit, ein paar zusätzliche
Softwarepakte zu installieren:
>- apache2
>- mariadb-server
>- php
>- nginx

**Lösung:**<br>
- Packages installieren:
```
sudo apt install apache2
sudo apt install mariadb-sever
sudo apt install php
sudo apt install nginx
```

## Übung 5
> In der obigen Liste befindet sich eine «Dublette»: nginx. Da wir nur ein Webserver-Paket benötigen nutzt du apt(8) um nginx, seine Konfigurationsdateien und alle von diesem Paket installierten Abhängigkeiten wieder zu deinstallieren.

**Lösung:**<br>
- Packages deinstallieren:
```
sudo apt purge nginx
```