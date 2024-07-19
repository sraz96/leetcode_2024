class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def print_nth_node(head, node_value, n):
    temp = head
    while temp.data != node_value:
        temp = temp.next

    for _ in range(n):
        temp = temp.next

    return temp.data

elements = list(map(int, input("Enter elements separated by commas: ").split(',')))
node_value = int(input("Enter the node value: "))
n = int(input("Enter the value of n: "))

head = Node(elements[0])
temp = head
for element in elements[1:]:
    temp.next = Node(element)
    temp = temp.next
temp.next = head

print(print_nth_node(head, node_value, n))
