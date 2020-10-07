n=input()
values = {'A':10,'B':11,'C':12,'D':13,'E':14,'F':15,'G':16}
s="ABCDEFG"
Sum=0
n1=n[::-1]
for i in range(len(n1)):
  if n1[i] in s:
    Sum+=values[n1[i]]*(17**i)
  else:
    Sum+=int(n1[i])*(17**i)
print(Sum)