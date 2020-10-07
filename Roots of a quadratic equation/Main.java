import math
import cmath
a=int(input())
b=int(input())
c=int(input())
d=(b*b)-(4*a*c)
if d>=0:
  r1 = (-b + math.sqrt(d))/(2*a)
  r2 = (-b - math.sqrt(d))/(2*a)
  print("root1 = %.2f  root2 = %.2f "%(r1,r2))
elif d<0:
  real = (-b)/(2*a)
  img = math.sqrt(-d)/(2*a)
  print("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi "%(real,img,real,img))