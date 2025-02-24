def binarySearch():
    List = [23, 48, 54, 67, 71, 89]
    target = 23
    start = 0
    end = len(List) - 1
    while(start <= end):
        mid = start + (end - start) // 2
        if(List[mid] < target):
            start = mid + 1
        elif(List[mid] > target):
            end =  mid - 1
        else:
            return mid
    return -1

def main():
    result = binarySearch()
    if result != -1:
        print(f"Element found at index {result}")
    else:
        print("Element not found")
    
if __name__ == "__main__":
    main()
