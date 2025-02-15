# Arbeitsblatt neue Partitionen
## Übung 1
*Vorbereitungen gemäss Screenshots (siehe Arbeitsblatt)*

## Übung 2
>Verwende lsblk(8) um den Namen der neuen Disk in /dev zu ermitteln. Initialisiere
anschliessend mittels pvcreate(8) die neue Disk zur Verwendung mit LVM. Lass dir das
soeben erstellte Physical Volume mit pvs(8) anzeigen.

## Übung 3
>Nun musst du das neu erstellte Physical volume in eine Volume Group stecken. Dazu
erstellst du gleiche eine eigene Volume Group namens vg_data. Dazu verwendest du
vgcreate(8). Anschliessend lässt du dir deinen neue Volume Group mittels vgs(8)
anzeigen.

## Übung 4
>Jetzt brauchst du nur noch ein Logical Volume innerhalb der Volume Group vg_data. Mit
Hilfe von lvcreate(8) erstellst du das Volume lv_data und lässt dir dieses anschliessend
mit lvs(8) anzeigen.

## Übung 5
>Ein Logical Volume unter LVM entspricht ja einer Partition nach «alter» Schule. Da dir
jetzt ein Logical Volume zur Verfügung steht kannst du dies auch formatieren. Suche dir
den Pfad zu deinem Volume mittels find(1). Formatiere das so gefundene Logical Volume
mit Hilfe von mkfs(8) mit dem Dateisystem ext4.

## Übung 6
>Mit mkdir(1) erstellst du den Mount Point für dein neues Filesystem. Damit die Disk bei
jedem Start automatisch gemountet wird erstellst du in der Datei /etc/fstab einen
passenden Eintrag. In fstab(5) steht wie es geht.
