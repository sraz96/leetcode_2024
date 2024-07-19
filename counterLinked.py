class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def count_elements(head):
    count_dict = {}
    temp = head
    while temp:
        if temp.data in count_dict:
            count_dict[temp.data] += 1
        else:
            count_dict[temp.data] = 1
        temp = temp.next
    return count_dict

def print_count(count_dict):
    result = []
    for key, value in count_dict.items():
        result.append(f"{key}({value})")
    print(", ".join(result))



def create_linked_list(elements):
    head = Node(elements[0])
    temp = head
    for element in elements[1:]:
        temp.next = Node(element)
        temp = temp.next
    return head

elements = list(map(int, input("Enter elements separated by commas: ").split(',')))

head = create_linked_list(elements)

count_dict = count_elements(head)
print_count(count_dict)
