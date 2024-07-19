class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def delete_node(head, node_value):
    if not head:
        return None

    if head.data == node_value:
        return head.next

    prev = None
    current = head
    while current and current.data != node_value:
        prev = current
        current = current.next

    if current:
        prev.next = current.next

    return head

def print_list(head):
    temp = head
    while temp:
        print(temp.data, end=" ")
        temp = temp.next
    print()

elements = list(map(int, input("Enter elements separated by commas: ").split(',')))
node_value = int(input("Enter the node value to delete: "))

head = Node(elements[0])
temp = head
for element in elements[1:]:
    temp.next = Node(element)
    temp = temp.next

head = delete_node(head, node_value)
print_list(head)
