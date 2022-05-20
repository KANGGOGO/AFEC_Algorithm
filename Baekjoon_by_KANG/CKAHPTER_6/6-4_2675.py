T = int(input())
i = 0

for i in range(T):
    R, S = input().split(" ")
    for j in S:
        print(j * int(R), end = "")
    print()