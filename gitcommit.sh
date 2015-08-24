git add README.md
echo $1
eval mesgg = \" $1 \"
git commit -m $messg
git push -u origin master
