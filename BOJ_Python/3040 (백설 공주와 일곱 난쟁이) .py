

#1단계 : itertools 라이브러리의 combinations() 함수 불러오기
from itertools import combinations


#2단계 : 9개의 값을 리스트로 입력받는다.
h = [int(input()) for _ in range(9)]


#3단계 : 9개의 값중 7개를 뽑은 후 for문을 돌리고 합이 100일떄, 각 요소를 출력한다.
for combi in combinations(h,7):
    if sum(combi) == 100:
        for i in combi:
            print(i)





# h = []
# for _ in range(9):
#     h.append(int(input()))
#
# print(h)





# h = [int(input()) for _ in range(9)]
# answer = False
#
# for i in range(8):  #7번 반복
#     if answer:  # 답이 이미 나온 경우
#         break
#
#     for j in range(i + 1, 9):
#         if sum(h) - h[i] - h[j] == 100:  # 2명 뺸 7명의 합이 100인 경우
#             h.pop(i)
#             h.pop(j - 1)
#
#             for k in sorted(h):
#                 print(k)
#
#             answer = True  # 답이 나옴
#             break