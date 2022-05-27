A = input()
B = ["c=","c-","dz=","d-","lj","nj","s=","z="]

for i in B:
    A = A.replace(i, "i")

# A = A.replace("c=", "1")
# A = A.replace("c-", "2")
# A = A.replace("dz=", "3")
# A = A.replace("d-", "4")
# A = A.replace("lj", "5")
# A = A.replace("nj", "6")
# A = A.replace("s=", "7")
# A = A.replace("z=", "8")

print(len(A))