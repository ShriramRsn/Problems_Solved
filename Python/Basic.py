def isLeapYear():
    year = int(input("Enter Year: "))
    if(year % 4 == 0 and year % 100 != 0 or year % 400 == 0):
        return print("It's a Leap Year.")
    return print("It's not a Leap Year")

def isEven():
    num = int(input("Enter Integer: "))
    if(num % 2 == 0):
        return print("It's Even")
    return print("It's Odd")

def isOdd():
    num = int(input("Enter Integer: "))
    abs(num)
    if(num & 1 == 1):
        return print("It's Odd")
    return print("It's Even")

def palindrome():
    word = "mam"
    for i  in range(0,len(word)):
        revWord = "" + word[::-1]
    if(word == revWord):
        return True
    return False

def main():
    # isLeapYear()
    # isEven()
    # isOdd()
    print(palindrome())
    
if __name__ == "__main__":
    main()