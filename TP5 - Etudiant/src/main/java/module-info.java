module sio.tp5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens sio.tp5.Model;
    opens sio.tp5 to javafx.fxml;
    exports sio.tp5;
}