import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
fun main() {



        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

        // Hozirgi vaqtni olish
        val hozirgiVaqt = LocalDateTime.now()
        println("Hozirgi vaqt: ${hozirgiVaqt.format(formatter)}")

        // Yangi yilga qadar kunlarni hisoblash
        val yangiYil = LocalDateTime.of(hozirgiVaqt.year + 1, 1, 1, 0, 0)
        val kunlarQolgani = java.time.temporal.ChronoUnit.DAYS.between(hozirgiVaqt.toLocalDate(), yangiYil.toLocalDate())

        // Natijani chiqarish
        println("Yangi yilgacha $kunlarQolgani kun qoldi.")

        // Avtomatik ro'yxatdan o'tish vaqti
        val royhatdanOtishVaqti = saqlashVaqti(hozirgiVaqt)
        println("Ro'yxatdan o'tish vaqti: ${royhatdanOtishVaqti.format(formatter)}")
    }

    // Avtomatik ro'yxatdan o'tish vaqti saqlovchi funksiya
    fun saqlashVaqti(vaqt: LocalDateTime): LocalDateTime {
        // Bu yerda qo'shimcha logika yoki ma'lumotlar bazasiga saqlash imkoniyatlari kiritilishi mumkin
        return vaqt
    }

