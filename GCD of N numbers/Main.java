n=int(input())
a=[]
b=[]
c=0
for i in range(n):
  a.append(int(input()))
Min = min(a)
for i in range(1,Min+1):
  if Min%i==0:
    b.append(i)
for i in range(len(b)-1,-1,-1):
  for j in range(n):
    if a[j]%b[i]==0:
      c+=1
      if c==n:
        gcd=b[i]
        break;
    else:
      c=0
  if c==n:
    break;
print(gcd)        