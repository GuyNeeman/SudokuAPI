package ch.neeman.guy.sudokuapi;

public class SudokuResult {
    public final int[] puzzle;
    public final int[] solution;

    public SudokuResult(int[] puzzle, int[] solution) {
        this.puzzle = puzzle;
        this.solution = solution;
    }
}