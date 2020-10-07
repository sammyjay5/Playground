n=input().split(' ')
Min=int(n[0])
for i in range(1,len(n)):
  if Min>=int(n[i]):
    Min=int(n[i])
print(Min)