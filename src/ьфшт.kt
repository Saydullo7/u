import kotlin.system.measureTimeMillis

fun main() {
    println("Tugma bosish o'yiniga xush kelibsiz!")
    println("10 soniya davomida tugmani bosing!")

    var hisob = 0
    val vaqt = measureTimeMillis {
        /*

measureTimeMillis bu funksiyasi Kotlin tilida vaqtni o'lchash uchun ishlatiladi. U berilgan kodni bajarish uchun qancha vaqt kerakligini millisekundlarda qaytaradi.

readLine() funksiyasi Kotlin dasturlash tilida foydalanuvchidan terminal yoki konsol orqali ma'lumot kiritish uchun ishlatiladi. Bu funksiya foydalanuvchidan bir qator (string) ma'lumotni oladi va kiritilgan qiymatni qaytaradi.
      */

        while (true) {
            println("Tugmani bosing (Enter)!")

            readLine()
            hisob++
            println("Siz hozirda $hisob marta tugmani bosdingiz.")
        }
    }

    println("O'yin tugadi! Siz $hisob marta tugmani bosdingiz.")
}



