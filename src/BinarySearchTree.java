
record Node(
        int value,
        Node left,
        Node right) {
}

void main() {
    var n1 = new Node(1, null, null);
    var n3 = new Node(3, null, null);
    var n5 = new Node(5, null, null);
    var n7 = new Node(7, null, null);
    var n2 = new Node(2, n1, n3);
    var n6 = new Node(6, n5, n7);
    var n4 = new Node(4, n2, n6);

    IO.println(search(10, n4));
}

boolean search(int value, Node head) {
    if(head == null)
        return false;
    if(head.value == value)
        return true;
    if(value < head.value)
        return search(value, head.left);
    else
        return search(value, head.right);
}
