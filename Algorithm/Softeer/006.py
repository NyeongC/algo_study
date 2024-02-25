import sys

N = int(input())
result = []
for _ in range(N):
    temp = list(input().split())
    for index,i in enumerate(temp[0]):
        if (i == 'x' or i == 'X'):
            result.append(temp[1][index].upper())
print(''.join(result))


'''
문자열을 하나하나 += 로 더하고 있으면 너무 느림
list 에 append 하고 난 뒤에 합치는게 나음
''.join(your_list)

sys.stdin.readline().rstrip() / rstrip() 은 관행처럼 enter 삭제
더 빠른 입력인데 그닥 차이 안나는것같음. 다음에 확인


'''