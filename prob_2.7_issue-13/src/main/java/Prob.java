public class Prob {


    public static boolean input(Node first) {

        boolean finish = false;
        boolean half = false;

        Node now = first;
        Node runner2x = first;
        while (!finish) {

            if (!half) {
                if (runner2x.next != null) {
                    if (runner2x.next.next != null) {
                        runner2x = runner2x.next.next;
                        now = now.next;
                    } else {
                        // 짝수
                        half = true;
                        runner2x = now.next;
                    }
                } else {
                    // 홀수
                    half = true;
                    runner2x = now.next;
                    now = now.prev;
                }

            } else {

                if (now.value != runner2x.value) {
                    return false;
                } else {
                    now = now.prev;
                    runner2x = runner2x.next;
                    finish = true;

                    if (now == null || runner2x == null) {
                        return true;
                    }
                }
            }
        }
        return true;
    }

    public static class Node {
        Node prev;
        Node next;

        char value;
    }
}
