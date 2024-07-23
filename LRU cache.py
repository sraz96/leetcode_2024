from collections import OrderedDict

class LRUCache:
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.cache = OrderedDict()

    def get(self, key: int) -> int:
        if key not in self.cache:
            return -1
        
        # Move the key to the end to show that it was recently used
        self.cache.move_to_end(key)
        return self.cache[key]

    def put(self, key: int, value: int) -> None:
        if key in self.cache:
            # Move the key to the end
            self.cache.move_to_end(key)
        self.cache[key] = value
        if len(self.cache) > self.capacity:
            # Remove the first item (least recently used)
            self.cache.popitem(last=False)

# Example usage
if __name__ == "__main__":
    cache = LRUCache(2)
    
    cache.put(1, 1)
    cache.put(2, 2)
    print(cache.get(1))       # returns 1
    cache.put(3, 3)           # evicts key 2
    print(cache.get(2))       # returns -1 (not found)
    cache.put(4, 4)           # evicts key 1
    print(cache.get(1))       # returns -1 (not found)
    print(cache.get(3))       # returns 3
    print(cache.get(4))       # returns 4