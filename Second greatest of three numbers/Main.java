a=[]
n=input().split(' ')
for i in range(len(n)):
  if n[i]=='':
    continue
  else:
    a.append(int(n[i]))
a.sort()
print(a[1])