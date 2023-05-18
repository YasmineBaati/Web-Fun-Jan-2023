for i in range(0, 151):
    print(i)
for i in range(5,1001,5):
    print(i)
def counting_the_dojo_way():
    for i in range(1, 101):
        if i % 10 == 0:
            print("Coding Dojo")
        elif i % 5 == 0:
            print("Coding")
        else:
            print(i)
def countdown_by_fours():
    for i in range(2018, 0, -4):
        print(i)
def flexible_counter(lowNum, highNum, mult):
    for i in range(lowNum, highNum+1):
        if i % mult == 0:
            print(i)
            