# Normalisierung

## Allgemeines

- Normalisierung = schrittweiser Prozess zur Optimierung von Datenbankstrukturen
- Ziel: Beseitigung von Redundanzen und Anomalien durch logische Strukturierung
- Entwickelt von Edgar F. Codd als Teil der relationalen Theorie

### Vorteile normalisierter Datenbanken
- Datenintegrität und Konsistenz
- Reduzierte Redundanz und Speicherbedarf
- Einfachere Wartung und Erweiterbarkeit
- Klarere Abbildung der realen Welt
- Bessere Abfrageperformance für komplexe Abfragen
- Schutz vor logischen Fehlern

## Normalformen

### Erste Nomralfrom (1NF)

**Definition**<br>
Eine Tabelle ist in 1NF, wenn:
- Jede Spalte atomar (nicht weiter zerlegbar) ist
- Keine Wiederholungsgruppen oder Arrays existieren
- Jede Zeile einen eindeutigen Schlüssel hat

### Zweite Normalform (2NF)

**Definition**<br>
Eine Tabelle ist in 2NF, wenn sie:
- In 1NF ist
- Alle Nicht-Schlüssel-Attribute voll funktional abhängig vom gesamten Primärschlüssel sind

**Einfache Erklärung** <br>
- Betrifft nur Tabellen mit zusammengesetztem Primärschlüssel
- Keine Attribute dürfen nur von einem Teil des Schlüssels abhängen
- "Alles oder nichts" Prinzip für Abhängigkeiten

### Dritte Normalform (3NF)

**Definition**<br>
- Eine Tabelle ist in 3NF, wenn sie:
- In 2NF ist
- Keine transitiven Abhängigkeiten enthält

**Einfache Erklärung**<br>
- Nicht-Schlüssel-Attribute dürfen nicht von anderen Nicht-Schlüssel-Attributen abhängen
- Jedes Attribut muss direkt vom Primärschlüssel abhängen
- "Direkte Abhängigkeit" Prinzip

## Weiterführende Normalformen
### Boyce-Codd Normalform (BCNF)
- Verschärfung der 3NF
- Alle Determinanten sind Kandidatenschlüssel
### Vierte Normalform (4NF)
- Behandelt Mehrwertige Abhängigkeiten
- Selten in der Praxis angewendet
### Fünfte Normalform (5NF)
- Behandelt Join-Abhängigkeiten
- Sehr spezialisiert, selten relevant

Für die meisten praktischen Anwendungen ist die 3NF ausreichend!

## Wann ist De-Normalisierung sinnvoll?

### Gründe für De-Normalisierung
- Stark lesezentrierte Anwendungen
- Reporting- und Analyse-Datenbanken
- Extreme Performance-Anforderungen
### Techniken zur De-Normalisierung
- Berechnete Spalten (z.B. Gesamtpreis in Bestelltabelle)
- Materialisierte Aggregationen (z.B. Anzahl Bestellungen pro Kunde)
- Wiederholungsgruppen für Performance-kritische Daten

**Wichtig:** De-Normalisierung immer dokumentieren und Risiken abwägen!

## Zusammenfassung

- Normalisierung beseitigt Redundanzen und  Anomalien
    - 1NF: Atomare Werte, keine Wiederholungsgruppen
    - 2NF: Volle funktionale Abhängigkeit vom Primärschlüssel
    - 3NF: Keine transitiven Abhängigkeiten
- Vorteile der Normalisierung:
    - Verbesserte Datenintegrität
    - Reduzierte Redundanz
    - Einfachere Wartung und Erweiterung
- Balance zwischen Normalisierung und Performance-Anforderungen
    - De-Normalisierung nur für spezifische Anwendungsfälle
    - 3NF als Standard-Ziel für die meisten Datenbanken