package ch.neeman.guy.sudokuapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/sudoku")
@CrossOrigin("*")
public class Controller {

    private final SudokuApiApplication sudokuApiApplication;

    @Autowired
    public Controller(SudokuApiApplication sudokuApiApplication) {
        this.sudokuApiApplication = sudokuApiApplication;
    }

    @GetMapping("/create/{difficulty}")
    public int[] createMessage(@PathVariable String difficulty) {
        SudokuGenerator cr = new SudokuGenerator();
        int[] field = SudokuGenerator.generate(difficulty);
        return field;
    }
}
