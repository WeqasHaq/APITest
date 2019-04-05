

Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: this is a positve scenario for "6W"
  			Given a travelDocumentType exists with an travelDocumentTypeCode of "6W"
        When a user retrieves the travelDocumentType code by travelDocumentTypeCode
        Then the status code is <200>
        And response includes the following this
    	| data.travelDocumentType[0].travelDocumentTypeCode       | 		        6W        	  |
    	| data.travelDocumentType[0].countryRequiredInd           |  													|
    	| data.travelDocumentType[0].defaultCountryISoCode   			|			        						  |
    	
  