# DB Basics

## Fachbegriffe:
- Tabelle -> Entität / Relation
- Spalten -> Attribute
- Tupeln -> Zeilen

Jedes Tupel wird mit einem Primärschlüssel eindeutig identifiziert.
Verbindungen zwischen Tabellen über Fremdschlüssel.

## Entity Relationship Modell:

![Entity Releationship Modell](/docs/databases/media/Entity-Relationship_Modell.png)

### Bestandteile:
- Entitäten (Rechtecke): Reale oder abstrakte Objekte
- Attribute (Ovale/Listen): Eigenschaften von Entitäten
- Beziehungen (Rauten/Linien): Verbindungen zwischen Entitäten
- Kardinalitäten (Zahlensymbole/Notationen): Anzahlverhältnisse<br>

**Beziehungen:**
- Kreis = 1 
- || = n
- Ψ = Primärschlüssel

## Relationen

- Beziehungstypen bilden das Fundament relationaler Datenbanken:
    - 1:1 Beziehungen: Eine Entität ist mit genau einer anderen verknüpft
    - 1:n Beziehungen: Eine Entität kann mit mehreren anderen verknüpft sein
     - n:m Beziehungen: Mehrere Entitäten können mit mehreren anderen verknüpft sein
- Implementierung von Beziehungen:
    - Verwendung von Primär- und Fremdschlüsseln
    - UNIQUE-Constraints für 1:1 Beziehungen
    - Zwischentabellen für n:m Beziehungen

## Best Practies für Datenbankdesign

1. Primärschlüssel sorgfältig wählen
    - Stabile, unveränderliche Werte bevorzugen
    - UUID/GUID oder Surrogatschlüssel für bessere Flexibilität
2. Beziehungstypen korrekt implementieren
    - 1:1 mit UNIQUE-Constraint
    - 1:n mit einfachem Fremdschlüssel
    - n:m mit Zwischentabelle
3. Konsistente Namenskonventionen
    - Einheitliche Benennungsmuster für Tabellen und Spalten
    - Singular für Tabellennamen (Person statt Personen)
    - ID-Suffix für Schlüsselspalten (PersonID)


