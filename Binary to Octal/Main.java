m=int(input())
a=[]
octal=""
def Binary(n):
  x=len(str(n))
  m=str(n)
  sum=0
  for i in range(x):
    sum+=(2**(x-i-1))*int(m[i])
  return sum
while m>0:
  a.append(int(m%1000))
  m=int(m/1000)
for i in a:
  octal+=str(Binary(i))
print(octal[::-1])