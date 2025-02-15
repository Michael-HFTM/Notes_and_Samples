# Linux basics

## Manual Pages
Sytemdokumentation unterteilt in sections:

1.  Executable programs or shell commands
2.  System calls (functions provided by the kernel)
3.  Library calls (functions within program libraries)
4.  Special files (usually found in /dev)
5.  File formats and conventions, e.g. /etc/passwd
6.  Games
7.  Miscellaneous
8.  System administration commands (usually only for root)
9.  Kernel routines

Anzeigen der Manual pages mit `man "cmd"`

## Operationen fuer Dateien:
Einheiltiche Operatoren fuer allese: <br>
`open()` `read()` `write()` `close()`

*Unix behandelt (fast) alles wie eine Datei:*
- *Dateien*
- *Verzeichnisse*
- *Geräte (stdin,stout,stderr,/dev/)*
- *Netzwerkverbindung*
- *Interprozesskommunikation*

## FHS (Filesystem Hierarchy Standard)
- `/` root directory
- `/bin` essential user command binaries
- `/boot` static files for the boot loader
- `/dev` device files
- `/etc` host-specific system configuration
- `/home` user home directories
- `/lib` essential shared libraries
- `/media` mount point for removable media
- `/mnt` mount point for temporarily mounted filesystems
- `/opt` add-on application software packages
- `/proc` virtual file system containing system information
- `/root` home directory for the user root
- `/sbin` system binaries
- `/srv` data for services provided by the system
- `/tmp` temporary files
- `/usr` user utilities and applications
- `/var` variable files


## Allgemeines Infos zu Linux Shell:
**-- Alles ist case sensitive! --** <br>
`~` = home directory of the current user

```
michael@server:~$ ls -aFhl /tmp/
```
- `michael`= logd in User
- `server` = servername
- `~$` = current directory
- `ls` = command
- `-afhl` & `/tmp/` = Parameters 

## File Descriptors
0. stdin (0) = stadard Input (Tastatur)
1. stdout (1) = standard Output (Terminal)
2. stderr (2) = stadrard Error

- Umleiten von stderr in Datei, Ex. `$ ls | grep somefile 2> errors`
- Umleiten von stderr in stdout, Ex. `$ ls 2>&1 | grep somefile`

## Globbing
- Kurzformen um mehrere Dateien anzugeben
- `?` steht für ein beliebiges Zeichen im Dateinamen
```
$ ls user?.txt
$ ls user??.txt
```
- `*` steht für beliebig viele Zeichen im Dateinamen
`$ ls *.txt`

## Benutzer

### Allgemeines

- Benutzer sind in Datenbanken definiert
- Lokale Benutzer definiert in `/etc/passwd`, siehe `passwd(5)`
- Andere Datenbanken möglich, z. B. LDAP, SQL oder NIS
- Primary Key ist die User ID
- UID kann 16 bit (0 – 65535) oder 32 bit sein (0 – 4294967295)
- UID 0 ist reserviert für root

**Felder eines Eintrages in /etc/passwd**
- `name` - Login Name des Benutzers, z.B. root
- `password` - Passwort des Benutzers, siehe shadow(5)
- `UID` - User ID des Benutzers
- `GID` - Primary Group ID des Benutzers
- `GECOS` - Informationen über den Benutzer (Einzieges Feld welches frei Benutzt werden kann)
- `directory` - Pfad des Home Directory des Benutzers
- `shell Pfad` - zur Shell des Bentuzers

Besipiel Einträge:
```
root:x:0:0:hroot:/root:/bin/bash
bruno:x:1000:1000:bruno:/home/bruno:/bin/bash
```
**User root**
- User root – genauer UID 0 – darf alles machen
- root auf Linux entspricht dem Administrator auf Windows
- Meist hat root kein gültiges Passwort
- Jedem Admin seinen persönlichen Account

Übung 1:
`sudo userasadd -c "Bertha Beispiel" -e 2025-03-31 -G sudo -m bertha`


## Gruppen

### Allgemeines 
- Gruppen sind in Datenbanken definiert
- Lokale Benutzer definiert in /etc/group, siehe group(5)
- Andere Datenbanken möglich, z. B. LDAP, SQL oder NIS
- Primary Key ist die Group ID
- GID kann 16 bit (0 – 65535) oder 32 bit sein (0 – 4294967295)
- GID 0 ist reserviert für root

**Felder eines Eintrages in /etc/group**
- `group_name` - Name der Gruppe
- `password` - Gruppen können Passwörter haben
- `GID Primary` - Group ID des Benutzers
- `user_list` - Namen der Benutzer in der Gruppe

## Berechtigungen 
- Jede Datei hat einen Owner
- Jede Datei hat eine Group
- Wer nicht Owner oder Mitglied von Group ist, ist World

```
-rw-r--r-- 1 bruno bruno 3771 Jan 18 15:09 .bashrc

-|re-|r--|r--| |1| |bruno| |bruno| |3771| |Jan 18 15:09| |.bashrc
```
- `-` = (File)Type
- `re-` = Userrechete
- `r--` = Group
- `r--` = World
- `1` = Hard links (Verknüpfgung auf den Inhalt)
- `bruno` = Owner
- `bruno` = Group

### Vier Bits für die Rechte:
- `r` - Read (Pos 1)
- `w` - Write (Pos 2)
- `x` - eXecute (Pos 3)
- `s` - Special (Pos3)

*Jeweils einmal definiert für Owner, Group und World <br>
Alle Dateien haben diese Rechte,* ***immer!***

### Special Bit (Advanced):
- `SUID` - Special Bit auf Stufe User = Set User ID (Pos3-User)
- `SGID` - Special Bit auf Stufe Group = Set Group ID (Pos3-Group)
- `Sticky` - Bit Special Bit auf Stufe World (Pos3-World)

### Darstellungsformen von Rechten
- Als Text - Bsp: `rwx-w-r-x`
- Als Oktalzahl - Bsp: `4725` 
<br><br>
- Pos1 (hier 4) definiert die special bits
- Pos2 (hier 7) definiert die Rechte auf Stufe Owner
- Pos3 (hier 2) definiert die Rechte auf Stufe Group
- Pos4 (hier 5) definiert die Rechte auf Stufe World

Bei Stufe Owner,Group und World hat jede Berechihgunsart einen Wert:
- Read = 1
- Write = 2
- Execute = 4
Diese könne beliebig kombiniert werden. 3 wäre somit Read & Write, 7 vergibt alle drei Rechte

Für die special Bits ist es 'ähnlich':
- Sicky = 1
- SGID = 2
- SUID = 4

Siehe auch:
[https://de.wikipedia.org/wiki/Unix-Dateirechte]

### File attributes
- Windows: `AHRS`
- Linux: `aAcCdDeFiIjmNPsStTuxV`
- Anzeigen mittels `lsattr(1)`
- Ändern mittels `chattr(1)`
- Attribut `i` – Immutable 

### Access Control Lists (ACLs)
- POSIX-1003.1e vs RFC 3010
- Selbes Prinzip wie bei Windows
- Lesen von ACLs mittels `getfacl(1)`
- Schreiben von ACLs mittels `setfacl(1)`
- Technische Beschreibung in `acl(5)`

## sudo
- `su(1)` Substitute User and Group ID
- `sudo(8)` Execute a command as another user
- Umfangreiche Konfigurationsmöglichkeiten mittels `sudoers(5)`
- `/etc/sudoers` und `/etc/sudoers.d/*`
- Beispiele:
```
pgadmin server = (pg) ALL
pgbackup server = (pg) pg_dump

user | servername = gruppe | kommandos
```
- Eintrag für volle Rechte von root: <br>
`%sudo ALL = (ALL:ALL) ALL`


### Tipps:
- Kein `visudo(8)` – kein Mitleid! (prüft auf syntaxfehler) <br>
**Nicht machen:**
- Permanent als root arbeiten
- `bruno@server:~$ sudo su -`
- Übermässiger Einsatz von `NOPASSWD:`


Kilobyte = 1024
ToDo: *Hier Hardlinks und Softlinks ergänzen*
-  Hardlinks (Verknüpfung direk auf den Inhalt (Daten werden erst gelöscht wenn alle HArdlinks auf den Inhalt weg sind.))
- Softlinks (Verknüpfung wie bei Windows)

## Terminalmultiplexer tmux(1)
tmux(1) hat zwei primäre Zwecke:
1. Ermöglicht das Arbeiten mit mehreren Fenstern
2. Programme laufen weiter selbst wenn SSH abbricht
Hoch konfigurierbar mittels ~/.tmux.conf
Eigenes Clipboard mit Copy-Paste
(Ctrl+B)