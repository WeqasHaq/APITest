package stepDefinition;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CarrierCodeDefinitions {

	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	private String GRAPHQL_ENDPOINT = "http://35.172.0.90:8080/graphql";
	private String QUERYCarrierCode = "{carrierCode(carrierCode:\"%s\"){carrierCode,carrierName,activeInd,carrierAirPrefixCode, carrierCode,censusCarrirerAbbrCode, csiCountryIsoCode,ctpatInd,iataInd,inbondPrefixCode,motCode,nvoccInd,partyAceId,pprlsParticipantInd}}";

	@Given("a carrier code exists with an carrier code of {string}")
	public void a_carrier_code_exists_with_an_carrier_code(String carrierCode) {
		String query = String.format(QUERYCarrierCode, carrierCode);
		System.out.println(query);
		request = given().param("query", query);
		System.out.println(request.log().all());

	}

	@When("a user retrieves the carrier code by carrier code")
	public void a_user_retrieves_the_carrier_code_by_carrier_code() {
		response = request.when().get(GRAPHQL_ENDPOINT);
		System.out.println("response 1: " + response.prettyPrint());
	}

	@Then("the status code is <{int}>")
	public void verify_status_code(Integer statusCode) {
		json = response.then().assertThat().statusCode(statusCode);
	}

	/**
	 * asserts on json fields with single values
	 */
	@Then("response includes the following")
	public void response_equals(io.cucumber.datatable.DataTable data) {
		
		
		
		
		
		Map<String, String> responseFields = data.asMap(String.class, String.class);
		for (Map.Entry<String, String> field : responseFields.entrySet()) {
			if (StringUtils.isNumeric(field.getValue())) {
				json.body(field.getKey(), equalTo(field.getValue()));
				/* equalTo(Integer.parseInt(field.getValue()))); */

			} else if ("true".equals(field.getValue()) || "false".equals(field.getValue())) {
				json.body(field.getKey(), equalTo(Boolean.valueOf(field.getValue())));
			} else if (StringUtils.isEmpty(field.getValue())) {
				json.body(field.getKey(), equalTo(null));
			} else {
				json.body(field.getKey(), equalTo(field.getValue()));
			}
		}
	}

	@Then("response includes the following this")
	public void response_includes_the_following_this(io.cucumber.datatable.DataTable data) {
		Map<String, String> responseFields = data.asMap(String.class, String.class);
		for (Map.Entry<String, String> field : responseFields.entrySet()) {
			if (StringUtils.isNumeric(field.getValue())) {
				json.body(field.getKey(), equalTo(field.getValue()));
				/* equalTo(Integer.parseInt(field.getValue()))); */

			} else if ("true".equals(field.getValue()) || "false".equals(field.getValue())) {
				json.body(field.getKey(), equalTo(Boolean.valueOf(field.getValue())));
			} else if (StringUtils.isEmpty(field.getValue())) {
				json.body(field.getKey(), equalTo(null));
			} else {
				json.body(field.getKey(), equalTo(field.getValue()));
			}
		}
	}
		
	private String QUERYtravelDocumentType = "{travelDocumentType(travelDocumentTypeCode:\"%s\"){travelDocumentTypeCode,countryRequiredInd,defaultCountryISoCode,description,edifactTravelDocTypeCode,partyIdQualifierCode,stateRequiredInd,whtiDocumentInd}}";

		@Given("a travelDocumentType exists with an travelDocumentTypeCode of {string}")
		public void a_travelDocumentType_exists_with_an_travelDocumentTypeCode_of(String travelDocumentTypeCode) {
			String query = String.format(QUERYtravelDocumentType, travelDocumentTypeCode);
			System.out.println(query);
			request = given().param("query", query);
			System.out.println(request.log().all());
		  
		}

		@When("a user retrieves the travelDocumentType code by travelDocumentTypeCode")
		public void a_user_retrieves_the_travelDocumentType_code_by_travelDocumentTypeCode() {
			response = request.when().get(GRAPHQL_ENDPOINT);
			System.out.println("response 1: " + response.prettyPrint());
		   
		}
	
}
