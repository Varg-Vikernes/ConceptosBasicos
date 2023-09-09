fun main () {
   //if else
    val a = 4;
    val b = 2;

    var max = a ;
    if (a<b) max = b;

    print("resultado de la primera condicion : $max");

    var result = if (a > b){
        max =a;
    } else {
        max = b;
    }
    print("resultado de la segunda condicion : $result");

    val number = -50;
    val result2 = if(number > 0 ){
        "positive number"
    } else {
        "negative number"
    }

    print("resultado de la  tercera condicion : $result2");


    val result3 = if (a > b ){
        println("$a es mayor que  $b")
    } else {
        println("$a es menor o igual  que $b")
    }
    println("Resultado de la cuarta condicion : $result3");

    when (b){
        1 -> println("b == 1");
        2 -> println("b == 2");
        3 -> println("b =< 1");
        4 -> println("b => 2");
        else ->{
            println("b no es 1 o 2");
        }
    }
}