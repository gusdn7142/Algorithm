



h, m = map(int, input().split(' '))

r = m - 45  #알람 시간에 해당하는 분에서 45분을 뺴주고

if r >= 0:   #
    m = r
else:       #
    h = h-1
    if h<0:
        h = 24 + h
    m = 60 + r

print(h,m)


