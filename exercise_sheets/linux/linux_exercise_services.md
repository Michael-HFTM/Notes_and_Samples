# Arbeitsblatt Dienste

## Übung 1
>Überprüfe, ob alle Dienste der in der vorherigen Übung installierten Softwarepakete auch
tatsächlich laufen mittels systemctl(1). Es handelt sich um die folgenden Dienste:
>- apache2
>- mariadb

**Lösung:**<br>
- `sudo systemctl list-units --type service`
**Musterlösung:**<br>
`for servise in apache2 mariadb ; do systemctl status $service ; done`

## Übung 2
>Richte eine Portweiterleitung auf deiner VM ein, welche den Port 80/tcp der VM vom Port 8080/tcp deines Notebooks aus erreichbar macht. Rufe mit deinem Browser anschliessend die folgende URL auf: http://localhost:8080/ Die Seite Apache2 Default Page erscheint. Nun stoppe mittels systemctl(1) den Dienst apache2 und aktualisiere anschliessend die Seite im Browser. Mache diese Änderung
wieder rückgängig und überprüfe das Resultat.


**Lösung:**<br>
- Portforwarding in VM-Settings: <br>
Protocol:TCP, Hostport:8080, GuestPort:80

## Übung 3
>Ausser Apache willst du noch Nginx ausprobieren. Da beide Softwarepakete den Port 80/tcp benutzen deaktivierst du als erstes den Dienst apache2 mittels systemctl(1) und bootest deine VM neu. Danach überprüfst du, ob der Dienst apache2 auch tatsächlich nicht gestartet wurde. Ist dies der Fall kannst du das Paket nginx mittels apt(8) installieren. Öffne danach erneut die URL http://localhost:8080/ in deinem Browser. Was siehst du?

**Lösung:**<br>
- Folgener Ablauf: <br>
```
sudo systemctl disable apache2
sudo systemctl stop apache 2
sudo reboot
sudo systemctl list-units --type service
sudo apt install nginx
```

## Übung 4
>Das Resultat der Übung 3 ist durch die Dateien im Verzeichnis /var/www/html begründet. Überlege dir einen möglichen Weg, wie du die korrekte Datei in deinem Browser angezeigt bekommst. Keine der beiden bestehenden Dateien darf dabei gelöscht werden.

```
sudo mv index.html index.apache-debian.html
sudo ln -s index.nginx-debian.html index.html
ls -aFhl
```

## Übung 5
>Nach ausgiebigen Tests hast du dich für Apache und gegen Nginx als Webserver entschieden. Da Nginx auch als Proxy funktionieren kann, behältst du das Paket auf der VM. Stelle aber mittels systemctl(1) sicher, dass nach dem nächsten Reboot der VM Apache aktiv wird, Nginx jedoch nicht. Deaktiviere Nginx und aktiviere Apache OHNE Reboot der VM.

```
sudo systemctl disable nginx
sudo systemctl stop nginx
sudo systemctl enable apache2
sudo systemctl start apache 2
```