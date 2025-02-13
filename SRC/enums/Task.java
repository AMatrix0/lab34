package enums;

public enum Task {
    MAKE_LIGHTING("проводить электрическое освещение"),
    MAKE_PHONE("устроить телефон"),
    MAKE_TV("телевизор"),
    GOT_SMARTER("поумнел"),
    LEARN("учиться читать и писать"),
    READ_GRAMMAR_AND_ALGEBRA("читать всю грамматику и почти всю арифметику"),
    TASKS("задачки"),
    WANT_LEARN_PHYSICS("хотеть изучать физику"),
    PROMISE("наобещает с три короба"),
    THAT_AND_MOUNTAINS("сказал, что сделает то и это, и горы свернёт"),
    WORK_FULLY("работать в полную силу"),
    WANT_LEARN("хотеть учится"),
    DO_ALL_THIS("всё это");

    private final String text;

    Task(String text) {
        this.text = text;
    }


    public String getText() {
        return this.text;
    }
}
