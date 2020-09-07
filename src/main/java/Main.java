import generators.MainGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {
        String str = String.join("\n", Files.readAllLines(Path.of("source/Calculator.dkr")));
        new MainGenerator().generate("src/main/java/generated/", str, "Calculator", "calculator");
    }
}