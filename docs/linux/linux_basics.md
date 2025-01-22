# Linux basics

## Manual Pages
Sytemdokumentation unterteilt in sections:

1.  Executable programs or shell commands
2. System calls (functions provided by the kernel)
3. Library calls (functions within program libraries)
4.  Special files (usually found in /dev)
5. File formats and conventions, e.g. /etc/passwd
6. Games
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