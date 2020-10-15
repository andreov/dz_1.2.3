fun main(){
    val currentAmount = 1000.0
    val prevAmount = 100
    val discountMin = 100.0
    val discountMax = currentAmount*5/100
    val isDiscountSuper = true
    val result=if(prevAmount in 1001..10_000){
                          println("Скидка: $discountMin руб.")
                          currentAmount-discountMin

                      }else if(prevAmount>=10_001){
                               println("Скидка: $discountMax")
                               currentAmount-discountMax
                      } else {
                              println("Скидки нет")
                              currentAmount
                      }

    val discountSuper=result/100
    val resultSuper = result-discountSuper
    if(isDiscountSuper) println("Скидка для меломана $discountSuper \n" + "Общая сумма покупки для меломана: $resultSuper руб.")
    else println("Общая сумма покупки: $result руб.")


}

