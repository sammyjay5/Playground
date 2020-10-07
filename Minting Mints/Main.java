s=input().split(" ")
n=int(s[0])
length=int(s[1])
sum=n
for i in range(length-1):
  sum+=sum-1
print(sum)