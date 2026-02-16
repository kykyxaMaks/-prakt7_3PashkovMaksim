import kotlin.math.*
fun main()
{
    try
    {
        println("Введите X")
        val x = readLine()!!.toDouble()
        println("Введите целое число K")
        val k = readLine()!!.toInt()
        println("Введите целое число M")
        val m = readLine()!!.toInt()
        println("Введите целое число N")
        val n = readLine()!!.toInt()


        var y = when
        {
            m == max(k,n) -> sin(abs(x))/(x*x);
            m == min(k,n) -> sin(abs(x))/((x*x)+1);
            else -> -1.0

        }

        println("y(x)= $y")




    }catch(e:NumberFormatException)
    {
        println("Ошибка")
    }
}