s=input().split(" ")
start=int(s[0])
end=int(s[1])
l=len(s[1])
for i in range(start,end):
    print("0"*(l-len(str(i)))+"%d"%(i),end=" ")   
print(end)
  
  
