input_data = input().split()
Hour = int(input_data[0])
Minute = int(input_data[1])

if Minute >= 45:
    print(Hour, Minute-45)
elif Hour == 0 and Minute < 45:
    print(Hour+23, Minute+15)
else:
    print(Hour-1,(Minute+15))
