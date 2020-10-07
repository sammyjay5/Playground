n=int(input())
while n%2==0:
  print(2,end=" ")
  n=int(n/2)
for i in range(3,int(n/2),2):
  while n%i==0:
    print(i,end=" ")
    n=int(n/i)
