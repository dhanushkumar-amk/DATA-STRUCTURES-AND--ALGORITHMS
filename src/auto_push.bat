@echo off

:loop
git status --porcelain | findstr "." > nul
if %errorlevel% == 0 (
    git add .
    git commit -m "modified"
    git push origin master
) else (
    echo No changes to commit.
)
timeout /t 3 > nul
goto loop
