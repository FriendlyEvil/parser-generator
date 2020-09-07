package actions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GoTo implements Action {
    private static final String template = "new GoTo(%d)";

    private int to;

    @Override
    public String generateNewObject() {
        return String.format(template, to);
    }
}
