s="break,case,continue,default,defer,else,for,func,goto,if,map,range,return,struct,type,var"
key=s.split(",")
inp=input()
if inp in key:
  print(inp+" is a keyword")
else:
  print(inp+" is not a keyword")