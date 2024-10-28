import java.time.LocalDate
import java.time.format.DateTimeFormatter
fun main() {

//ofPattern — bu DateTimeFormatter klassining metodidir, va u sanalarni formatlash uchun
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

    // Hozirgi vaqtni olish
    val hozirgiVaqt = LocalDate.now()
    println("Hozirgi vaqt: ${hozirgiVaqt.format(formatter)}")

    // Yangi yilga qadar kunlarni hisoblash
    val yangiYil = LocalDate.of(hozirgiVaqt.year + 1, 1, 1)
    val kunlarQolgani = java.time.temporal.ChronoUnit.DAYS.between(hozirgiVaqt, yangiYil)

    // Natijani chiqarish
    println("Yangi yilgacha $kunlarQolgani kun qoldi.")
}