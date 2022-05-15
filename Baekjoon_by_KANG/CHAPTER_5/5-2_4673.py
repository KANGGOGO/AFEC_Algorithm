def d(n):
    N = str(n)
    X = []
    for i in range(len(N)):
        X.append(int(N[i]))
    
    for j in range(len(X)):
        n = n + X[j]
    
    return n

boundary = 10000
DEL_list = []
RESULT_LIST = []

k = 0
while k < boundary:
    k += 1
    DEL_list.append(d(k))
    DEL_list.sort()

DEL_list_SET = list(set(DEL_list))

DEL_list2 = []
f = 0
for f in range(len(DEL_list_SET) + 1):
    if DEL_list_SET[f] <= boundary:
        DEL_list2.append(DEL_list_SET[f])
    else:
        break

l = 1
while l <= boundary:
    RESULT_LIST.append(l)
    l += 1

m = 0
for m in range(len(DEL_list2)):
    RESULT_LIST.remove(DEL_list2[m])
    m += 1

t = 0
for t in range(len(RESULT_LIST)):
    print(RESULT_LIST[t])