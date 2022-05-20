h, m = map(int, input().split(' '))

r = m - 45

if r >= 0:
    m = r
else:
    h = h-1
    if h<0:
        h = 24 + h
    m = 60 + r

print(h,m)
