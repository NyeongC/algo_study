import sys
'''
5
55 185
58 183
88 186
60 175
46 155
'''

n = int(input())
arr = []
for _ in range(n):
    arr.append(list(map(int,input().split(' '))))
result = []
for i in range(n):
    count = 1
    for j in range(n):
        if i == j:
            continue
        if arr[i][0] < arr[j][0] and arr[i][1] < arr[j][1]:
            count += 1
    print(count,end=" ")


