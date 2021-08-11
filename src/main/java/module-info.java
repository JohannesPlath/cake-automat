/**
 * jupp
 */
module automat {
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.graphics;


  opens automat to javafx.fxml;
  exports automat;

  exports automat.modules.logging;
  opens automat.modules.logging to javafx.fxml;

  exports automat.modules.manufacturer;
  opens automat.modules.manufacturer to javafx.fxml;

  exports automat.modules.products;
  opens automat.modules.products to javafx.fxml;

  exports automat.core.eventbus.generic;
  opens automat.core.eventbus.generic to javafx.fxml;
}