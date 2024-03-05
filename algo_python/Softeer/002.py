import sys

T = int(input())

for _ in range(T):
    N = int(input())
    # 몫과 나머지
    m_num = N // 5
    n_num = N % 5
    for _ in range(m_num):
        print('++++', end=" ")
    for _ in range(n_num):
        print('|', end="")
    print('')

"""
print(,end="") 개행 제거
"""