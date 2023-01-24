package example.example8;

public class TypeErasure {

    public class Node<T> {

        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }
    }

    /*
    changes made by java compiler -> type erasure

    public class Node {

        private Object data;
        private Node next;

         public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

          public Object getData() {
            return data;
        }
    }
     */
}
