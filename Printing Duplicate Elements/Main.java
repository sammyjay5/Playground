n=int(input())
s=input().split(" ")
ans=""
for i in range(len(s)):
  if s.count(s[i])>1:
    if s[i] not in ans:
      ans+=s[i]+" "
print(ans)    
    