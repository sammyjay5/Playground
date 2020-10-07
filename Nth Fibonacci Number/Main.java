n = int(input())
a,b=0,1
ar=[0,1]
for i in range(n):
  c=a+b
  ar.append(c)
  a=b
  b=c
print(ar[n-1])