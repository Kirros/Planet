/**
 * Script governing planet view. Requires webGLUtil.js to work
 *
 * Created by Kirros on 10. 10. 2015.
 */

var planetObject = {"faces": [
                        {"vertices": [0.0, 1.0, 0.0,-1.0,-1.0, 1.0, 1.0,-1.0, 1.0], "colors": [1.0,0.0,0.0,1.0,0.0,1.0,0.0,1.0,0.0,0.0,1.0,1.0]},
                        {"vertices": [0.0, 1.0, 0.0, 1.0,-1.0, 1.0, 1.0,-1.0,-1.0], "colors": [1.0,0.0,0.0,1.0,0.0,0.0,1.0,1.0,0.0,1.0,0.0,1.0]},
                        {"vertices": [0.0, 1.0, 0.0, 1.0,-1.0,-1.0,-1.0,-1.0,-1.0], "colors": [1.0,0.0,0.0,1.0,0.0,1.0,0.0,1.0,0.0,0.0,1.0,1.0]},
                        {"vertices": [0.0, 1.0, 0.0,-1.0,-1.0,-1.0,-1.0,-1.0, 1.0], "colors": [1.0,0.0,0.0,1.0,0.0,0.0,1.0,1.0,0.0,1.0,0.0,1.0]}
                    ]};

function buildPlanet() {
    var planet = new Object3D();

    planetObject["faces"].forEach(
        function(face) {
            planet.addFace(face["vertices"], face["colors"]);
        }
    );

    return planet;
}

function planetView() {
    var canvas = document.getElementById("planet-view");
    initGL(canvas);
    initObject(buildPlanet());
    initShaders();
    initBuffers();

    gl.clearColor(0.0, 0.0, 0.0, 1.0);
    gl.enable(gl.DEPTH_TEST);

    tick();
}