public enum Commands {
    ADD("add"),
    LIST("list"),
    EXIT("exit");

    private String value;

    Commands() {
    }

    Commands(String value) {
        this.value = value;
    }

    public static Commands fetchValue(String constant) {
        for (Commands command : Commands.values()) {
            if (command.value.equals(constant)) {
                return command;
            }
        }
        return null;
    }
}
