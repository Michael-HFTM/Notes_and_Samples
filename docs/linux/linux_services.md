## Dienste

## Dienste – Prozesse im Hintergrund
- Traditionell werden Dienste [Daemons](https://de.wikipedia.org/wiki/Daemon) genannt
- Daemons laufen im Hintergrund
- Init-System verwaltet Daemons
- Weiteste Verbreitung: [systemd(1)](https://www.man7.org/linux/man-pages/man1/systemd.1.html)
- Beispiele für Daemons:
    - httpd Webserver
    - ntpd Zeitserver
    - rsyslog Logserver
    - sshd SSH Server <br><br>

![Der Bootprozess](/docs/linux/media/boot_process.png)   

## Von Prozessen und Runlevels
- Jeder Prozess hat eine ID, die PID
- Zwei davon sind fix vergeben:
    - PID 0 Der Kernel
    - PID 1 [init(1)](https://man7.org/linux/man-pages/man1/init.1.html)
- Runlevels bestimmen, welche Dienste gestartet werden ([runlevel(8)](https://www.man7.org/linux/man-pages/man8/runlevel.8.html))<br><br>
![Runlevels](/docs/linux/media/service_runlevels.png)

## Alles neu macht systemd
- Aus Runlevels werden Targets
- Aus Daemons werden Services
- Aus init Scripts werden Unit Files
- Kontrolle von Diensten mittels [systemctl(1)](https://www.man7.org/linux/man-pages/man1/systemctl.1.html)
- Logs von Diensten mittels [journalctl(1)](https://man7.org/linux/man-pages/man1/journalctl.1.html)

## Spass mit Diensten
- `systemctl status` Zustand eines Dienstes anzeigen
- `systemctl reload` Dienst soll seine Konfiguration neu einlesen
- `systemctl restart` Dienst wird gestoppt und neu gestartet
- `systemctl stop` Dienst wird gestoppt
- `systemctl start` Dienst wird gestartet
- `systemctl disable` Dienst wird nicht automatisch gestartet
- `systemctl enable` Dienst wird automatisch gestartet

## Fehlersuche
- Probleme beim Booten mittels [dmesg(1)](https://man7.org/linux/man-pages/man1/dmesg.1.html)
- Die Logfiles in /var/log
- Untersuchung mittels:
    - [head(1)](https://man7.org/linux/man-pages/man1/head.1.html) / [tail(1)](https://man7.org/linux/man-pages/man1/tail.1.html)
    - [more(1)](https://man7.org/linux/man-pages/man1/more.1.html) / [less(1)](https://man7.org/linux/man-pages/man1/less.1.html)
    - [grep(1)](https://man7.org/linux/man-pages/man1/grep.1.html)
- Journal von systemd mittels [journalctl(1)](https://man7.org/linux/man-pages/man1/head.1.html)