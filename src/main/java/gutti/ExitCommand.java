package gutti;

/**
 * Represents a command to exit the application.
 */
public class ExitCommand extends Command {

    /**
     * Executes the ExitCommand. No operation is performed.
     *
     * @param tasks   The TaskList containing all tasks.
     * @param ui      The UI object to handle user interactions.
     * @param storage The Storage object to handle saving tasks to a file.
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        return "Bye. Hope to see you again soon! Meow";
    }

    /**
     * Returns boolean on whether this command should terminate the application.
     *
     * @return true if the command is an exit command, false otherwise.
     */
    @Override
    public boolean isExit() {
        return true;
    }
}
