def bubbleSort(list):
    for i in range(len(list)):
        swapped = False
        for j in range(1, len(list)-i):
                if(list[j] < list[j-1]):
                    list[j], list[j - 1] = list[j - 1], list[j]
                    swapped = True
        if(not swapped):
            break
    return list

def main():
    list = [5, 4, 3, 2, 1]
    bubbleSort(list)
    print(f"Sorted List: {list}")

if __name__ == "__main__":
    main()    