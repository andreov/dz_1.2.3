fun main(){
    val currentAmount = 100.0
    val prevAmount = 10001
    val discountMin = 100.0
    val discountMax = currentAmount*5/100
    val isDiscountSuper = true
    val discountSuper=(currentAmount-discountMax)/100+discountMax
    val result=if(prevAmount in 1001..10_000){
                          println("Скидка: $discountMin руб.")
                          currentAmount-discountMin
                      }else if(isDiscountSuper && prevAmount>=10001){
                                 println("Скидка для меломана: $discountSuper руб.")
                                 currentAmount-discountSuper
                      }else if(prevAmount>=10_001){
                               println("Скидка: $discountMax")
                               currentAmount-discountMax
                      } else {
                              println("Скидки нет")
                              currentAmount
                      }

    println("Общая сумма: $result руб.")


}

