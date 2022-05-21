#1. x좌표, y좌표를 모은 두 개의 리스트를 생성한다.
x_sum = []
y_sum = []
for _ in range(3):
    x, y = map(int, input().split(' '))
    x_sum.append(x)
    y_sum.append(y)

#2. 두 개의 리스트에서 개수가 한 개인 요소를 찾아서 출력한다.
for i in range(3):
    if x_sum.count(x_sum[i]) == 1:  
        x4 = x_sum[i]
    if y_sum.count(y_sum[i]) == 1:
        y4 = y_sum[i]
print(x4, y4)