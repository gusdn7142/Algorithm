


# n = int(input())
#
# for i in range(2*n-1):
#     blank = abs(n-i-1)
#     star = 2*(n-blank)-1
#     print(' '*blank+'*'*star)




N = int(input())

for i in range(1,N):
    print(" " * (N-i) + "*" * (2*i-1))

for i in range(N,0,-1):
    print(" " * (N-i) + "*" * (2*i-1))


    # print(" " * i + "*" * (2*(N-i-1)+1))

