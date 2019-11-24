
public class Numbers {

    private final int COUNT = 7;

    public String[][] zeroArray() {
        String[][] zero = new String[COUNT][COUNT];
        for (int i = 0; i < COUNT; i++) {
            for (int j = 0; j < COUNT; j++) {

                if (i == 0 || i == COUNT - 1 || j == 0 || j == COUNT - 1) {
                    zero[i][j] = "@";

                } else {
                    zero[i][j] = " ";

                }
            }
        }
        return zero;
    }

    public String[][] one() {
        String[][] one = new String[COUNT][COUNT];
        for (int i = 0; i < COUNT; i++) {
            for (int j = 0; j < COUNT; j++) {

                if ((j == COUNT - 1) || (j == COUNT - 2) || (i == 1 && j == 4) || (i == 2 && j == 3) || (i == 3 && j == 2)) {
                    one[i][j] = "@";
                } else
                    one[i][j] = " ";
            }
        }
        return one;
    }

    public String[][] two() {
        String[][] two = new String[COUNT][COUNT];
        for (int i = 0; i < COUNT; i++) {
            for (int j = 0; j < COUNT; j++) {
                if ((i == 0) || (i == COUNT - 1) || (i == COUNT / 2) || (j == COUNT -1  && i < COUNT / 2) || (j == 0 && i > COUNT / 2) ) {
                    two[i][j] = "@";
                } else
                    two[i][j] = " ";
            }
        }
        return two;
    }

    public String[][] three() {
        String[][] three = new String[COUNT][COUNT];
        for (int i = 0; i < COUNT; i++) {
            for (int j = 0; j < COUNT; j++) {
                if (i == 0 || i == COUNT - 1 || j == COUNT - 1 || i == COUNT / 2) {
                    three[i][j] = "@";
                } else
                    three[i][j] = " ";
            }
        }
        return three;
    }


    public String[][] four() {
        String[][] four = new String[COUNT][COUNT];
        for (int i = 0; i < COUNT; i++) {
            for (int j = 0; j < COUNT; j++) {
                if ((j == COUNT - 1) || (j == COUNT - 2) || (i == COUNT / 2) || (j == 0 && i < COUNT / 2)) {

                    four[i][j] = "@";
                } else
                    four[i][j] = " ";
            }
        }
        return four;
    }

    public String[][] five() {
        String[][] five = new String[COUNT][COUNT];
        for (int i = 0; i < COUNT; i++) {
            for (int j = 0; j < COUNT; j++) {
                if ((i == 0) || (i == COUNT / 2) || (j == 0 && i < COUNT / 2) || (j == COUNT - 1 && i > COUNT / 2) || (i == COUNT - 1)) {

                    five[i][j] = "@";
                } else
                    five[i][j] = " ";
            }
        }
        return five;
    }

    public String[][] six() {
        String[][] six = new String[COUNT][COUNT];
        for (int i = 0; i < COUNT; i++) {
            for (int j = 0; j < COUNT; j++) {
                if ((i == 0) || (i == COUNT / 2) || (j == 0) || (j == COUNT - 1 && i > COUNT / 2) || (i == COUNT - 1)) {

                    six[i][j] = "@";
                } else
                    six[i][j] = " ";
            }
            System.out.println();

        }
        return six;
    }

    public String[][] seven() {
        String[][] seven = new String[COUNT][COUNT];
        for (int i = 0; i < COUNT; i++) {
            for (int j = 0; j < COUNT; j++) {

                if ((j == COUNT - 1 - i) || (i == 0)) {
                    seven[i][j] = "@";
                } else
                    seven[i][j] = " ";
            }
        }
        return seven;
    }

    public String[][] eight() {
        String[][] eight = new String[COUNT][COUNT];
        for (int i = 0; i < COUNT; i++) {
            for (int j = 0; j < COUNT; j++) {

                if ((i == 0) || (i == COUNT - 1) || (j == 0) || (j == COUNT - 1) || (i == COUNT / 2)) {
                    eight[i][j] = "@";
                } else {
                    eight[i][j] = " ";
                }
            }
        }
        return eight;
    }

    public String[][] nine() {
        String[][] nine = new String[COUNT][COUNT];
        for (int i = 0; i < COUNT; i++) {
            for (int j = 0; j < COUNT; j++) {

                if ((i == 0) || (i == COUNT - 1) || (j == 0 && i < COUNT / 2) || (j == COUNT - 1) || (i == COUNT / 2)) {
                    nine[i][j] = "@";
                } else {
                    nine[i][j] = " ";
                }
            }
        }
        return nine;
    }
}
