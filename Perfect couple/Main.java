n=int(input())
s=input().split(" ")
x=int(input())
a,b=0,0
for i in range(n):
  a=int(s[i])
  for j in range(i+1,n):
    if (a+int(s[j]))==x:
      b=int(s[j])
      break;
  if (a+b)==x:
    break;
if (a+b)==x:
  print("Perfect couple: %d %d"%(a,b))
else:
  print("No perfect couple found!")

  