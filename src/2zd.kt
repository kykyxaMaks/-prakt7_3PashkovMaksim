import kotlin.math.sqrt

fun main()
{
    try
    {
        println("Введите высоту с которой будет падать камень")
        val h = readLine()!!.toDouble()

        if (h<0)
        {
            println("Высота не должна быть меньше нуля")
        }
        val g = 9.8

        val t = sqrt((2*h)/g)

        println("Время падения камня с $h метров = $t секунд")

    }catch(e:NumberFormatException)
    {
        println("Ошибка")
    }
}