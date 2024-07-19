def print_pattern(char):
    char = char.upper()
    if not 'A' <= char <= 'Z':
        print("Invalid character. Please enter a character from A to Z.")
        return
    
    n = ord(char) - ord('A') + 1

    for i in range(n):
        for j in range(i + 1):
            print(chr(ord('A') + j), end=' ')
        print()

char = input("Enter a character (A-Z): ")
print_pattern(char)
