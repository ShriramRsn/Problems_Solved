sum = 0
def revDigit(n):
    global sum
    if(n == 0):
        return 
    rem = n % 10
    sum = sum * 10 + rem
    revDigit(n//10)

def Rev_Order(n):
    if(n == 0):
        return 
    print(n)
    Rev_Order(n-1)
    print(n)
    
def fact(n):
    if(n <= 1):
        return 1
    return n*fact(n-1)


def main():
    # Rev_Order(5)
    # ans = fact(5)
    # print(ans)
    
    #Reverse Digit
    revDigit(1234)
    print(sum)
    
if __name__ == "__main__":
    main()