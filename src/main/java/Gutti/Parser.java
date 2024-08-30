package Gutti;

public class Parser {
    public static Command parse(String commandString) throws GuttiException {
        commandString = commandString.trim();

        if (commandString.startsWith("bye")) {
            return new ExitCommand();
        } else if (commandString.startsWith("list")) {
            return new ListCommand();
        } else if (commandString.startsWith("mark")) {
            if (commandString.length() <= 5) {
                throw new GuttiException("Mark command requires an index.");
            }
            return new MarkCommand(commandString.substring(5).trim());
        } else if (commandString.startsWith("unmark")) {
            if (commandString.length() <= 7) {
                throw new GuttiException("Unmark command requires an index.");
            }
            return new UnmarkCommand(commandString.substring(7).trim());
        } else if (commandString.startsWith("todo")) {
            if (commandString.length() <= 5) {
                throw new GuttiException("Todo command requires a description.");
            }
            return new TodoCommand(commandString.substring(4).trim());
        } else if (commandString.startsWith("deadline")) {
            if (commandString.length() <= 9) {
                throw new GuttiException("Deadline command requires a description and /by date/time.");
            }
            return new DeadlineCommand(commandString.substring(9).trim());
        } else if (commandString.startsWith("event")) {
            if (commandString.length() <= 6) {
                throw new GuttiException("Event command requires a description and /from and /to date/time.");
            }
            return new EventCommand(commandString.substring(6).trim());
        } else if (commandString.startsWith("delete")) {
            if (commandString.length() <= 7) {
                throw new GuttiException("Delete command requires an index.");
            }
            return new DeleteCommand(commandString.substring(7).trim());
        } else if (commandString.startsWith("find")) {
            if (commandString.length() <= 5) {
                throw new GuttiException("Delete command requires an index.");
            }
            return new FindCommand(commandString.substring(4).trim());
        } else {
            throw new GuttiException("Unknown command.");
        }
    }
}