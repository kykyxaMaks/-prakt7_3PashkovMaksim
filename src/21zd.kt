import kotlin.math.sqrt

fun main()
{
    try
    {
        println("Введите диагональ")
        val d = readLine()!!.toDouble()

        println("Введите большую сторону")
        val a = readLine()!!.toDouble()

        if (d<=a)
        {
            println("Диаголналь не должна быть меньше стороны")
        }

        val b = sqrt(d*d-a*a)
        val s = a*b

        println("Площадь = $s")
        println("Меньшая сторона = $b")

    }catch(e:NumberFormatException)
    {
        println("Ошибка")
    }
}