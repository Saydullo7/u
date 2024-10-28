import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

fun main() {
    // Tug'ilgan kuningizni kiriting (YYYY-MM-DD formatida)
    println("Tug'ilgan kuningizni kiriting (YYYY-MM-DD): ")
    val input = readLine() ?: return
//readLine() funksiyasi Kotlin dasturlash tilida foydalanuvchidan terminal yoki konsol orqali ma'lumot kiritish uchun ishlatiladi
// . Bu funksiya foydalanuvchidan bir qator (string) ma'lumotni oladi va kiritilgan qiymatni qaytaradi.
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    val birthDate = LocalDate.parse(input, formatter)
    val currentDate = LocalDate.now()

    // Yil va kunlarni hisoblash
    val years = ChronoUnit.YEARS.between(birthDate, currentDate)
    val days = ChronoUnit.DAYS.between(birthDate, currentDate)

    // Natijalarni chiqarish
    println("Tug'ilgan kun: $birthDate")
    println("Hozirgi kun: $currentDate")
    println("Yillar: $years, Kunlar: $days")
}
