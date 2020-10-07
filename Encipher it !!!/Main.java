s=input()
key=int(input())
a="abcdefghijklmnopqrstuvwxyz"
b=a.upper()
if s.isupper():
  if s in b:
    Index = b.index(s)
    Index+=key
    if Index>=25:
      Index -= 25
      print(b[Index-1])
    else:
      print(b[Index])
else:
  if s in a:
    Index = a.index(s)
    Index+=key
    if Index>25:
      Index -= 25
      print(a[Index-1])
    else:
      print(a[Index])  
    
  