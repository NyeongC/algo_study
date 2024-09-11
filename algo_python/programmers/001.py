###test

def solution(cpr):
    answer = []
    basic_order = ["check", "call", "pressure", "respiration", "repeat"]
    for action in cpr:
        for i in range(len(basic_order)):
            if action == basic_order[i]:
                answer.append(i+1)
    return answer

cpr = ["call", "respiration", "repeat", "check", "pressure"]
answer = solution(cpr)

print("[", end="")  # 리스트 시작 괄호 출력
for i in range(len(answer)):
    if i < len(answer) - 1:
        print(answer[i], end=", ")  # 마지막 요소가 아니면 쉼표와 함께 출력
    else:
        print(answer[i], end="")    # 마지막 요소는 쉼표 없이 출력
print("]")  # 리스트 끝 괄호 출력