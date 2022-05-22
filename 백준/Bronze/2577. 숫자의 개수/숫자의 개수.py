A,B,C = [int(input()) for _ in range(3)]

mul = str(A*B*C)

for i in range(10):
    print(mul.count(str(i)))