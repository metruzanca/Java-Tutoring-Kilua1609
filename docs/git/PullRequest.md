# Steps to create a pull request

1. Create a new branch
```bash
git checkout -b <Feature name>
```

2. After writing some code, commit and push
```bash
git add .
git commit -m "my message"
git push
```

> NB: When pushing a new branch, git will warn you tha the new branch doesn't exist on remote and will give you the command to copy and paste to fix the issue.
```bash
# This command
git push --set-upstream origin examplePR
```

3. After pushing, the remote will give you a link to open in your browser in order to create a pull request.
```diff
Counting objects: 5, done.
Delta compression using up to 8 threads.
Compressing objects: 100% (5/5), done.
Writing objects: 100% (5/5), 443 bytes | 147.00 KiB/s, done.
Total 5 (delta 3), reused 0 (delta 0)
remote: Resolving deltas: 100% (3/3), completed with 3 local objects.
remote: 
remote: Create a pull request for 'examplePR' on GitHub by visiting:
+ remote:      https://github.com/metruzanca/Java-Tutoring-Mattia_Collari/pull/new/examplePR
remote: 
To github.com:metruzanca/Java-Tutoring-Mattia_Collari.git
 * [new branch]      examplePR -> examplePR
Branch 'examplePR' set up to track remote branch 'examplePR' from 'origin'.
```
4. Make sure to add at least a reviewer to the PR and any information you think they might need to in the PR body.