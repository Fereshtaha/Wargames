module Wargames {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    opens no.ntnu.idatx2001.oblig3.wargames to javafx.fxml;


    exports no.ntnu.idatx2001.oblig3.wargames;
    exports no.ntnu.idatx2001.oblig3.wargames.controller;
    opens no.ntnu.idatx2001.oblig3.wargames.controller to javafx.fxml;
}