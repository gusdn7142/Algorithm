


# N = [int(input()) for _ in range(10)]
#
#
# print(N)


num = []

for i in range(10):
    n = int(input())
    num.append(n % 42)

arr = set(num)  #set 함수는 중복된 값을 없애줍니다.
#print(arr)
print(len(arr))





#set함수는 리스트에서 중복된값을 없애주는 함수
#

#
# arr = set(arr)
# print(len(arr))