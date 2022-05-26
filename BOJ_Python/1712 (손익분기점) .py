

#A : 고정 비용
#B : 가변 비용
#C : 노트북 총 가격 (A+BN)  //N은 판매량

A,B,C = map(int, input().split(' '))

if B >= C:  # 가변비용이 노트북 가격보다 같거나 크면
    print(-1)
else:
    print(A//(C-B)+1)



