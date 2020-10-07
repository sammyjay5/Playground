n=input()
Sum,Sum1=0,0
for i in range(len(n)):
  if i==0 or i%2==0:
    Sum+=int(n[i])
  else:
    Sum1+=int(n[i])
print(abs(Sum-Sum1))