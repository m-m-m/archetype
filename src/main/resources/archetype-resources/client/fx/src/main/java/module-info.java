/**
 * Provides ${rootArtifactId} client as JavaFx desktop app.
 */
open module ${package}.client.fx {

  requires transitive io.github.mmm.ui.fx.all;

  requires transitive ${package}.client;

  exports ${package}.client.fx;

}
