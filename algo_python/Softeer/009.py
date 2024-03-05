import sys

n = int(input())

arr = [list(map(int,sys.stdin.readline().rstrip())) for _ in range(n)]
d = [(1,0),(-1,0),(0,1),(0,-1)]

def dfs(x,y,c):
    arr[x][y] = c
    for i in range(4):
        nx = d[i][0] + x
        ny = d[i][1] + y
        if 0 <= nx < n and 0 <= ny < n:
            if arr[nx][ny] == 1:
                dfs(nx,ny,c)
                
count = 1

for i in range(n):
    for j in range(n):
        if arr[i][j] == 1:
            count += 1
            dfs(i,j,count)
            


result = []
for k in range(2, count+1):
    c = 0
    for i in range(n):
        for j in range(n):
            if arr[i][j] == k:
                c += 1
    result.append(c)

print(len(result))
result.sort()
for i in result:
    print(i)
    