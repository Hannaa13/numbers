import java.util.Arrays;

public class Paint {

    public void allNumb(String a) throws NullPointerException {
        char[] charArray = a.toCharArray();
        int[] numb = new int[charArray.length];
        if (!isNumber(a)) {
            System.out.println("Попробуйте еще раз");
            System.exit(0);
        }   else {
            for (int i = 0; i < charArray.length; i++) {
                numb[i] = Integer.parseInt(String.valueOf(charArray[i]));
            }
        }

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
            if (numb.length == 1)
                all = first;
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
            write(all);

        }



        private  boolean isNumber(String str) {
            return str.matches("-?\\d+");
        }


    private void write(String[][] all) {
        for (int i = 0; i < all.length; i++) {
            for (int j = 0; j < all[i].length ; j++) {
                System.out.print(all[i][j] + " ");
            }
            System.out.println();

        }
    }



    private String[][] concatArrays(String[][] array1, String[][] array2) {

        String[][] concat = new String[array1.length][];
        for (int i = 0; i < array1.length; i++) {
            concat[i] = join(array1[i], array2[i]);
        }
        return concat;
    }

    private String[] join(String[] array1, String[] array2) {
        String[] array1and2 = new String[array1.length + array2.length];
        System.arraycopy(array1, 0, array1and2, 0, array1.length);
        System.arraycopy(array2, 0, array1and2, array1.length, array2.length);
        return array1and2;
    }
}











