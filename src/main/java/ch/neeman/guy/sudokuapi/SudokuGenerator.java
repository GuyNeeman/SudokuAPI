    package ch.neeman.guy.sudokuapi;

    import java.util.Arrays;
    import java.util.Random;

    public class SudokuGenerator {

        private static final Random random = new Random();

        public static int[][] generate() {
            int[][] field = new int[9][9];

            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    field[row][col] = (row * 3 + row / 3 + col) % 9 + 1;
                }
            }

            for (int band = 0; band < 3; band++) {
                shuffleRows(field, band * 3, band * 3 + 2);
            }

            for (int stack = 0; stack < 3; stack++) {
                shuffleCols(field, stack * 3, stack * 3 + 2);
            }

            shuffleRows(field, 0, 8, 3);

            shuffleCols(field, 0, 8, 3);

            System.out.println(Arrays.deepToString(field));
            return field;
        }

        private static void shuffleRows(int[][] field, int start, int end) {
            for (int i = start; i <= end; i++) {
                int j = start + random.nextInt(end - start + 1);
                int[] temp = field[i];
                field[i] = field[j];
                field[j] = temp;
            }
        }

        private static void shuffleRows(int[][] field, int start, int end, int step) {
            for (int i = start; i <= end; i += step) {
                int j = start + (random.nextInt(3) * step);
                for (int k = 0; k < 3; k++) {
                    int[] temp = field[i + k];
                    field[i + k] = field[j + k];
                    field[j + k] = temp;
                }
            }
        }

        private static void shuffleCols(int[][] field, int start, int end) {
            for (int col = start; col <= end; col++) {
                int j = start + random.nextInt(end - start + 1);
                for (int row = 0; row < 9; row++) {
                    int temp = field[row][col];
                    field[row][col] = field[row][j];
                    field[row][j] = temp;
                }
            }
        }

        private static void shuffleCols(int[][] field, int start, int end, int step) {
            for (int col = start; col <= end; col += step) {
                int j = start + (random.nextInt(3) * step);
                for (int k = 0; k < 3; k++) {
                    for (int row = 0; row < 9; row++) {
                        int temp = field[row][col + k];
                        field[row][col + k] = field[row][j + k];
                        field[row][j + k] = temp;
                    }
                }
            }
        }
    }