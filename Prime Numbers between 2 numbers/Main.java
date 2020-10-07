n=int(input())
def Prime(n):
  c=0
  for i in range(2,int(n/2)+1):
    if n%i==0:
      c+=1
  if c==0:
    return True
  else:
    return False
for i in range(2,n+1):
  if Prime(i):
    print(i,end=" ")