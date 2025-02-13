package enums;

public enum Item {
    LIGHTING("электрическое освещение"),
    TV("телевизор"),
    GRAMMAR_AND_ALGEBRA("грамматика и арифметика"),
    TASKS("задачки"),
    PROMISES("обещания"),
    PHONE("телефон");

    private final String text;

    Item(String text) {
        this.text = text;
    }


    public String getText() {
        return this.text;
    }
}
