


A,B = input().split(' ')

# A = A[2]+A[1]+A[0]
# B = B[2]+B[1]+B[0]

A = A[::-1]
B = B[::-1]



print(max(A,B))