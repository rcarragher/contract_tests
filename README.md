Introduction
============

This repo serves to demonstrate the concept of double-sided contract tests.  There are three projects here:

* api, which is the "producer"
* client, which is the "consumer"
* contracts, which specifies the contract between the two

You need to have gradle installed in order to get this working.

Running The Contracts
---------------------

* Build everything and run tests using: `gradle build`
* Run up the api server using `gradle api:run`. This starts up DropWizard on port 8080.
* Run the client against the api using `gradle client:run`

To-Do
-----

The contract test at the moment doesn't actually call the service, as an integration test.  The makeRequest method in the
contract test returns a mocked up String, which is helpful for getting started, but it's not actually a contract test. Ideally,
i'd say `gradle contracts:run` and it'd start up the server and run the contracts against it, but my gradle skills are terrible.
This little project was interesting to me. I've been working on a Java codebase that uses maven, and I wanted to try gradle
as an alternative. It seems significantly easier to use, but still has a learning curve.