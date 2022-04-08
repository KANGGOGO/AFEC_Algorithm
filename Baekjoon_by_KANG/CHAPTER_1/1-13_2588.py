input_dataA = input()
input_dataB = input()
#인풋 함수 나열하여 인풋 n개 받음
first_input_a = int(input_dataA[0])
first_input_b = int(input_dataA[1])
first_input_c = int(input_dataA[2])
second_input_a = int(input_dataB[0])
second_input_b = int(input_dataB[1])
second_input_c = int(input_dataB[2])

first_result_a = first_input_a * second_input_c * 100
first_result_b = first_input_b * second_input_c * 10
first_result_c = first_input_c * second_input_c
first_result = first_result_a + first_result_b + first_result_c

second_result_a = first_input_a * second_input_b * 100
second_result_b = first_input_b * second_input_b * 10
second_result_c = first_input_c * second_input_b * 1
second_result = second_result_a + second_result_b + second_result_c

third_result_a = first_input_a * second_input_a * 100
third_result_b = first_input_b * second_input_a * 10
third_result_c = first_input_c * second_input_a
third_result = third_result_a + third_result_b + third_result_c

final_result = first_result + second_result * 10 + third_result * 100

print(first_result)
print(second_result)
print(third_result)
print(final_result)