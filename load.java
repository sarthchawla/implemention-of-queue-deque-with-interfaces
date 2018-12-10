import java.util.Scanner;

class load {
    public static void main(String[] args) {
        Deque<Integer> S = new LinkedQueue<>();// ArrayQueue<>();
        Scanner sc = new Scanner(System.in);
        int e;
        int ch;
        System.out.println("enter 1=ArrayQueue otherwise=LinkedQueue");
        ch = sc.nextInt();
        if (ch == 1)
            S = new ArrayQueue<>();
        System.out.println("Deque using Linked List");
        do {
            System.out.println(
                    "enter 1=addFirst 2=addLast,enqueue 3=reamoveFirst,dequeue 4=removeLast 5=getFirst 6=getLast -1=exit");
            ch = sc.nextInt();
            switch (ch) {
            case 1:
                System.out.println("enter data");
                e = sc.nextInt();
                S.addFirst(e);
                break;
            case 2:
                System.out.println("enter data");
                e = sc.nextInt();
                S.addLast(e);
                break;
            case 3:
                System.out.println(S.removeFirst());
                break;
            case 4:
                System.out.println(S.removeLast());
                break;
            case 5:
                System.out.println(S.getFirst());
                break;
            case 6:
                System.out.println(S.getLast());
                break;
            }
        } while (ch != -1);
        sc.close();
    }
}