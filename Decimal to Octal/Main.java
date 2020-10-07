n=int(input())
ans=""
while n>0:
  if int(n/8)==0:
    ans+=str(n)
    break;
  else:
    ans+=str(int(n%8))
    n=int(n/8)
print(ans[::-1])    