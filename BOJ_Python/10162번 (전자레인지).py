


T = int(input())  #전자레인지 요리 시간

A = T // 300       #A버튼을 누른 횟수
B = T % 300 // 60  #B버튼을 누른 횟수
C = T % 300 % 60  // 10  #C버튼을 누른 횟수
check = T % 300 % 60  % 10   #3개의 버튼으로 T초를 맞출수 있나 확인


if check == 0:              #나머지가 0이면
    print(A, B, C)      #각 버튼 누른 횟수 출력
elif check != 0:           #나머지가 0이 아니면
    print(-1)