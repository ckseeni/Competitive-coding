Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] h = new int[n+1];
    int[] l = new int[n+1];
    // keep on the stack current height and length (how long is until next different height)
    long max = 0;
    int count = 1;
    for (int i=1; i<=n; i++) {
        int b = in.nextInt();
        // if new height 'b' is higher from the last height on stack, put new height on stack with length = 1
        if (b > h[count-1]) {
            h[count] = b;
            l[count] = 1;
            count++;
        } else {
            // if new height 'b' is equal or smaller than last height on stack, prepare cumulative length 'c' for all height on stack that are smaller and check if current rectangle with cumulative length is bigger than max
            int c = 0;
            while (count > 1 && h[count-1] >= b) {
                count--;
                c += l[count];
                if (h[count] * c > max) {
                    max = h[count] * c;
                }
            }
            // add on stack current height with cumulative length 'c' increased by 1
            h[count] = b;
            l[count] = c+1;
            count++;
        }
    }
    // repeat the proces of removing all heights from stack and checking their area against max respectively
    int c = 0;
    while (count > 1) {
        count--;
        c += l[count];
        if (h[count] * c > max) {
            max = h[count] * c;
        }
    }
    System.out.println(max);
