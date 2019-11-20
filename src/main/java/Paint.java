

public class Paint {

    public String[][] allNumb(int a) throws NullPointerException {
        int[] numb = Integer.toString(a).chars().map(c -> c - '0').toArray();
        Numbers numbers = new Numbers();
        String[][] first = new String[7][7];
        String[][] all = new String[7][];

        if (numb[0] == 0) {
            first = numbers.zeroArray();
        }
        if (numb[0] == 1) {
            first = numbers.one();
        }
        if (numb[0] == 2) {
            first = numbers.two();
        }
        if (numb[0] == 3) {
            first = numbers.three();
        }
        if (numb[0] == 4) {
            first = numbers.four();
        }
        if (numb[0] == 5) {
            first = numbers.five();
        }
        if (numb[0] == 6) {
            first = numbers.six();
        }
        if (numb[0] == 7) {
            first = numbers.seven();
        }
        if (numb[0] == 8) {
            first = numbers.eight();
        }
        if (numb[0] == 9) {
            first = numbers.nine();
        }
        if (numb.length == 1) return first;
        else {
            for (int i = 1; i < numb.length; i++) {
                if (numb[i] == 0) {
                    all = concatArrays(first, numbers.zeroArray());
                    first = all;
                }
                if (numb[i] == 1) {
                    all = concatArrays(first, numbers.one());
                    first = all;
                }
                if (numb[i] == 2) {
                    all = concatArrays(first, numbers.two());
                    first = all;
                }
                if (numb[i] == 3) {
                    all = concatArrays(first, numbers.three());
                    first = all;
                }
                if (numb[i] == 4) {
                    all = concatArrays(first, numbers.four());
                    first = all;
                }
                if (numb[i] == 5) {
                    all = concatArrays(first, numbers.five());
                    first = all;
                }
                if (numb[i] == 6) {
                    all = concatArrays(first, numbers.six());
                    first = all;
                }
                if (numb[i] == 7) {
                    all = concatArrays(first, numbers.seven());
                    first = all;
                }
                if (numb[i] == 8) {
                    all = concatArrays(first, numbers.eight());
                    first = all;
                }
                if (numb[i] == 9) {
                    all = concatArrays(first, numbers.nine());
                    first = all;
                }

            }
        }

        return all;
    }


    public String[][] concatArrays(String[][] array1, String[][] array2) {

        String[][] concat = new String[array1.length][];
        for (int i = 0; i < array1.length; i++) {
            concat[i] = join(array1[i], array2[i]);
        }
        return concat;
    }

    public String[] join(String[] array1, String[] array2) {
        String[] array1and2 = new String[array1.length + array2.length];
        System.arraycopy(array1, 0, array1and2, 0, array1.length);
        System.arraycopy(array2, 0, array1and2, array1.length, array2.length);
        return array1and2;
    }
}











