module com.hexacode.studenttaskpro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.hexacode.studenttaskpro to javafx.fxml;
    exports com.hexacode.studenttaskpro;
}