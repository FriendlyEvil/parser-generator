package actions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Shift implements Action {
    private static final String template = "new Shift(%d)";

    private int to;

    @Override
    public String generateNewObject() {
        return String.format(template, to);
    }
}
