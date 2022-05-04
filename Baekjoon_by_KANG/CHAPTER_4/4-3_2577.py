A = int(input())
B = int(input())
C = int(input())

ABC = list(str(A * B * C))
i = 0

for i in range(10):
    n = ABC.count(str(i))
    i += 1
    print(n)