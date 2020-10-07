b=input()
d=0
for i in range(len(b)-1,-1,-1):
  d+=(2**((len(b)-1)-i))*int(b[i])
print(d)