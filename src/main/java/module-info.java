module com.trial.trial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.trial.trial to javafx.fxml;
    exports com.trial.trial;
}