n=int(input())
s=input().split(" ")
rows,cols = int(s[0]),int(s[1])
a=[]
b=[]
for i in range(rows):
  c=input().split(" ")
  a.append(c)
for i in range(rows):
  c=input().split(" ")
  b.append(c)
for i in range(rows):
  for j in range(cols):
    print(int(a[i][j])+int(b[i][j]),end=" ")
    