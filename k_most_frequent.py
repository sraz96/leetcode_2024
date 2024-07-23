from collections import Counter 
from heapq import nlargest

def k_most_frequent(arr, k):
    count = Counter(arr)
    return nlargest(k, count.keys(), key=count.get)

arr = [1,23,4,54,6,56,7,34,2,35,6,5]
k = 3
result = k_most_frequent(arr, k )
print(f"The {k} most frequent elements are: {result}")