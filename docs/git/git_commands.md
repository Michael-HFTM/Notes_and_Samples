# Git commands 

## Repository creation/cloning
### initalize a local repository
`git init`
### clone a remote repository
`git clone "URL"`
### change remote url
`git remote set-url origin "URL"`

## Stage & snapshot (local)
### Repo status
`git status`
### File stagen
`git add "file"`
### Alle Files stagen
`git add -A`

## Synchronise with remote repository
### commit staged changes
`git commit -m "commit message"`
### commit ALL changes
```
git commit -a -m "Message"
Convetion "feature: message"
```
### pull changes from remote source
`git pull`
### push changes to remote source
`git push `

## Branch & Merge
### checkout/switch branch:
`git checkout`
### create a new branch:
```
git checkout -b
(Nameconvention: prefix/name ot the feature)
z.B feature/blabla
z.B docs/readme
```

`git stash` - Speichert nicht commitete änderungen in einem Zwischenspeicher<br>
`git stash apply` - Merged die zwischengespeicherten änderungen wieder in den Workspace<br>

`git tag` - Listet alle Tags auf<br>
`git tag "Versionbezeichnung"` - erstellt einen Tag von einem commit<br>
`git tag -d "Versionsbezeichnung"` - entfernt den angegebenen Tag<br>

`git push -f` - macht einen push inkl. Tags<br>
`git push --tags` - macht einen push inkl. Tags

## Setup
### General git config commands:
`git config --global user.email "you@example.com"`<br>
`git config --global user.name "Your Name"`<br>
`git config --list`

## History

### Commit history anzeigen<br>
`git log` 

