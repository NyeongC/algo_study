import sys

n = int(input())
tree_list = list(map(int,input().split()))

#print(n, tree_list)
result_max = -10000

for i in range(n):
    for j in range(i+1,n):
        temp_max = tree_list[i] * tree_list[j]
        result_max = max(result_max,temp_max)

print(result_max)