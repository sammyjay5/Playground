n=input()
m=""
for i in range(len(n)):
  if n[i]=="0":
    continue
  else:
    m+=n[i]
print(m[::-1])