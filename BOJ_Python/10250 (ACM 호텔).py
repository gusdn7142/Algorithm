


T = int(input()) #테스트 케이스 T 입력


for i in range(T): #T만큼 for문을 반복하면서
    h, w, n = map(int, input().split())  #층 수 (h), 방 수 (w), n(몇번쨰 손님)을 input().split(’ ‘)을 통해 입력 받음

    room = n//h + 1         #호수
    floor = n % h          #층
    if n % h == 0:        #n이 h로 나누어 떨어지면
        room = n//h
        floor = h
    print(floor*100+room)




    # q, r = divmod(n-1,h)   #q는 몫(호수), r은 나머지(층)
    # print((r+1)*100+q+1)


    # print(h,w,n)




