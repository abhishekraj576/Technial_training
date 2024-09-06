def insertionSort(arr):
    if (n := len(arr)) <= 1:
        return
    for i in range(1, n):

        key = arr[i]
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key


def mergeSort(arr):
    if len(arr) > 1:

        # Create sub_array2 ← A[start..mid] and sub_array2 ← A[mid+1..end]
        mid = len(arr) // 2
        left = arr[:mid]
        right = arr[mid:]

        # Sort the two halves
        mergeSort(left)
        mergeSort(right)

        # Initial values for pointers that we use to keep track of where we are in each array
        i = j = k = 0

        # Until we reach the end of either start or end, pick larger among
        # elements start and end and place them in the correct position in the sorted array
        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                arr[k] = left[i]
                i += 1
            else:
                arr[k] = right[j]
                j += 1
            k += 1

        # When all elements are traversed in either arr1 or arr2,
        # pick up the remaining elements and put in sorted array
        while i < len(left):
            arr[k] = left[i]
            i += 1
            k += 1

        while j < len(right):
            arr[k] = right[j]
            j += 1
            k += 1

arr=[10,3,15,9,4,38,4,22,5]
insertionSort(arr)
print("Insertion sort is")
print(arr)
print("Merge sort :")
mergeSort(arr)
print(arr)
