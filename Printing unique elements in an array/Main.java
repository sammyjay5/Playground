n=int(input())
a=[]
for i in range(n):
  a.append(int(input()))
for i in range(n):
  c=0
  for j in range(n):
    if(a[i]==a[j] and i!=j):
      c=1
  if c==0:
    print(a[i],end=" ")
