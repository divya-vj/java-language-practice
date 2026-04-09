# Smart Java Auto-Committer
$repoPath = "C:\Users\admin\OneDrive\Desktop\java-language-practice"
Set-Location $repoPath

$status = git status --porcelain
if (-not $status) {
    Write-Host "[$(Get-Date -Format 'hh:mm tt')] Nothing changed. No commit."
    exit
}

$javaChanges = git status --porcelain -uall | Where-Object { $_ -match "\.java" }
if (-not $javaChanges) {
    Write-Host "[$(Get-Date -Format 'hh:mm tt')] No .java changes. No commit."
    exit
}

$messages = @()
foreach ($line in $javaChanges) {
    $filePath = ($line -replace '^\s*..\s+', '').Trim()
    $parts = $filePath -split "/"
    $changeCode = $line.Trim().Substring(0,1)
    $action = if ($changeCode -eq "?" -or $changeCode -eq "A") { "Add" } else { "Update" }

    if ($parts.Count -ge 2) {
        $topic = $parts[0]
        $file = [System.IO.Path]::GetFileNameWithoutExtension($parts[-1])
        $messages += "$action $file in $topic"
    } else {
        $messages += "$action Java practice file"
    }
}

$commitMsg = $messages -join " | "
git add .
git commit -m $commitMsg
git push origin main

Write-Host "[$(Get-Date -Format 'hh:mm tt')] Committed: $commitMsg"