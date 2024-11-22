module htl.steyr.rockpaperscissor_ykologlu_lzeka {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens htl.steyr.rockpaperscissor_ykologlu_lzeka to javafx.fxml;
    exports htl.steyr.rockpaperscissor_ykologlu_lzeka;
}