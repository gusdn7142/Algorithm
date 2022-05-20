from itertools import combinations

h = [int(input()) for _ in range(9)]

for combi in combinations(h,7):
    if sum(combi) == 100:
        for i in combi:
            print(i)