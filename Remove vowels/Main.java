s=input()
v="aeiou"
V="AEIOU"
for i in s:
  if i in v or i in V:
    continue
  else:
    print(i,end="")