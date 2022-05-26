



#9개의 수가 주어짐
#max를 통한 최갯값 찾고, 몇번쨰 수인지 파악




N = [int(input()) for _ in range(9)]

# print(max(N))
# print(N.index(max(N))+1)

max = 0
max_index = 0
for i in range(9):
    if max < N[i]:
        max = N[i]
        max_index = i+1

print(max)
print(max_index)






#
# p=1
# for i in range(N,0,-1):
#     p *= i
#
# print(p)
