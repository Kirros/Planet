/**
 * Script governing planet view. Requires webGLUtil.js to work
 *
 * Created by Kirros on 10. 10. 2015.
 */

function buildPlanet(planetObject) {
    var planet = new Object3D();

    planetObject["faces"].forEach(
        function(face) {
            planet.addFace(face["vertices"], face["colors"]);
        }
    );

    return planet;
}

function planetView(planetObject) {
    var canvas = document.getElementById("planet-view");
    initGL(canvas);
    initObject(buildPlanet(planetObject));
    initShaders();
    initBuffers(planetObject["polycount"]);

    gl.clearColor(0.0, 0.0, 0.0, 1.0);
    gl.enable(gl.DEPTH_TEST);

    tick();
}