A, B = input().split(" ")
 
A2 = ""
B2 = ""

for i in range(len(A)-1, -1, -1):
    A2 += A[i]

for j in range(len(B)-1, -1, -1):
    B2 += B[j]

LIST = [A2, B2]
print(max(LIST))