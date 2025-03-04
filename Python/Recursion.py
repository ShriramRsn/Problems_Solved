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
    ans = fact(5)
    print(ans)
    
if __name__ == "__main__":
    main()