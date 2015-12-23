package org.ricardogarfe.katas;

import java.util.ArrayList;
import java.util.List;

public class ActiveRules {

    List<Rule> activeRuleList = new ArrayList();

    public ActiveRules () {
        activeRuleList.add(new Fizz());
        activeRuleList.add(new Buzz());
    }

    public String applyRules(Integer value) {

        String result = "";

        for (Rule activeRule: activeRuleList) {
            result += activeRule.check(value);
        }
        return result.length() > 0 ? result : String.valueOf(value);
    }
}
