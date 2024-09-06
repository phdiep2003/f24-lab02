import { newRenderer } from "./renderer.js"
import { square } from "./shapes/square.js";
// import { newRectangle, Rectangle } from "./shapes/rectangle.js";

const Square: Shape = square(3)
const renderer = newRenderer(Square)
renderer.draw();