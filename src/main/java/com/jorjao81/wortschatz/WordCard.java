package com.jorjao81.wortschatz;

public class WordCard {
    private String source;
    private String target;


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public boolean verify(String answer) {
        return answer.equals(target);
    }
}
