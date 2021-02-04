/**
 * Portable client of ${rootArtifactId} application.
 */
module ${package}.client {

  requires transitive io.github.mmm.ui.api.all;

  requires transitive io.github.mmm.ui.spi.controller;

  requires transitive io.github.mmm.marshall.json;

  requires transitive ${package}.shared;

  provides io.github.mmm.ui.api.controller.UiController with //
      ${package}.client.place.content.ContentController, //
      ${package}.client.place.home.HomeController, //
      ${package}.client.place.navigation.NavigationController, //
      ${package}.client.place.page.PageController, //
      ${package}.client.place.product.ProductController //
  ;

  exports ${package}.client.place.content;
  exports ${package}.client.place.home;
  exports ${package}.client.place.navigation;
  exports ${package}.client.place.page;
  exports ${package}.client.place.product;

}
