



i = 0
while 1:
    B, N = map(int, input().split())
    if B == N == 0:
        break

    while 1:
        if(i ** N > B):
            print(i)
            break
        i+=1

    # while i**N < B:
    #     i += 1
    # if i**N-B < B-(i-1)**N:
    #     print(i)
    # else:
    #     print(i-1)


