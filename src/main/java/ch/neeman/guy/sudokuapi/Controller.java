package ch.neeman.guy.sudokuapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/sudoku")
@CrossOrigin("*")
public class Controller {

    private final SudokuApiApplication sudokuApiApplication;

    @Autowired
    public Controller(SudokuApiApplication sudokuApiApplication) {
        this.sudokuApiApplication = sudokuApiApplication;
    }

    @GetMapping("/sudoku")
    public ResponseEntity<String> createMessage(@RequestBody Map<String, String> request) {
        System.out.println("Hello World");
        return null;
    }
}
