package seedu.address.ui;

import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import seedu.address.commons.core.LogsCenter;

/**
 * Controller for an event page
 */
public class EventWindow extends UiPart<Stage> {

    public static final String EVENT_MESSAGE = "Events will be listed here.";

    private static final Logger logger = LogsCenter.getLogger(EventWindow.class);
    private static final String FXML = "EventWindow.fxml";

    @FXML
    private Label eventMessage;

    /**
     * Creates a new EventWindow.
     *
     * @param root Stage to use as the root of the EventWindow.
     */
    public EventWindow(Stage root) {
        super(FXML, root);
        eventMessage.setText(EVENT_MESSAGE);
    }

    /**
     * Creates a new EventWindow.
     */
    public EventWindow() {
        this(new Stage());
    }

    /**
     * Shows the event window.
     * @throws IllegalStateException
     *     <ul>
     *         <li>
     *             if this method is called on a thread other than the JavaFX Application Thread.
     *         </li>
     *         <li>
     *             if this method is called during animation or layout processing.
     *         </li>
     *         <li>
     *             if this method is called on the primary stage.
     *         </li>
     *         <li>
     *             if {@code dialogStage} is already showing.
     *         </li>
     *     </ul>
     */
    public void show() {
        logger.fine("Showing event page.");
        getRoot().show();
        getRoot().centerOnScreen();
    }

    /**
     * Returns true if the event window is currently being shown.
     */
    public boolean isShowing() {
        return getRoot().isShowing();
    }

    /**
     * Hides the event window.
     */
    public void hide() {
        getRoot().hide();
    }

    /**
     * Focuses on the event window.
     */
    public void focus() {
        getRoot().requestFocus();
    }
}

