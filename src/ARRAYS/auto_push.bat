@echo off

:loop
git status --porcelain | findstr "." > nul
if %errorlevel% == 0 (
    git add .
    git commit -m "Automatic commit"
    git push origin master
)
timeout /t 10 > nul
goto loop
