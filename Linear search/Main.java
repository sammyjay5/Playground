n=int(input())
s=input().split(' ')
s1=input()
if s1 not in s:
  print(s1+" isn't present in the array.")
else:
  for i in range(len(s)):
    if s[i]==s1:
      print(i+1)
      break;