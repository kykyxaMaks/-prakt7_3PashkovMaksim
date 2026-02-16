import kotlin.math.*

fun main()
{
    try
    {
        println("Введите a")
        val a = readLine()!!.toDouble()
        println("Введите b")
        val  b = readLine()!!.toDouble()
        println("Введите c")
        val  c = readLine()!!.toDouble()

        val res = when
        {
            a == 0.0 && b == 0.0 && c == 0.0 -> println("Множество корней")
            a == 0.0 && b == 0.0 -> println("Нет корней")
            a == 0.0 -> println( "Один корень ${-c/b}")
            else ->
            {
                val d = b*b-4*a*c
                when
                {
                    d<0 -> println("Нет корней")
                    d== 0.0 -> println("Один корень ${-b/(2*a)}")
                    else ->
                    {
                        val  x1 = (-b+ sqrt(d))/(2*a)
                        val x2 = (-b- sqrt(d))/(2*a)
                        println("Два корня x1 = $x1, x2=$x2")
                    }
                }
            }
        }

    }
    catch(e:NumberFormatException)
    {
        println("Ошибка")
    }
}