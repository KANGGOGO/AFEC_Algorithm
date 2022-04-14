reps = int(input())
i = 1
for i in range(1, reps + 1):
    i += 1
    input_data = input().split(" ")
    answer = int(input_data[0]) + int(input_data[1])
    print(answer)