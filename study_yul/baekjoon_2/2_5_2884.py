input_data = input().split()
Hour = int(input_data[0])
Minute = int(input_data[1])

if Minute > 45:
    print(Hour, Minute)
else:
    print(Hour-1,(Minute-45)*(-1))
