

public class Numbers {

    public void allNumb (int[] numberUser) {
        int count = 7;

        for (int k = 0; k < numberUser.length; k++) {

            if (numberUser[k] == 0) {

                for (int i = 0; i < count; i++) {
                    for (int j = 0; j < count; j++) {

                        if (i == 0 || i == count - 1 || j == 0 || j == count - 1) {
                            System.out.print("@");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    System.out.println(" ");
                }
            }
            if (numberUser[k] == 1) {
                for (int i = 0; i < count; i++) {
                    for (int j = 0; j < count; j++) {

                        if ((j == count - 1) || (i == 1 && j == 2) || (i == 2 && j == 0)) {
                            System.out.print("@");
                        } else
                            System.out.print(" ");
                    }
                    System.out.println(" ");

                }
            }

            if (numberUser[k] == 2) {
                for (int i = 0; i < count; i++) {
                    for (int j = 0; j < count; j++) {
                        if ((i == 0) || (i == count - 1) || (j == count - 1 - i)) {
                            System.out.print("@");
                        } else
                            System.out.print(" ");
                    }
                    System.out.println();

                }
            }

            if (numberUser[k] == 3) {
                for (int i = 0; i < count; i++) {
                    for (int j = 0; j < count; j++) {
                        if (i == 0 || i == count - 1 || j == count - 1 || i == count / 2) {
                            System.out.print("@");
                        } else
                            System.out.print(" ");
                    }
                    System.out.println();

                }

            }
            if (numberUser[k] == 4) {
                for (int i = 0; i < count; i++) {
                    for (int j = 0; j < count; j++) {
                        if ((j == count - 1) || (i == count / 2) || (j == 0 && i < count / 2)) {

                            System.out.print("@");
                        } else
                            System.out.print(" ");
                    }
                    System.out.println();

                }
            }

            if (numberUser[k] == 5) {
                for (int i = 0; i < count; i++) {
                    for (int j = 0; j < count; j++) {
                        if ((i == 0) || (i == count / 2) || (j == 0 && i < count / 2) || (j == count - 1 && i > count / 2) || (i == count - 1)) {

                            System.out.print("@");
                        } else
                            System.out.print(" ");
                    }
                    System.out.println();

                }
            }

            if (numberUser[k] == 6) {
                for (int i = 0; i < count; i++) {
                    for (int j = 0; j < count; j++) {
                        if ((i == 0) || (i == count / 2) || (j == 0) || (j == count - 1 && i > count / 2) || (i == count - 1)) {

                            System.out.print("@");
                        } else
                            System.out.print(" ");
                    }
                    System.out.println();

                }
            }

            if (numberUser[k] == 7) {
                for (int i = 0; i < count + 1; i++) {
                    for (int j = 0; j < count; j++) {

                        if ((j == count - 1 - i) || (i == 0)) {
                            System.out.print("@");
                        } else
                            System.out.print(" ");
                    }
                    System.out.println(" ");

                }
            }

            if (numberUser[k] == 8) {
                for (int i = 0; i < count; i++) {
                    for (int j = 0; j < count; j++) {

                        if ((i == 0) || (i == count - 1) || (j == 0) || (j == count - 1) || (i == count / 2)) {
                            System.out.print("@");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }

            }

            if (numberUser[k] == 9) {
                for (int i = 0; i < count; i++) {
                    for (int j = 0; j < count; j++) {

                        if ((i == 0) || (i == count - 1) || (j == 0 && i < count / 2) || (j == count - 1) || (i == count / 2)) {
                            System.out.print("@");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }

            }
        }

    }


}


