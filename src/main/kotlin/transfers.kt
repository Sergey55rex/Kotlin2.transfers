fun main() {
    val amount = 1000011
    val rateCommission = 0.0075
    val minCommission = 3500

    val commission:Int = (amount * rateCommission).toInt()

    val result = if (commission < minCommission) minCommission else commission

    println("сумма комиссии:  $result копеек ")
}


