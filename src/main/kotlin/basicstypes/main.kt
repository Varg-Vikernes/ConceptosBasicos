package basicstypes

import Clases.Course
import Clases.University

fun main () {
val materia1: Course = Course();
val materia2: Course = Course(
    1,
    "Desarrollo Movil",
    "Jorge");
val universidad: University = University();
val universidad1: University = University(
    1,
    "Pepito",
    "Microsoft"
)    ;
println(materia1)
    println(materia2);
println(universidad);
    println(universidad1);
}