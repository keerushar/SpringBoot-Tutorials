package io.keerushar.springtutorials.service

import io.keerushar.springtutorials.datasource.BankDataSource
import io.keerushar.springtutorials.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
}