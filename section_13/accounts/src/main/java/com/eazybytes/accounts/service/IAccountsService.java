package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * Create a new account.
     *
     * @param customerDto - CustomerDto object
     */
    void createAccount(CustomerDto customerDto);

    /**
     * Fetch a customer's account details.
     *
     * @param mobileNumber - Mobile number of the customer
     * @return CustomerDto object containing the account details
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * Update an existing account.
     *
     * @param customerDto - CustomerDto object
     * @return boolean indicating success of the operation
     */
    boolean updateAccount(CustomerDto  customerDto);

    /**
     * Delete an existing account.
     *
     * @param mobileNumber - Mobile number of the customer whose account is to be deleted
     * @return boolean indicating success of the operation
     */
    boolean deleteAccount(String mobileNumber);

    /**
     * Update the communication status of an account.
     * @param accountNumber
     * @return
     */
    boolean updateCommunicationStatus(Long accountNumber);
}
