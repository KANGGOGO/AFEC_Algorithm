def d(n):
    N = str(n)
    X = []
    for i in range(len(N)):
        X.append(int(N[i]))
    
    for j in range(len(X)):
        n = n + X[j]
    
    return n

boundary = int(10)

DEL_list = []
k = 0
while k < boundary:
    k += 1
    DEL_list.append(d(k))
    DEL_list.sort()
    set(DEL_list)

f = 0
for f in DEL_list:
    if f > boundary:
        DEL_list.remove(f)