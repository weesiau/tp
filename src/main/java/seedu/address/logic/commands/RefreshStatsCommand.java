package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.model.Model;

/**
 * Refreshes Stats panel silently. Gives no feedback to user.
 */
public class RefreshStatsCommand extends Command {
    public static final String COMMAND_WORD = "refreshStats";

    public static final String MESSAGE_SUCCESS = "silently refresh stats";

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
