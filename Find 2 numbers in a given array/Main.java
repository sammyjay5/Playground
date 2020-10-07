n=int(input())
s=input()
if len(s)==1:
  for i in range(n-1):
    s+=" "+(input())
s=s.split(" ")
x=input()
if len(x)==1 or len(x)==2:
  x+=" "+input()
x=x.split(" ")
if x[0] in s:
  print("Element 1 index = %d"%(s.index(x[0])))
else:
  print("Element 1 index = -1")
if x[1] in s:
  print("Element 2 index = %d"%(s.index(x[1])))
else:
  print("Element 2 index = -1")
