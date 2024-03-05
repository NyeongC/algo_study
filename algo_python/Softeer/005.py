import sys

n = int(input())
a = []
for _ in range(n):
    a.append(tuple(map(int,input().split())))

a = sorted(a,key = lambda x:x[1]) # 두번째 튜플값 기준으로 정렬해라, x:(x[0],x[1]), reverse=True 등 내림차순이나 정렬 기준 순서도 정하기 가능

print(a[0][0], a[0][1],end=" ")