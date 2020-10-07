n=int(input())
sum=0
while n>0:
  sum+=int(n%10)
  n=int(n/10)
if len(str(sum))>1:
  n=sum
  sum=0
  while n>0:
    sum+=int(n%10)
    n=int(n/10)
print(sum)  
    
    
