# Installation von Software

## Installation von Software – der althergebrachte Weg
1. Quelltext der Software herunterladen <br>
`bruno@server:~$ curl -o software.tar.gz https://web.server.net/download/software.tar.gz`
2. Quelltext der Software entpacken <br>
`bruno@server:~$ tar xzf software.tar.gz`
3. Quelltext kompilieren & installieren
```
bruno@server:software$ ./configure
bruno@server:software$ make
bruno@server:software$ sudo make install
```


> A **Makefile** in Linux is a script used by the **make** build automation tool to compile and build programs. It defines a set of rules and dependencies that specify how to generate executable files from source code.



### Das Rad nicht jedesmal neu erfinden -> Shared Libraries
- Quelltext lässt sich nur übersetzen wenn Libraries vorliegen
- Software A benötigt Version x.y von Library E
- Software B benötigt Version x.z von Library E

## Package Manager – Moderne Softwareverwaltung
- Vorkompilierte Software als Paket
- Paket beinhaltet Informationen wie Version und Abhängigkeiten
- Abhängigkeiten werden automatisch installiert
- Versionskonflikte können umschifft werden
- Package Manager (zentral) anstelle von setup.exe (individuell)

### Paketformate
- RPM (RPM Package Manager) *(ehemals Redhat Package Manager)*
    - Red Hat
    - SUSE
- DEB (Debian Package)
    - Debian
    - Ubuntu
- TGZ (Tarball)
    - Slackware
    - *BSD

In der Regel werden die verschiedenen Packete auf einem zentralen Repository-Server abgeelegt und zum download verfügbar gemacht.

### Wildwuchs bei den Tools
- RPM-basierte Distributionen:
    - yum
    - dnf
    - yast
- DEB-basierte Distributionen:
    - apt
    - apt-get
    - aptitude
- TGZ-basierte Systeme:
    - Jede Distribution / jedes OS eigene Tools

### Ähnliche und alternative Ansätze
- Python mit [pip](https://pip.pypa.io/en/stable/index.html) – Package Installer for Python
- Node.js mit [npm](https://docs.npmjs.com/) – Node Package Manager
- App Stores von Google, Apple, Microsoft, etc.
- Portable Apps, Zero Install
- App-Virtualisierung, Container

### Patchen von Systemen
- Paketmanager sind zentral für das Patchen von Systemen
- Update bezeichnet das Aktualisieren eines aktuellen Releases
- Upgrade bezeichnet das Aktualisieren auf ein neues Release
- Debian / Ubuntu halten sich nicht daran: Alle Updates sind Upgrades

