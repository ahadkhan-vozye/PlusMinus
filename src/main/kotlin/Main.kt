import java.math.RoundingMode
import java.text.DecimalFormat

fun plusMinus(arr: Array<Int>) {
    val positive = arr.filter {
        it > 0
    }.size.toFloat()
    val negative = arr.filter {
        it < 0
    }.size.toFloat()
    val zero = arr.filter {
        it == 0
    }.size.toFloat()

    val df = DecimalFormat("#.######")
    df.roundingMode = RoundingMode.CEILING

    println("%.6f".format(df.format(positive / arr.size).toFloat()))
    println("%.6f".format(df.format(negative / arr.size).toFloat()))
    println("%.6f".format(df.format(zero / arr.size).toFloat()))
}

fun main() {
    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)
}