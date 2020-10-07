n=int(input())
a=input().split(' ')
Max=int(a[0])
c=0
for i in range(1,n):
  if Max<=int(a[i]):
    Max=int(a[i])
while True:
  for i in range(n):
    if Max%int(a[i])==0:
      c+=1
      if c==n:
        print(Max)
        break;
    else:
      c=0
      Max+=1
  if c==n:
    break;
  