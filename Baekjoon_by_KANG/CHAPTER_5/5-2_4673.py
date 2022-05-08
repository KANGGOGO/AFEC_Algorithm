def d(n):
    # result = 0
    # for i in range(n):
    #     result = result + int(n) % 10**i
    a = int(n)
    b = int(n) // 10000
    c = (int(n) % 10000) // 1000
    d = ((int(n) % 10000) % 1000) // 100
    e = (((int(n) % 10000) % 1000) % 100) // 10
    f = (((int(n) % 10000) % 1000) % 100) % 10
    result = a + b + c + d + e + f
    return(result)

print(d(358))

n = input()
print(10**len(n))
