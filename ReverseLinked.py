class node:
    def __init__(self, value):
        self.value = value
        self.next = None

class Linked_List:
    def __init__(self):
        self.head = None

    def append(self, Value):
        new_node = node(Value)
        if self.head is None:
            self.head = new_node
        return
        last_node = self.head
        while last_node.next:
            last_node = last_node.next
        last_node.next = new_node

    def print_list(self):
        current = self.head
        while current:
            print(current.value,end="->")
            current = current.next
        print("None")

    def reverse(self):
        prev = None
        current = self.head
        while current:
            new_node = current.next
            current.next = prev
            prev = current
            current = new_node
        self.head = prev

ll=Linked_List()
ll.append(10)
ll.append(20)
ll.append(30)
ll.append(40)

print("Original linked list ")
ll.print_list()

ll.reverse()
print("Reversed Linked list")

ll.print_list()
    

