
Feature: Title of your feature
  I want to use this template for my feature file

Scenario: this is a is for ACWP
  Given a carrier code exists with an carrier code of "ACWP"
        When a user retrieves the carrier code by carrier code
        Then the status code is <200>
        And response includes the following
    	| data.carrierCode[0].carrierCode             | ACWP		                          |
    	| data.carrierCode[0].carrierName             | ACT II (TWO) TRANSPORTATION INC		|
    	| data.carrierCode[0].activeInd               | false		                          |
    	| data.carrierCode[0].carrierAirPrefixCode    | 		                              |
    	| data.carrierCode[0].censusCarrirerAbbrCode  | 		                              |
    	| data.carrierCode[0].csiCountryIsoCode       | 		                              |
    	| data.carrierCode[0].ctpatInd                | false		                          |
    	| data.carrierCode[0].iataInd                 | false		                          |
    	| data.carrierCode[0].inbondPrefixCode        | 		                              |
    	| data.carrierCode[0].motCode                 |30	                              	|
    	| data.carrierCode[0].nvoccInd                | false		                          |
    	| data.carrierCode[0].partyAceId              | 0000057538		                    |
    	| data.carrierCode[0].pprlsParticipantInd     | false		                          |
    	
Scenario: this is a is for ACRO
  Given a carrier code exists with an carrier code of "ACRO"
        When a user retrieves the carrier code by carrier code
        Then the status code is <200>
        And response includes the following this
    	| data.carrierCode[0].carrierCode             | ACRO		                          |
    	| data.carrierCode[0].carrierName             | ACORN TRANSPORTATION		|
    	| data.carrierCode[0].activeInd               | false		                          |
    	| data.carrierCode[0].carrierAirPrefixCode    | 		                              |
    	| data.carrierCode[0].censusCarrirerAbbrCode  | 		                              |
    	| data.carrierCode[0].csiCountryIsoCode       | 		                              |
    	| data.carrierCode[0].ctpatInd                | false		                          |
    	| data.carrierCode[0].iataInd                 | false		                          |
    	| data.carrierCode[0].inbondPrefixCode        | 		                              |
    	| data.carrierCode[0].motCode                 |	                              	|
    	| data.carrierCode[0].nvoccInd                | false		                          |
    	| data.carrierCode[0].partyAceId              | 0000057450		                    |
    	| data.carrierCode[0].pprlsParticipantInd     | false		                          |
    