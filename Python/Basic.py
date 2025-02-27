def isLeapYear(year):
    return year % 4 == 0 and not(year % 100 == 0) or year % 400 == 0

def main():
    year = int(input("Enter Year: "))
    if isLeapYear(year):
        print(f"{year} is a Leap Year.")
    else:
        print(f"{year} is a not Leap Year.")
    
    
if __name__ == "__main__":
    main()