package seedu.address.ui;

import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import seedu.address.commons.core.LogsCenter;

/**
 * Panel containing the events list.
 */
public class EventPanel extends UiPart<Region> {

    private static final String FXML = "EventPanel.fxml";
    private final Logger logger = LogsCenter.getLogger(EventPanel.class);

    @FXML
    private Label eventMessage;

    /**
     * Creates an EventPanel.
     */
    public EventPanel() {
        super(FXML);
        eventMessage.setText("Events will be listed here.");
    }
}

