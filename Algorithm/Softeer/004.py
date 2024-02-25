import sys

a, b, d = map(int,input().split())
result = 0

# 술래 찍기 전 
t1_m = d // a
t1_n = d % a

for _ in range(t1_m - 1):
    result += a + b

if t1_n > 0 :
    result += a + b + t1_n
else :
    result += a

# 술래 찍기 후 시간 계산
t2_m = d // b
t2_n = d % b

for _ in range(t2_m - 1):
    result += b + a

if t2_n > 0 :
    result += b + a + t2_n
else :
    result += b

print(result)
