package com.dynatrace.AWSCloudwatchRDS.Constants;

public interface IConstants
{
	// Plugin input configuration variables
	public static final String ACCESS_KEY = "accessKey";
	public static final String SECRET_KEY = "secretKey";
	public static final String AWS_REGION = "awsRegion";
	public static final String STATS_TYPE = "statsType"; // Signifies the Use Case #. See Github README.
	
	//public static final String FUNCTION_NAME = "lambdaFunctionName"; // TODO
	public static final String DATA_GRANULARITY = "dataGranularity";
	public static final String MEASURE_GROUP_NAME = "AWS RDS Cloudwatch Metrics";
	
	// Aggregation
	public static final String AGGREGATION_MINIMUM = "Minimum";
	public static final String AGGREGATION_AVERAGE = "Average";
	public static final String AGGREGATION_MAXIMUM = "Maximum";
	public static final String AGGREGATION_SUM = "Sum";
	public static final String AGGREGATION_SAMPLE_COUNT = "SampleCount";
	public static final String DB_INSTANCE_INPUT = "dbInstanceInput"; //TODO
	
	// AWS constants
	public static final String AWS_NAMESPACE = "AWS/RDS";
	public static final String DB_DIMENSION_INPUT = "DBDimensionInput"; //Dimension Value (use for use cases #2, #3 & #4)
	
	/*
	 * Data Granularities
	 * Possible Values
	 * "1 Minute" | "5 Minutes" | "10 Minutes" | "15 Minutes" | "30 Minutes" | "1 Hour"
	 */
	public static final String DATA_GRANULARITY_1MIN = "1 Minute";
	public static final String DATA_GRANULARITY_5MINS = "5 Minutes";
	public static final String DATA_GRANULARITY_10MINS = "10 Minutes";
	public static final String DATA_GRANULARITY_15MINS = "15 Minutes";
	public static final String DATA_GRANULARITY_30MINS = "30 Minutes";
	public static final String DATA_GRANULARITY_1HOUR = "1 Hour";
	
	
	/* Use Cases
	 * Use Case #1 - Across all DBs
	 * Use Case #2 - Statistics per DB (eg. my-db-instance)
	 * Use Case #3 - Statistics per DB Engine (eg. mysql)
	 * Use Case #4 - Statistics per DB Class (eg. db.t2.micro)
	 */
	
	public static final String ALL_RDS_STATS = "Statistics for all RDS Instances"; //Use Case #1
	public static final String PER_DB_RDS_STATS = "Statistics per DB (eg. my-db-instance)"; //Use Case #2
	public static final String PER_DB_ENGINE_STATS = "Statistics per DB Engine (eg. mysql)"; //Use Case #3
	public static final String PER_DB_CLASS_STATS = "Statistics per DB Class (eg. db.t2.micro)"; //Use Case #4
	
	public static final String DIMENSION_NAME_DB_INSTANCE_ID = "DBInstanceIdentifier"; // Use for Use Case #2
	public static final String DIMENSION_NAME_DB_ENGINE_NAME = "EngineName"; // Use for Use Case #3
	public static final String DIMENSION_NAME_DB_CLASS = "DatabaseClass"; // Use for Use Case #4
	
}
