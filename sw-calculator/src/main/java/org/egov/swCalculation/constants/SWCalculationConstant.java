package org.egov.swCalculation.constants;


import org.egov.swCalculation.model.DemandStatus;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SWCalculationConstant {

	public static final String TAXPERIOD_MASTER_KEY = "TAXPERIOD";
	
	public static final String TAXHEADMASTER_MASTER_KEY = "SW_TAX";
	
	public static final String FINANCIALYEAR_MASTER_KEY = "2019-20";
	
	public static final String FINANCIAL_YEAR_STARTING_DATE = "startingDate";

	public static final String FINANCIAL_YEAR_ENDING_DATE = "endingDate";
	
	public static final String URL_PARAMS_SEPARATER = "?";
	
	public static final String MDMS_ROUNDOFF_TAXHEAD= "SW_ROUNDOFF";
	
	public static final String TENANT_ID_FIELD_FOR_SEARCH_URL = "tenantId=";
	
	public static final String SEPARATER = "&";
	
	public static final String SERVICE_FIELD_FOR_SEARCH_URL = "service=";
	
	public static final String SERVICE_FIELD_VALUE_SW = "SW";
	
	public static final String MDMS_FINACIALYEAR_PATH = "$.MdmsRes.egf-master.FinancialYear[?(@.code==\"{}\")]";
	
	
	public static final String EG_SW_FINANCIAL_MASTER_NOT_FOUND = "EG_SW_FINANCIAL_MASTER_NOT_FOUND";
	
	public static final String EG_SW_FINANCIAL_MASTER_NOT_FOUND_MSG = "No Financial Year data is available for the given year value of : ";
	
	public static final String FINANCIAL_YEAR_MASTER = "FinancialYear";
	
	public static final String FINANCIAL_YEAR_RANGE_FEILD_NAME = "finYearRange";
	
	public static final String FINANCIAL_MODULE = "egf-master";
	
	public static final String SW_TAX_MODULE = "sw-services-calculation";
	
	public static final String SW_REBATE_MASTER = "Rebate";
	
	public static final String SW_SEWERAGE_CESS_MASTER = "SewerageCess";
	
	public static final String SW_PENANLTY_MASTER = "Penalty";

	public static final String SW_INTEREST_MASTER = "Interest";

	public static final String SW_BILLING_SLAB_MASTER = "SCBillingSlab";
	

	public static final String EMPTY_DEMAND_ERROR_CODE = "EMPTY_DEMANDS";

	public static final String EMPTY_DEMAND_ERROR_MESSAGE = "No demands found for the given bill generate criteria";
	
	public static final String DEMAND_CANCELLED_STATUS = DemandStatus.CANCELLED.toString();
	
	public static final String CONSUMER_CODE_SEARCH_FIELD_NAME = "consumerCode=";
	
	public static final String SW_CONSUMER_CODE_SEPARATOR = ":";
	
	public static final String EG_SW_INVALID_DEMAND_ERROR = "EG_SW_INVALID_DEMAND_ERROR";
	public static final String EG_SW_INVALID_DEMAND_ERROR_MSG = " Bill cannot be generated for previous assessments in a year, please use the latest assesmment to pay";
	

	/**
	 * Time Taxes Config
	 */
	public static final String SW_TIME_REBATE = "SW_TIME_REBATE";

	public static final String SW_TIME_INTEREST = "SW_TIME_INTEREST";

	public static final String SW_TIME_PENALTY = "SW_TIME_PENALTY";

	public static final String SW_WATER_CESS = "SW_WATER_CESS";

	public static final String SW_CHARGE = "SW_CHARGE";
	
	
	/**
	 * data fields
	 */
	public static final String FROMFY_FIELD_NAME = "fromFY";

	public static final String ENDING_DATE_APPLICABLES = "endingDay";

	public static final String STARTING_DATE_APPLICABLES = "startingDay";
	
	
	public static final String MAX_AMOUNT_FIELD_NAME = "maxAmount";

	public static final String MIN_AMOUNT_FIELD_NAME = "minAmount";

	public static final String FLAT_AMOUNT_FIELD_NAME = "flatAmount";

	public static final String RATE_FIELD_NAME = "rate";
	
	
	/*
	 * bigdecimal values
	 */

	public static final BigDecimal HUNDRED = BigDecimal.valueOf(100);
	
	
	public static final Long TIMEZONE_OFFSET = 19800000l;
	
	public static final String SW_Round_Off = "SW_Round_Off";
	
	public static final String flatRateCalculationAttribute = "Flat";
	
	public static final String meteredConnectionType = "Metered";
	
	public static final String nonMeterdConnection = "Non Metered";
	
	public static final String noOfWaterClosets = "No. of water closets";
	
	public static final String noOfToilets = "No. of toilets";
	
	public static final List<String> TAX_APPLICABLE = Collections.unmodifiableList(Arrays.asList(SW_CHARGE));
	
	public static final String DAYA_APPLICABLE_NAME = "applicableAfterDays";
	
	public static final String Demand_End_Date_String = "demandEndDateMillis";
	
	public static final String Demand_Expiry_Date_String = "demandExpiryDate";
	
	public static final String JSONPATH_ROOT_FOR_BilingPeriod = "$.MdmsRes.sw-services-calculation.billingPeriod";
	
	public static final String BillingPeriod = "billingPeriod";
	
	public static final String ConnectionType = "connectionType";
	
	public static final String SW_MODULE = "sw-services-calculation";
	
	public static final String Demand_Generate_Date_String = "demandGenerationDateMillis";
	
	public static final String Quaterly_Billing_Period = "quaterly";
	
	public static final String Monthly_Billing_Period = "monthly";
	
	public static final String Billing_Cycle_String="billingCycle";
	
    public static final String MODULE = "rainmaker-tl";

    public static final String NOTIFICATION_LOCALE = "en_IN";
    

    // ACTION_STATUS combinations for notification

    public static final String ACTION_STATUS_INITIATED = "INITIATE_INITIATED";

    public static final String ACTION_STATUS_APPLIED  = "APPLY_APPLIED";

    public static final String ACTION_STATUS_APPROVED  = "APPROVE_PENDINGPAYMENT";

    public static final String ACTION_STATUS_REJECTED  = "REJECT_REJECTED";

    public static final String ACTION_STATUS_FIELDINSPECTION  = "FORWARD_FIELDINSPECTION";

    public static final String ACTION_CANCEL_CANCELLED  = "CANCEL_CANCELLED";

    public static final String ACTION_STATUS_PAID  = "PAID";

}
