package doman.rule;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class StartRule {
    @Getter
    private final Rule rule;
    @Getter
    private final String returnType;
    @Getter
    private final String code;
}
