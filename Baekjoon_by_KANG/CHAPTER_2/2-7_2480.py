input_data = input().split(' ')
A = int(input_data[0])
B = int(input_data[1])
C = int(input_data[2])

if A == B == C:
    price = 10000 + A * 1000
elif A == B != C:
    price = 1000 + A * 100
elif A == C != B:
    price = 1000 + A * 100 
elif B == C != A:
    price = 1000 + B * 100
else:
    price = max(A, B, C) * 100

print(price)

#    if A > (B and C):
#        price = A * 100
#    elif B > (A and C):
#        price = B * 100
#    elif C > (A and B):
#        price = C * 100