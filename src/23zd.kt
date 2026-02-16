import kotlin.math.sqrt

fun main()
{
    try
    {
        println("Введите номер рисунка")
        val a = readLine()!!.toInt()
        if (a<0 && a>4)
        {
            println("Рисунки от 1 до 4")
        }

        var f = false
        println("Введите x")
        val x = readLine()!!.toDouble()
        println("Введите y")
        val y = readLine()!!.toDouble()


        if (a==1)
        {
            when
            {
                x>=-3&&x<=0 ->f = y>=-x-1&&y<=x+1
                x>=0&&x<=1->f = y>=x-1&&y<=-x+1
            }
        }
        if (a==2)
        {
            when
            {
               x>=-1&&x<=1->{
                   when {
                       y>=0&&y<=1->f=y<=-x+1&&y<=x+1
                       y>=-2&&y<=0->f = true
                   }
               }
            }
        }
        if (a==3)
        {
            when {
                x >= -1 && x <= 1 -> {
                    when {
                        y >= 0 && y <= 2 -> f = true
                        y >= -1 && y <= 0 -> f= sqrt(x * x + (y + 1) * (y + 1)) <= 1
                    }
                }
            }
        }
        if (a==4)
        {  when
            {
                (-2.0 <= x && x <= 1.0) && (0.0 <= y && y <= 1.0) -> {
                    val a1x = -2.0; val a1y = 0.0
                    val b1x = 1.0; val b1y = 0.0
                    val c1x = 0.0; val c1y = 1.0
                    val d1 = (b1y - c1y) * (a1x - c1x) + (c1x - b1x) * (a1y - c1y)
                    val wa1 = ((b1y - c1y) * (x - c1x) + (c1x - b1x) * (y - c1y)) / d1
                    val wb1 = ((c1y - a1y) * (x - c1x) + (a1x - c1x) * (y - c1y)) / d1
                    val wc1 = 1 - wa1 - wb1
                        when
                        {
                            wa1 >= 0 && wb1 >= 0 && wc1 >= 0 -> {
                            f = true
                            }
                        }
                    }
                    (-2.0 <= x && x <= 1.0) && (-2.0 <= y && y <= 0.0) -> {
                    val a2x = -2.0; val a2y = 0.0
                    val b2x = 1.0; val b2y = 0.0
                    val c2x = 0.0; val c2y = -2.0
                    val d2 = (b2y - c2y) * (a2x - c2x) + (c2x - b2x) * (a2y - c2y)
                    val wa2 = ((b2y - c2y) * (x - c2x) + (c2x - b2x) * (y - c2y)) / d2
                    val wb2 = ((c2y - a2y) * (x - c2x) + (a2x - c2x) * (y - c2y)) / d2
                    val wc2 = 1 - wa2 - wb2
                    when {
                        wa2 >= 0 && wb2 >= 0 && wc2 >= 0 -> {
                            f = true
                        }
                    }
            }
            else -> {
                println("Ошибка")
                return
            }
        }
        }


    when {
        f -> println("Принадлежит")
        !f-> println("Не принадлежит")
    }
}
    catch(e:NumberFormatException)
    {
        println("Ошибка")
    }
}