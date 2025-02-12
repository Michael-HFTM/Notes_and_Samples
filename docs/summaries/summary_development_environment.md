Hier ist eine ausführliche Zusammenfassung der Theorieinhalte aus deinem PDF in Markdown:

---

# Zusammenfassung: Development Environment

## 1. Markdown Grundlagen
### Warum Markdown?
- KISS-Prinzip: Keep It Simple, Stupid
- Markdown ist ein einfacher, plattformunabhängiger Textformatierungsstandard
- Dateien mit der Endung `.md` können mit jedem Editor bearbeitet werden
- Wird oft für Dokumentationen genutzt (z. B. `README.md`)

### Markdown Syntax
#### Überschriften
```
# Haupttitel
## Untertitel
### Unter-Unter-Titel
```

#### Textformatierung
```
**Fett**
*Kursiv*
`Inline-Code`
```
#### Codeblöcke
```
    ```
    print("Mehrzeiliger Codeblock")
    ```
```

#### Listen
- **Geordnete Listen**
  ```
  1. Erster Punkt
  2. Zweiter Punkt
  3. Dritter Punkt
  ```

- **Ungeordnete Listen**
  ```
  - Punkt 1
  - Punkt 2
  ```

- **Tasklisten**
  ```
  - [x] Erledigt
  - [ ] Noch offen
  ```

## 2. Git Grundlagen
### Warum Git?
- Versionskontrolle für Codeprojekte
- Vermeidung von Datenverlusten
- Zusammenarbeit und Synchronisation zwischen Entwicklern

### Installation von Git
- Windows: Manuelle Installation erforderlich
- MacOS/Linux: Bereits vorinstalliert oder über Paketmanager installierbar

### Git Repository erstellen & verwalten
```sh
git init        # Neues Repository erstellen
git clone <url> # Bestehendes Repository klonen
git remote set-url origin <url> # Remote URL ändern
```

### Dateien verwalten
```sh
git add <file>   # Datei zur Staging-Area hinzufügen
git commit -m "Nachricht" # Änderungen committen
git pull         # Änderungen vom Remote-Repository abrufen
git push         # Änderungen hochladen
```

### .gitignore – Dateien ausschließen
- Definiert Dateien, die nicht getrackt werden sollen
- Beispiel:
  ```
  *.log
  GeheimeBankInformationen.txt
  Verzeichnisname/
  ```

## 3. Git Branching & Workflows
### Branches in Git**
```sh
git branch <branch-name>  # Neuen Branch erstellen
git checkout <branch-name> # In Branch wechseln
git merge <branch-name>    # Branch zusammenführen
git branch -d <branch-name> # Branch löschen
```

### Git Workflows
- **Feature Branching**: Jeder neue Feature bekommt einen eigenen Branch
- **Forking Workflow**: In Open-Source-Projekten wird ein Repo geforkt, Änderungen gemacht und dann via Pull Request vorgeschlagen
- **Release Branching**: Separate Branches für stabile Releases

## 4. Git Merging & Konfliktlösungen
### Merging Methoden
1. **Fast Forward Merge**: Einfaches Anhängen von Commits an die aktuelle Branch-Spitze
2. **Rebase**: Ändert die Commit-Historie, indem Commits an einen anderen Startpunkt verschoben werden

### Konflikte beheben
- **Pre-Merge Konflikt**
  ```sh
  git stash         # Änderungen temporär speichern
  git reset --hard  # Arbeitsverzeichnis zurücksetzen
  git stash apply   # Änderungen wiederherstellen
  ```
- **Merge Konflikte**
  - Manuelle Lösung erforderlich
  - IDEs bieten Unterstützung

## 5. Aufbau eines Git-Commits
Ein Git-Commit besteht aus mehreren Komponenten:
- **Hash (SHA-1)**: Eindeutige ID für den Commit
- **Author**: Name und E-Mail des Entwicklers
- **Datum**: Zeitpunkt des Commits
- **Commit-Nachricht**: Beschreibung der Änderungen
- **Parent-Hash**: Referenz auf den vorherigen Commit

Beispiel eines Commit-Logs:
```sh
git log --oneline
```
Ausgabe:
```
3f2a1c9 Added README file
7b9e5d1 Fixed login bug
2d5f9a8 Initial commit
```

Detailansicht eines Commits:
```sh
git show 3f2a1c9
```

## 6. Umgebungsvariablen in Windows
### Was sind Umgebungsvariablen?
- Schlüssel-Wert-Paare, die von Windows-Programmen verwendet werden
- Enthalten oft Pfade zu Programmen oder Konfigurationsdaten

### Wichtige Umgebungsvariablen
- `%PATH%`: Enthält eine Liste von Verzeichnissen, in denen Windows nach ausführbaren Dateien sucht
- `%USERPROFILE%`: Pfad zum Benutzerverzeichnis
- `%TEMP%` und `%TMP%`: Pfade zu temporären Dateien

### Umgebungsvariablen setzen und anzeigen
- Anzeigen:
  ```sh
  echo %PATH%
  ```
- Neue Variable setzen:
  ```sh
  setx MEINE_VAR "Mein Wert"
  ```
- Temporäre Variable (nur für die aktuelle Sitzung):
  ```sh
  set MEINE_VAR="Mein Wert"
  ```


