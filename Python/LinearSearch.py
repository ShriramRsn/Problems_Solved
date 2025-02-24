def linearSearch():
    List = [12,24,32,36,45,56,69,78]
    target = 12
    for i in range(len(List)):
        if(List[i] == target):
            return i
    return -1

def main():
    result = linearSearch()
    if result != -1:
        print(f"Index of the value: {result}")
    else:
        print("Element not found")
    
if __name__ == "__main__":
    main()
    