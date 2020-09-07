package actions;

import lombok.AllArgsConstructor;
import lombok.Data;
import doman.rule.ProductionRule;

@Data
@AllArgsConstructor
public class Reduce implements Action {
    private static final String template = "new Reduce(\"%s\", %s)";

    private String action;
    private ProductionRule rule;

    @Override
    public String generateNewObject() {
        return String.format(template, action, rule.generateNewObject());
    }
}
