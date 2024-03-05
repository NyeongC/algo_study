import sys

n = int(input())

a = list(map(int,input().split()))

a.sort()

min_result = 1000000

for i in range(n-1):
    temp = a[i+1] - a[i]
    min_result = min(temp,min_result)

count_result = 0

for i in range(n-1):
    temp = a[i+1] - a[i]
    if temp == min_result:
        count_result += 1

print(count_result)