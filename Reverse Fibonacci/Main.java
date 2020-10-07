n=int(input())
a,b=0,1
d=[0,1]
for i in range(n-2):
  c=a+b
  d.append(c)
  a=b
  b=c
if n>0:
  for i in range(n-1,-1,-1):
    if i == 0:
      print(d[0],end="")
    else:
      print(d[i], end=" ")
  