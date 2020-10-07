s=input()
s=s.lower()
a="abcdefghijklmnopqrstuvwxyz"
b=[0]*26
for i in s:
  if i in a:
    b[a.index(i)]+=1
Max=b.index(max(b))
print("Maximum occurring character is '%s' = %d times."%(a[Max].upper(),max(b)))