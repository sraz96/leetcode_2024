class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def is_valid_bst(root):
    def validate(node, low=float('-inf'), high=float('inf')):
        if not node:
            return True
        
        if node.val <= low or node.val >= high:
            return False
        
        return (validate(node.left, low, node.val) and 
                validate(node.right, node.val, high))
    
    return validate(root)

# Example usage
if __name__ == "__main__":
    # Valid BST
    root1 = TreeNode(5)
    root1.left = TreeNode(3)
    root1.right = TreeNode(7)
    root1.left.left = TreeNode(1)
    root1.left.right = TreeNode(4)
    root1.right.left = TreeNode(6)
    root1.right.right = TreeNode(8)

    print("Is the first tree a valid BST?", is_valid_bst(root1))

    # Invalid BST
    root2 = TreeNode(5)
    root2.left = TreeNode(3)
    root2.right = TreeNode(7)
    root2.left.left = TreeNode(1)
    root2.left.right = TreeNode(6)  # This violates BST property
    root2.right.left = TreeNode(4)
    root2.right.right = TreeNode(8)

    print("Is the second tree a valid BST?", is_valid_bst(root2))