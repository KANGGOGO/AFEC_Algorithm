rep = int(input())
count = 0

for i in range(rep):
    A = list(input())
    A2 = list(set(A))
    if A == A2:
        count += 1

print(count)