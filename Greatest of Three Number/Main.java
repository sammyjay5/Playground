n=input()
m=n.split(',')
a=[]
for i in range(len(m)):
  a.append(int(m[i]))
print(max(a))