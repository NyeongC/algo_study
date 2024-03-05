# 요세푸스 문제

from collections import deque

N, K = map(int,input().split(' '))

q = deque([i+1 for i in range(N)])

result = []

while q:
    for _ in range(K-1):
        q.append(q.popleft())
    result.append(q.popleft())

print('<'+', '.join(map(str, result))+'>') # 좋은 방법