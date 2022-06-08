module ru.gb.networkchat {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.networkchat to javafx.fxml;
    exports ru.gb.networkchat;
}