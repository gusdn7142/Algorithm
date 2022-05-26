

#직각삼각형 성립 조건  (a²+b²=c²),  제일 큰 값이 c여야 하기 때문에 정렬 필요!
while True:
    a, b, c = sorted(map(int, input().split()))
    if a==b==c==0:
        break
    if a**2+b**2==c**2:
        print('right')
    else:
        print('wrong')







#a.sort
#sorted(a)


# a = [3,2,1,0]
#
# a.sort()
#
# print(a)