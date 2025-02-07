# Filesystems
- Warum partitionieren wir eine Harddisk?
- Welche Programme zur Partitionierung kennt ihr?
- Partitionsschemas:
    - [MBR](https://de.wikipedia.org/wiki/Master_Boot_Record)
    - [GPT](https://de.wikipedia.org/wiki/GUID_Partition_Table)
    - [LVM](https://de.wikipedia.org/wiki/Logical_Volume_Manager)

## Partitionierung
- Schemata:
    - Eine grosse Partition für alles
    - Viele kleinere für spezifische Teile des Trees
- Abhängig vom Anwendungsfall
- Trennung von Daten und Programmen
- Einfacheres Handling einzelner Partitionen
- Kein One Size Fits All – macht euch Gedanken!

### Gängige Partitionierung 
/ - Root Partition
/boot - Boot Loader
swap - Swap Space
/home - Benutzerdaten
/opt - Drittprogramme
/tmp - Temporäre Dateien
/usr - Unix System Resources
/var - Verschiedenste Daten
/var/log - Logdateien
/var/tmp - Temporäre Dateien

## Logical Volume Manager LVM
- [lvm(8)](https://www.man7.org/linux/man-pages/man8/lvm.8.html) abstrahiert Partitionen von Disks
    - Dynamische Vergrösserung von Partitionen möglich
    - Diverse RAID Level möglich
- Physical Disks werden in Volume Groups zusammen gefasst
- Volume Groups beinhalten Logical Volumes

**Kommandos:**<br>
- [pvs(8)](https://www.man7.org/linux/man-pages/man8/pvs.8.html) zeigt physische Volumes an
- [vgs(8)](https://www.man7.org/linux/man-pages/man8/vgs.8.html) zeigt Volume Groups an
- [lvs(8)](https://www.man7.org/linux/man-pages/man8/lvs.8.html) zeigt Logical Volumes an

## Lokale Dateisysteme
- `ext4` - extended filesystem 4
- `XFS` - Standard FS in RHEL
- `Btrfs` - “ewiger” Nachfolger von ext4 & XFS
- `ZFS` - Filesystem & Volume Manager, für Storage Systeme
- `UFS / FFS` - Unix File System / Berkley Fast File System (*BSD)
- `FAT` - File Allocation Table (DOS/Windows)
- `NTFS` - New Technology File System (Windows NT)

## Netzwerkdateisysteme
- `NFS` - Network File System
- `CIFS / SMB` - Common Internet File System / Server Message Block
- `GFS` - Gluster File System (Cluster)
- `OCFS` - Oracle Cluster File System

## Exkurs Swapping
- Paging: Unterteilung von RAM in einzelne Pages
- Swapping: Auslagern von RAM Pages auf die Harddisk
- Swapping kann auf Partition oder Datei erfolgen
- Mehrere Swap Targets möglich
- Priorisierung steuert Reihenfolge
- Kommandos: [swapon(1)](https://www.man7.org/linux/man-pages/man8/swapon.8.html) / [swapoff (1)](https://www.man7.org/linux/man-pages/man8/swapon.8.html) / [mkswap(8)](https://www.man7.org/linux/man-pages/man8/mkswap.8.html)

## Formatieren, Ein- & Aushängen
- Partitionen/Volumes werden formatiert mittels [mkfs(8)](https://man7.org/linux/man-pages/man8/mkfs.8.html)
- Filesystems können an beliebiger Stelle gemountet werden mit [mount(8)](https://man7.org/linux/man-pages/man8/mount.8.html)
- Mount Options beeinflussen Verhalten des Filesystems
- Gemountete Filesystems verdecken Verzeichnis vollständig
- Aushängen mit [umount(8)](https://man7.org/linux/man-pages/man8/umount.8.html) ist nicht gleich auswerfen!

### Permanente Mounts
- Permanente Mounts werden in der [fstab(5)](https://man7.org/linux/man-pages/man5/fstab.5.html) `/etc/fstab eingetragen`

**Felder:**
- fs_spec - Pfad zum Block Device, Image oder Remote Filesystem, dass gemountet werden soll
- fs_file - Mount Point im lokalen Verzeichnisbaum, an welchem das Filesystem gemountet werden soll
- fs_vfstype - Das Filesystem, mit welchem das Gerät in fs_spec formatiert worden ist
- fs_mntops - Mount Options für diesen Eintrag
- fs_freq - Bestimmt ob das Filesystem mit [dump(8)](https://linux.die.net/man/8/dump) gesichert wird 0|1
- fs_passno - Reihenfolge in der [fsck(8)](https://man7.org/linux/man-pages/man8/fsck.8.html) Fielsystems untersucht
<br>
**Beispiel**
```
fs_spec                 fs_file     fs_vfstype  fs_mntops   fs_freq     fs_passno
/dev/sda2               /           ext4        defaults    0           1
/dev/sda3               swap        swap        defaults    0           0
/dev/cdrom              /media      iso9660     ro,noauto   0           0
/dev/sda5               /home       ext4        defaults    0           2
/dev/vg_data/lv_data    /data       ext4        defaults    0           3
```