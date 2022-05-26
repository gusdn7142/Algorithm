



list = [int(input()) for i in range(9)]

total = sum(list)

for i in range(9):
    for j in range(i+1,9):   #8번 반복
        if 100 == total - (list[i] + list[j]):   #9C2
            num1,num2=list[i],list[j]    #그떄의 i와 j

            list.remove(num1)            #i 삭제
            list.remove(num2)           #j삭제
            list.sort()                 # 오름차순 정리

            for i in range(len(list)):
               print(list[i])         #리스트 출력
            break

    if len(list)<9:
        break






#9C7 = 9C2

#9명의 난쟁이의 합 = SUM

#가짜 2명의 인덱스 : i, j














































