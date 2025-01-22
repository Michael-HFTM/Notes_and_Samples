# Git Basics

*Homework for class IN250 - Block 04*

## Task 1: Creating a remote repository on Github

- Click on the profile icon and choose "Your repositories" from the sidebar
- Click on "New" and enter the repository details, finish with "Create repository"
 
## Task 2: Clone the remote repo to the local machine

- Copy the "HTTPS" repository URL from Github
- Open a new cmd and navigate to the desired repository location using: `cd "path to directory"`
- Clone the remote repsoitroy to this location using: `git clone "URL"`

## Task 3: Add and commit an existing file 

- Copy the the desired file into your repository location, using your prefered method
- Optional: Check your repository status using: `git status` 
- Add the 'new' file to the repsoitory staging area using: `git add "filename"` or `git add -A` *(all files)*
- Commit the staged changes to the local repository using: `git commit -m "commit message"`

## Task4: Create the .gitignore file

- Create a new file named ".gitignore" in the local repository
- In this file add all filenames that should be ignored by git <br>
Ex. `*.log` ignores all files of the filetype .log <br>
Ex. `GeheimeBankInformationen.txt` ignores this spcific txt file
- Commit the new file using the steps mentioned in Task 3

## Task 5: Create a second local repository and link it to the remote repository 

- Switch to different dircetory and initalize a new local repository using `git init` <br>
*A new empty repository is initialised*
- add remote origin URL with: `git remote add origin "URL"`<br>
*This will not automaticly pull the remote source*
- Using `git origin fetch` the remote changes can be fetched, no changes ar made to the local branch.
- The changes on the main branch can be merged into the local brach using `git pull origin main`

## Task 6: Reasons to use Git in Softwaredevelopment

Git is currently the standard sourcecontroll tool used in softwaredevelopment. <br>

**But why use sourcecontroll at all?**<br>
Using sourcecontroll has multiple advantages: <br>
- Makes it possible to track and if needed revert made changes.
- The tools make it possible to release changes needed for production, while still WIP. feautures can be held back.
- Using remote repositories its a lot easier to work in a Team.

**Why should we follow this order?**<br>
In case of fire: 
1. git commit
2. git push
3. Leave the building.

You should **ALWAYS** commit and push made changes to the remote source before leaving.<br>
Loosing the hard earned chages made in a working day would be a catastrophe and we have to set priorities.<br>
Our health isn't that important anyway. :)

## SSH

SSH-Key gernerieren und bei Git & Github hinterlegen

- `ssh-keygen -C "michael.gassser@hftm.ch" -t ed25519`
- Dienste -> "OpenSSH Authentication Agent" starten 
- `ssh-add C:\Users\Micha\.ssh\id_ed25519`

- Globale git config anpassen:<br>
 `git config --global core.sshCommand C:/Windows/System32/OpenSSH/ssh.exe`
- In Github unter 'Settings' den key eintragen
- Testen: `ssh git@github.com` sollte "PTY allocation request failed on channel 0" 