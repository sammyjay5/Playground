n=input()
b=n.split(' ')
a=[]
c=0
for i in b:
  if i!='':
    a.append(int(i))
Max=max(a)
while True:
  if Max%a[0]==0 and Max%a[1]==0:
    print(Max)
    break;
  else:
    Max+=1