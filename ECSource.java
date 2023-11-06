class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    // todo
    var value = head.val;

    while(head != null){
      if (head.val != value){
        return false;
      }
      head = head.next;
    }
    return true;
  }
  public static <T> boolean recursiveIsUnivalueList(Node<T> head) {
    return null;
  }

  public static void main(String[] args) {
        Node<String> z = new Node<>("z");
        // z

        // Printing solution
        System.out.println((ECSource.isUnivalueList(z)));

        Node<Integer> u = new Node<>(2);
        Node<Integer> v = new Node<>(2);
        Node<Integer> w = new Node<>(3);
        Node<Integer> x = new Node<>(3);
        Node<Integer> y = new Node<>(2);
        
        u.next = v;
        v.next = w;
        w.next = x;
        x.next = y;
        
        // 2 -> 2 -> 3 -> 3 -> 2
        
        System.out.println(ECSource.isUnivalueList(u));; // false
    }
}
