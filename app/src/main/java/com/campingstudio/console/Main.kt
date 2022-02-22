val AtmMMapAccounts: MutableMap<String, Int> = mutableMapOf(
    "0001" to 100,
    "0002" to 100,
    "0003" to 100)

val AtmMMapAccountsReport: Map<String, Int> = AtmMMapAccounts

fun extractMoney(accountId: String,cash: Int) {
    if (AtmMMapAccounts.containsKey(accountId)) {
        println("Extract money $accountId...")
        AtmMMapAccounts[accountId] = AtmMMapAccounts.getValue(accountId) - cash
    } else {
        println("Error: not exist account (id: $accountId)")
    }
}

fun accountsReport() {
    println("Account balance report:")
    AtmMMapAccountsReport.forEach { (k, v) -> println("ID $k: credit $v")}
}

fun main() {
    accountsReport()
    extractMoney("0001",28)
    extractMoney("0009",50)
    extractMoney("0002",50)
    extractMoney("0005",50)
    accountsReport()
}