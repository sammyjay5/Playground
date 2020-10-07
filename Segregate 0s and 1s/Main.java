n=int(input())
s=input().split(" ")
zero=s.count("0")
a=[0]*zero + [1]*(n-zero)
for i in a:
  print(i,end=" ")