package lambda

fun main() : Unit{
    val simpleSumLambda: (Int) -> Int = { x: Int -> x + x };
    val resultSimpleSumLambda: Int = simpleSumLambda(5);

    println("Result of simpleLambda, parameter : 5 = $resultSimpleSumLambda");

    val sumLambda : (Int,Int) -> Int = {x:Int , y:Int -> x+y  };
    val resultSumLambda : Int  = sumLambda(5,10);
    println("Result sum lambda 5 , 10 = $resultSumLambda");
}