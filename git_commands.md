# Git commands 

## Repository erstellen / klonen / anbinden
### Lokales repo ertsellen
`git init`
### Repo klonen
`git clone "URL"`
### Aktualisieren der Remote URL
`git remote set-url origin "URL"`

## Stage & Snapshot

### Repo Status
`git status`

### File stagen
`git add "file"`

### Alle Files stagen
`git add -A`



## Remote synchronisation

### Anpassungen ins Git aufnehemen
`git commit -m "commit message"`

### commit all changes:
```
git commit -a -m "Message"
Convetion "feature: message"
```

### Anpassungen von Remote einpflegen
`git pull`

### Anpassungen von lokal nach remote einpflegen
`git push `


## Branch & Merge

### Branch auschecken/wechseln:
`git checkout`

### Branch erstellen:
```
git checkout -b
(Nameconvention: prefix/name des features)
z.B feature/blabla
z.B docs/readme
```

## Setup

### git config:
`git config --global user.email "you@example.com"`<br>
`git config --global user.name "Your Name"`<br>
`git config --list`


