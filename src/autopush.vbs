Set WshShell = CreateObject("WScript.Shell")

Do
    ' Run git status and redirect output to nul
    errorLevel = WshShell.Run("cmd /c git status --porcelain | findstr ""."" > nul", 0, True)
    
    If errorLevel = 0 Then
        ' Changes found, add, commit, and push
        WshShell.Run "cmd /c git add .", 0, True
        WshShell.Run "cmd /c git commit -m ""modified""", 0, True
        WshShell.Run "cmd /c git push origin master", 0, True
    Else
        ' No changes to commit
        WScript.Echo "No changes to commit."
    End If
    
    ' Wait for 3 seconds
    WScript.Sleep 3000
Loop
