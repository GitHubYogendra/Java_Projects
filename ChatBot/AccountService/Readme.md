Account Service
Imagine an interface AccountService that is designed for keeping track of accounts and balances.

It has two abstract methods:
findAccountByOwnerId(long id) takes user id and returns this user account or null in case no account was found;
countAccountsWithBalanceGreaterThan(long balance) returns the number of accounts with a balance exceeding the provided number.

There are also two classes: Account and User, each of them having several fields. The owner field of the Account class is an object of the User type. You can find the details in the provided template.

Your task is to create AccountServiceImpl class that implements AccountService interface and its two methods.
It should have a constructor that takes an Account array which will be used for searching when either of the methods is called.

For example, to find an account by the user id we need to go through all the accounts from this array and compare these accounts owners id with the given id.

Here's an example of how these methods will be called:

Account[] accounts = ...
AccountService service = new AccountServiceImpl(accounts);
service.findAccountByOwnerId(10L); // returns an account where owner id is 10
Note: do not make classes and the interface public.


