package io.keerushar.springtutorials.datasource

import io.keerushar.springtutorials.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>

    fun retrieveBank(accountNumber: String): Bank
}