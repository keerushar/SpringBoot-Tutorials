package io.keerushar.springtutorials.datasource.mock

import io.keerushar.springtutorials.datasource.BankDataSource
import io.keerushar.springtutorials.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("1234", 12.0, 45),
        Bank("5678", 42.0, 12),
        Bank("2054", 92.0, 90),
        Bank("4523", 16.0, 67),
        Bank("6548", 78.0, 34),
    )

    override fun retrieveBanks(): Collection<Bank> {
        return banks
    }

    override fun retrieveBank(accountNumber: String): Bank =
        banks.firstOrNull() { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")
}