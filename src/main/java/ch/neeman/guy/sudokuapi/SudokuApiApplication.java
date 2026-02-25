package ch.neeman.guy.sudokuapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SudokuApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SudokuApiApplication.class, args);
        SudokuGenerator cr = new SudokuGenerator();
        SudokuGenerator.generate();
    }

}
