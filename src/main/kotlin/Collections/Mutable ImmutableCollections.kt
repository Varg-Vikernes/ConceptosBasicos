package Collections

fun main() : Unit {
    val inmutableList : List<String> = listOf("Hello", "world");
    println(inmutableList.joinToString(" "));

    val mutableList : MutableList<String>  = inmutableList.toMutableList();
    mutableList.add("UTVT!!!");
    println(mutableList.joinToString  (" "));
}