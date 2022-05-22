T = int(input())

for i in range(T):
    count=0
    c=0

    s = input()
    for j in s:
        if j=='O':
            c+=1
            count+=c
        else:
            c=0
    print(count)
