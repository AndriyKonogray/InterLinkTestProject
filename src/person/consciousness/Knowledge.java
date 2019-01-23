package person.consciousness;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Knowledge {
    private static final int MAX_GRADE=100;
    private static final int LOW_GRADE=0;
    private boolean levelIsUpperIntermediate=false;
    private int grade;

    public Knowledge(int level) {
        if (level>MAX_GRADE || level<LOW_GRADE) level=LOW_GRADE;
        if (level>=75) levelIsUpperIntermediate=true;
        setGrade(level);
    }
}
