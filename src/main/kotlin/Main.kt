fun main() {
    val currentAmount = 100.0
    val prevAmount = 10_001
    val discountMin = 100.0
    val discountMax = currentAmount*5/100
    val meloman = true
    var totalPrice:Double = currentAmount
    if (prevAmount>=1001 && prevAmount<=10_000){
        totalPrice-=discountMin
        println("Скидка: $discountMin руб.")
    }else if(meloman && prevAmount>=10_001){
        val discountMeloman=(totalPrice-discountMax)/100
        val discount=discountMeloman+discountMax
        totalPrice-=discount
        println("Скидка для меломана: $discount руб.")
    }else if(prevAmount>=10_001){
        totalPrice-=discountMax
        println("Скидка: $discountMax")
    }

    println("Общая сумма: $totalPrice руб.")

}

